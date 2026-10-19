public class MascotaObjeto {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 4, 25.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.2);
        Mascota m3 = new Mascota("Rocky", "Perro", 6, 18.0);

        //Mascota 1
        System.out.print(m1.nombre + " : " + m1.especie + " : " + m1.peso);
        if (m1.peso > 20.0) {
            System.out.print(" - Revisar peso");
        }
        System.out.println();

        //Mascota 2
        System.out.print(m2.nombre + " : " + m2.especie + " : " + m2.peso);
        if (m2.peso > 20.0) {
            System.out.print(" - Revisar peso");
        }
        System.out.println();

        //Mascota 3
        System.out.print(m3.nombre + " : " + m3.especie + " : " + m3.peso);
        if (m3.peso > 20.0) {
            System.out.print(" - Revisar peso");
        }
        System.out.println();

        // Asignación de referencia
        Mascota m4 = m1;

        // Modificar edad a traves de m4
        m4.edad = m4.edad + 1;

        // Imprimir la edad de m1
        System.out.println("\nEdad de m1 despues de modificar m4: " + m1.edad);
        
        /* En Java, las variables que guardan objetos (como m1 y m4) no guardan el objeto directamente
         * sino una referencia donde está alojado el objeto.
         * Al hacer Mascota m4 = m1 no se crea un nuevo objeto ni una copia independiente 
         * sino que m4 pasa a apuntar exactamente al mismo objeto en memoria que m1por lo tanto cualquier cambio hecho en los atributos a traves de m4
         * afectara directamente a m1, ya que ambas variables hacen referencia al mismo objeto. */
         
    }
}
