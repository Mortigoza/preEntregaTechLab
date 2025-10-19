public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;
    static int cantidadProductos=0;

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

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public static int getCantidadProductos() {
        return cantidadProductos;
    }

    public static void setCantidadProductos(int cantidadProductos) {
        Producto.cantidadProductos = cantidadProductos;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0){
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("No se pueden asignar valores negativos.");
        }

    }

    public Producto(String nombre, double precio, int cantidadEnStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        Producto.cantidadProductos ++;
    }

    public void mostrarInfo(String nombre, double precio, int cantidadEnStock){
        System.out.println();
    }
}
