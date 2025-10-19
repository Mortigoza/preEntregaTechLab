package com.techlab.pre_entrega.entidades;

public class Producto {
    private static int proxId = 1;
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

    public int getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock >= 0){
            this.stock = stock;
        } else {
            System.out.println("No se pueden asignar valores negativos.");
        }

    }
    public Producto(String nombre, double precio, int stock){
        this.idProducto = proxId++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ID= " + this.idProducto +
                ", Nombre = " + this.nombre +
                ", Precio = $" + this.precio +
                ", Stock = " + this.stock +
                '}';
    }
}
