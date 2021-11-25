package modelo;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProductoDAO {

    Conexion con = new Conexion();
    Connection conexion;

    public JSONObject listar() throws IOException, InterruptedException {
        String url = "https://iitd7euw75.execute-api.us-east-1.amazonaws.com/services/products/getProducts";
        HttpResponse<String> response = con.HttpGet(url);

        String stringJson = response.body();
        JSONObject jsonobject;
        JSONArray jsonarray;

        jsonobject = new JSONObject(stringJson);
        return jsonobject;
    }

    public Producto buscar(int j) {
        Producto p = new Producto();
        return p;
    }

    public void añadir(Object[] o) {

        String name = (String) o[0];
        String image = (String) o[1];
        var price = Integer.parseInt(o[2].toString());

        Entity payload = Entity.json("{  \"name\": \""+name+"\",  \"image\": \""+image+"\",  \"price\": "+price+"}");
        String url = "https://private-anon-c471173bd7-coffeeshop3.apiary-mock.com/services/products/createProduct";

        Response response = con.HttpAdd(payload, url);

        int estado = response.getStatus();
        if (estado == 200) {

            JOptionPane.showMessageDialog(null, "Producto añadido \n Conexión establecida. \n Body: " + response.readEntity(String.class));
        } else {
            JOptionPane.showMessageDialog(null, "Producto no añadido \n Conexión no establecida. \n Status: " + response.getStatus());
        }
    }

    public void actualizar(Object[] o) {
        Entity payload = Entity.json("{  \"image\": \"1.jpg\",  \"price\": "+ o[2] +",  \"id\": \""+o[0]+"\",  \"name\": \""+o[1]+"\"}");
        String url = "https://private-anon-c471173bd7-coffeeshop3.apiary-mock.com/services/products/updateProduct";

        Response response = con.HttpPut(payload, url);

        int estado = response.getStatus();
        if (estado == 200) {

            JOptionPane.showMessageDialog(null, "Actualizar \n Conexión establecida. \n Status: " + response.getStatus());
        } else {
            JOptionPane.showMessageDialog(null, "Actualizar \n Conexión no establecida. \n Status: " + response.getStatus());
        }
    }

    public void eliminar() {

        String url = "https://private-anon-c471173bd7-coffeeshop3.apiary-mock.com/services/products/deleteProduct";

        Response response = con.HttpDelete(url);

        int estado = response.getStatus();
        if (estado == 200) {

            JOptionPane.showMessageDialog(null, "Eliminar \n Conexión establecida. \n Status: " + response.getStatus());
        } else {
            JOptionPane.showMessageDialog(null, "Eliminar \n Conexión no establecida. \n Status: " + response.getStatus());
        }

    }
}
