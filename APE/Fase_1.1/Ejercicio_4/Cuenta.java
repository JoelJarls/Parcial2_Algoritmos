//clase
public class Cuenta {
    String titular;
    double saldo;

    //constructor 
    public Cuenta(String t, double s) {
        titular = t;
        saldo = s;
    }

    //metodo 
    public void depositar(double monto) {
        saldo = saldo + monto;
    }
}
