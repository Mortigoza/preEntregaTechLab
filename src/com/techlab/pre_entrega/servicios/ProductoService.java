package com.techlab.pre_entrega.servicios;

import com.techlab.pre_entrega.entidades.Producto;

import java.util.ArrayList;

public class ProductoService {
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }
    public void listarProductos(){
        if(listaProductos.isEmpty()){
            System.out.println("Aún no hay productos ingresados.");
        } else {
            for (Producto p : listaProductos){
                System.out.println(p.toString());
            }
        }
    }

    public void buscarActualizarProducto() {
    }

    public void eliminarProductos(int id) {
        int indiceAEliminar = -1;

        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);
            if (producto.getIdProducto() == id) {
                indiceAEliminar = i;
                break;
            }
        }
        listaProductos.remove(indiceAEliminar);
    }
}
