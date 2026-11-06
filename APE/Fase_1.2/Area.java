public class Area {    
    // El original declara int, pero no devuelve un valor.    
    // Se usa double para conservar los decimales    
    // y return para devolver el resultado.    
    public double calcularArea(double base, double altura) {        
        double area = base * altura;        
        return area;    
    }    
    public static void main(String[] args) {        
        Area figura = new Area();        
        double resultado = figura.calcularArea(4.5, 3.0);        
        System.out.println("El área es: " + resultado);    
    } 
}
