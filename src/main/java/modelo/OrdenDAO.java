package modelo;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class OrdenDAO {

   

    Conexion con = new Conexion();
    Connection conexion;

    public JSONObject listar() throws IOException, InterruptedException {
        String url = "https://private-anon-c471173bd7-coffeeshop3.apiary-mock.com/services/orders/getOrders";
        HttpResponse<String> response = con.HttpGet(url);

        String stringJson = response.body();
        JSONObject jsonobject;
        JSONArray jsonarray;

        jsonobject = new JSONObject(stringJson);
        return jsonobject;
    }

    public void guardarOrden(String productos, String user) {
        

        Entity payload = Entity.json( productos+ "," + "\"user\": \""+user+"\"}");
        String url = "https://private-anon-c471173bd7-coffeeshop3.apiary-mock.com/services/orders/createOrder";

        Response response = con.HttpAdd(payload, url);

        int estado = response.getStatus();
        if (estado == 200) {

            JOptionPane.showMessageDialog(null, "Orden añadida \n Conexión establecida. \n Body: " + response.readEntity(String.class));
        } else {
            JOptionPane.showMessageDialog(null, "Orden no añadida \n Conexión no establecida. \n Status: " + response.getStatus());
        }
    }

    public void actualizaEstado(String id, String estado) {

        Entity payload = Entity.json("{  \"id\": \"+id+\",  \"state\": \"+estado+\"}");
        String url = "https://private-anon-c471173bd7-coffeeshop3.apiary-mock.com/services/orders/updateOrder";

        Response response = con.HttpPut(payload, url);

        int resp = response.getStatus();
        if (resp == 200) {

            JOptionPane.showMessageDialog(null, "Estado Cambiado\n Conexión establecida. \n Status: " + response.getStatus());
        } else {
            JOptionPane.showMessageDialog(null, "Estado no cambiado \n Conexión no establecida. \n Status: " + response.getStatus());
        }
    }
}
