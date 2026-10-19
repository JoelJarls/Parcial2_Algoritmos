//clase producto
public class Producto {
    String nombre;
    double precio;
    int stock;

    //constructor 
    public Producto(String n, double p, int s) {
        nombre = n;
        precio = p;
        stock = s;
    }

    //metodo
    public void vender(int cantidad) {
        stock = stock - cantidad;
    }
}
