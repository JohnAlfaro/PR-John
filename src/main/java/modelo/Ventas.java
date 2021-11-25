package modelo;

import modelo.Producto;

public class Ventas {

    int cantidad;
    float totalVenta;
    Producto producto;

    public Ventas() {
    }

    public Ventas(int cantidad, float totalVenta, Producto producto) {
        this.cantidad = cantidad;
        this.totalVenta = totalVenta;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
}

