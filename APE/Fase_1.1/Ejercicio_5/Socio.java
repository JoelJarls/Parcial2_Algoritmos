//clase socio
public class Socio {
    String nombre;
    int librosPrestados;

    //constructor
    public Socio(String n, int lp) {
        nombre = n;
        librosPrestados = lp;
    }

    //metodo
    public void registrarPrestamo() {
        librosPrestados = librosPrestados + 1;
    }
}
