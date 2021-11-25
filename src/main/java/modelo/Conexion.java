package modelo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

public class Conexion {

    String url = "jdbc:mysql://localhost:3306/bd_ordenes";
    String user = "root";
    String pass = "";
    Connection conection;

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }

        try {
            conection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conection;
    }

    public HttpResponse<String> HttpGet(String uri) throws InterruptedException, IOException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(uri))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response;

    }

    public Response HttpAdd(Entity payload, String url) {

        Client client = ClientBuilder.newClient();

        Response response = client.target(url)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .put(payload);

        return response;

    }

    public Response HttpPut(Entity payload, String url) {

        Client client = ClientBuilder.newClient();

        Response response = client.target(url)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .post(payload);

        return response;

    }

    public Response HttpDelete(String url) {

        Client client = ClientBuilder.newClient();

        Response response = client.target(url)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .delete();

        return response;

    }
}
