package com.techlab.pre_entrega.servicios;

import com.techlab.pre_entrega.entidades.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public ProductoService() {
        Producto prod1 = new Producto("Gaseosa", 2000.00, 50);
        this.listaProductos.add(prod1);
        Producto prod2 = new Producto("Pan lactal", 2500.00, 10);
        this.listaProductos.add(prod2);
    }


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

    public void actualizarProducto(Producto productoAActualizar, Scanner entrada) {
        System.out.println("\n--- Producto a actualizar ---");
        System.out.println(productoAActualizar.toString());
        System.out.println("\n¿Qué desea actualizar?");
        System.out.println("1) Precio \n" +
                "2) Stock\n" +
                "3) Cancelar");
        try {
            int opcionActualizar = entrada.nextInt();
            entrada.nextLine();

            switch (opcionActualizar) {
                case 1 -> {
                    System.out.print("Ingrese el nuevo precio: ");
                    double nuevoPrecio = entrada.nextDouble();
                    productoAActualizar.setPrecio(nuevoPrecio);
                    System.out.println("Precio actualizado.");
                }
                case 2 -> {
                    System.out.print("Ingrese el nuevo stock: ");
                    int nuevoStock = entrada.nextInt();
                    entrada.nextLine();
                    productoAActualizar.setStock(nuevoStock);
                    System.out.println("Stock actualizado.");
                }
                case 3 -> System.out.println("Retornando al menú principal.");
                default -> System.out.println("Opción no válida.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ingrese un valor numérico válido.");
            entrada.nextLine();
        }
    }

    public Producto buscarPorId(int idBuscado) {
        for (Producto p : listaProductos) {
            if (p.getIdProducto() == idBuscado) {
                return p;
            }
        }
        return null;
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
