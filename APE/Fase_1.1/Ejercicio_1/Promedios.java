public class Promedios {
    public static void main (String[] args) {
        
        int aprobados = 0;

        // Crear 5 instancias
        Estudiante e1 = new Estudiante("Juan", 8.5, 7.0, 9.0);
        Estudiante e2 = new Estudiante("Maria", 4.0, 5.5, 6.0);
        Estudiante e3 = new Estudiante("Carlos", 3.0, 4.0, 2.5);
        Estudiante e4 = new Estudiante("Ana", 7.0, 6.5, 8.0);
        Estudiante e5 = new Estudiante("Luis", 5.0, 5.0, 6.5);

        // Estudiante 1
        e1.calcularPromedio();
        System.out.print(e1.nombre + " : " + e1.promedio);
        if (e1.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e1.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 2
        e2.calcularPromedio();
        System.out.print(e2.nombre + " : " + e2.promedio);
        if (e2.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e2.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 3
        e3.calcularPromedio();
        System.out.print(e3.nombre + " : " + e3.promedio);
        if (e3.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e3.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 4
        e4.calcularPromedio();
        System.out.print(e4.nombre + " : " + e4.promedio);
        if (e4.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e4.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 5
        e5.calcularPromedio();
        System.out.print(e5.nombre + " : " + e5.promedio);
        if (e5.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e5.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Impresion final
        System.out.println("\nTotal de estudiantes aprobados: " + aprobados);
    }
}
