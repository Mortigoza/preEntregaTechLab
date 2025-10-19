public class ClaseCinco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jorge", "jorge@gmail.com");
        Producto producto = new Producto("cafe", 20.0, 2);

        producto.setCantidadEnStock(-10);
        System.out.println(producto.getCantidadEnStock());
    }



    }

