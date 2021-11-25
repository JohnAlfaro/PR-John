package modelo;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public class VentasDAO {

    Producto producto = new Producto();
    ProductoDAO pdao = new ProductoDAO();

    public Ventas buscarVentasPorOrden(String IdProd, int cantidad) throws IOException, InterruptedException {
        Ventas venta = new Ventas();
        venta.setCantidad(cantidad);

        JSONObject jsonobject = pdao.listar();
        JSONArray jsonarray = jsonobject.getJSONArray("items");

        int cont = 0;

        while (cont < jsonarray.length()) {
            JSONObject jo = jsonarray.getJSONObject(cont);

            if (jo.getString("id").equals(IdProd)) {
                float precio = jo.getInt("price");
                Producto producto1 = new Producto();
                venta.setTotalVenta(precio * cantidad);
                producto1.setId(jo.getString("id"));
                producto1.setNombre(jo.getString("name"));
                producto1.setPrecio(precio);
                venta.setProducto(producto);
                break;
            }

            cont++;
        }
        return venta;
    }
}
