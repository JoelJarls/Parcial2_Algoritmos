public class CuentaObjeto {
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("Carlos", 200.0);
        Cuenta c2 = new Cuenta("Ana", 350.0);

        int mesesC1 = 0;
        int mesesC2 = 0;

        //proceso para la Cuenta 1
        System.out.println("EVOLUCION CUENTA 1 (" + c1.titular + ")");
        while (c1.saldo < 500.0) {
            c1.depositar(50.0);
            mesesC1 = mesesC1 + 1;
            System.out.println("Mes " + mesesC1 + " - " + c1.titular + " : " + c1.saldo);
        }

        System.out.println();

        //proceso para la Cuenta 2
        System.out.println("EVOLUCION CUENTA 2 (" + c2.titular + ")");
        while (c2.saldo < 500.0) {
            c2.depositar(50.0);
            mesesC2 = mesesC2 + 1;
            System.out.println("Mes " + mesesC2 + " - " + c2.titular + " : " + c2.saldo);
        }

        //impresion final de meses requeridos
        System.out.println("\nRESULTADO FINAL");
        System.out.println(c1.titular + " necesito " + mesesC1 + " meses para alcanzar los 500.");
        System.out.println(c2.titular + " necesito " + mesesC2 + " meses para alcanzar los 500.");
    }
}
