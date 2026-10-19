public class LibroObjeto {
    public static void main(String[] args) {
        
    Libro l1 = new Libro("Cien Anos de Soledad", "Gabriel Garcia Marquez", true);
        Libro l2 = new Libro("Don Quijote", "Miguel de Cervantes", true);
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupery", true);
        Libro l4 = new Libro("Ficciones", "Jorge Luis Borges", true);

        //crear 2 socios )
        Socio s1 = new Socio("Juan", 0);
        Socio s2 = new Socio("Maria", 0);

        //El primer socio presta 2 libros
        l1.prestar();
        s1.registrarPrestamo();
        
        l2.prestar();
        s1.registrarPrestamo();

        //el segundo socio presta 1 libro 
        l3.prestar();
        s2.registrarPrestamo();

        //imprimir estado de cada libro
        System.out.println("ESTADO DE LOS LIBROS");
        
        System.out.print(l1.titulo + " : ");
        if (l1.disponible) {
            System.out.println("Disponible");
        } else {
            System.out.println("Prestado");
        }

        System.out.print(l2.titulo + " : ");
        if (l2.disponible) {
            System.out.println("Disponible");
        } else {
            System.out.println("Prestado");
        }

        System.out.print(l3.titulo + " : ");
        if (l3.disponible) {
            System.out.println("Disponible");
        } else {
            System.out.println("Prestado");
        }

        System.out.print(l4.titulo + " : ");
        if (l4.disponible) {
            System.out.println("Disponible");
        } else {
            System.out.println("Prestado");
        }

        //Imprimir estado de cada socio
        System.out.println("\nESTADO DE LOS SOCIOS");
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);

        //contar cuántos libros quedan
        int disponibles = 0;
        if (l1.disponible) {
            disponibles = disponibles + 1;
        }
        if (l2.disponible) {
            disponibles = disponibles + 1;
        }
        if (l3.disponible) {
            disponibles = disponibles + 1;
        }
        if (l4.disponible) {
            disponibles = disponibles + 1;
        }

        System.out.println("\nLibros disponibles en total: " + disponibles);
    }
}
