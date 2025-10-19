package com.techlab.pre_entrega;

import com.techlab.pre_entrega.entidades.Producto;
import com.techlab.pre_entrega.servicios.PedidoService;
import com.techlab.pre_entrega.servicios.ProductoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        ProductoService productoService = new ProductoService();
        PedidoService pedidoService = new PedidoService();
        System.out.println("\"Bienvenido/a al sistema de gestión de TechLab.");
        do{
            System.out.println("----------------------------\n" +
                    "Por favor, elija una opción: \n" +
                    "1) Agregar producto\n" +
                    "2) Listar productos\n" +
                    "3) Buscar/Actualizar producto\n" +
                    "4) Eliminar producto\n" +
                    "5) Crear un pedido\n" +
                    "6) Listar pedidos\n" +
                    "7) Salir\n"
            );
            try{
                eleccion = entrada.nextInt();
                entrada.nextLine();
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("Ingrese el nombre del producto.");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese el precio del producto.");
                        double precio = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.println("Ingrese la cantidad de stock del producto.");
                        int stock = entrada.nextInt();
                        entrada.nextLine();
                        Producto producto = new Producto(nombre, precio, stock);
                        productoService.agregarProducto(producto);
                        System.out.println("El producto se ha agregado exitosamente.");
                    }
                    case 2 -> {
                        System.out.println("Los productos ingresados hasta el momento son: ");
                        productoService.listarProductos();
                    }
                    case 3 -> productoService.buscarActualizarProducto();
                    case 4 -> {
                        System.out.println("Ingrese el ID del producto que desea eliminar.");
                        int id = entrada.nextInt();
                        entrada.nextLine();
                        System.out.printf("Está seguro de querer eliminar el producto con el ID %d?\n" +
                                "1) Sí\n" +
                                "2) No\n", id);
                        int respuesta = entrada.nextInt();
                        entrada.nextLine();
                        if(respuesta == 1){
                            productoService.eliminarProductos(id);
                            System.out.println("El producto se ha eliminado exitosamente.");
                        } else if(respuesta == 2){
                            System.out.println("La operación ha sido cancelada.");
                        } else {
                            System.out.println("Ingrese una opción válida.");
                        }

                    }
                    case 5 -> {
                        System.out.println("Ingrese el ID del producto.");
                        int id = entrada.nextInt();

                        pedidoService.crearPedido();
                    }
                    case 6 -> pedidoService.listarPedidos();
                    case 7 -> System.out.println("Gracias por usar el sistema de gestión de TechLab.");
                    default -> System.out.println("Ingrese un número entre 1 y 7 (inclusive).");
                }
            } catch (NumberFormatException e){
                System.out.println("Error: no ingresó una opción válida.");
            }
        } while (eleccion != 7);
    }
}
