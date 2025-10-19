import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public double totalCarrito(){
        double total = 0.0;
        for (Producto producto : this.productos) {
            total = total + producto.getPrecio();
        }
        return total;
    }
}
