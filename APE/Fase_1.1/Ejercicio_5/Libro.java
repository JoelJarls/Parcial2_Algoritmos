//clase libro
public class Libro {
    String titulo;
    String autor;
    boolean disponible;

    //constructor 
    public Libro(String t, String a, boolean d) {
        titulo = t;
        autor = a;
        disponible = d;
    }

    //metodo
    public void prestar() {
        disponible = false;
    }
} 
