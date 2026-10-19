public class ProductoObjeto {
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Cuaderno", 2.50, 6);
        Producto p2 = new Producto("Esfero", 0.50, 10);
        Producto p3 = new Producto("Mochila", 25.00, 4);
        Producto p4 = new Producto("Regla", 1.20, 7);

        
        System.out.println("LISTA DE PRODUCTOS");
        System.out.println(p1.nombre + " : " + p1.precio);
        System.out.println(p2.nombre + " : " + p2.precio);
        System.out.println(p3.nombre + " : " + p3.precio);
        System.out.println(p4.nombre + " : " + p4.precio);

        
        p1.vender(3);
        p4.vender(3);

        System.out.println("ESTADO DEL INVENTARIO TRAS LAS VENTAS");

        // Producto 1
        System.out.print(p1.nombre + " : " + p1.precio + " (Stock: " + p1.stock + ")");
        if (p1.stock < 5) {
            System.out.print(" - Reponer");
        }
        System.out.println();

        // Producto 2
        System.out.print(p2.nombre + " : " + p2.precio + " (Stock: " + p2.stock + ")");
        if (p2.stock < 5) {
            System.out.print(" - Reponer");
        }
        System.out.println();

        // Producto 3
        System.out.print(p3.nombre + " : " + p3.precio + " (Stock: " + p3.stock + ")");
        if (p3.stock < 5) {
            System.out.print(" - Reponer");
        }
        System.out.println();

        // Producto 4
        System.out.print(p4.nombre + " : " + p4.precio + " (Stock: " + p4.stock + ")");
        if (p4.stock < 5) {
            System.out.print(" - Reponer");
        }
        System.out.println();

        // aqui se calcula el valor total del inventario 
        double totalInventario = (p1.precio * p1.stock) 
                               + (p2.precio * p2.stock) 
                               + (p3.precio * p3.stock) 
                               + (p4.precio * p4.stock);

        System.out.println("\nValor total del inventario: $" + totalInventario);
    
    }
}
