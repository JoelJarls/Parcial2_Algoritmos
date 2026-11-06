public class Calculadora2 {    
  public double calcularPromedio(double n1,                                   
                                 double n2,                                   
                                 double n3) {        
    double promedio = (n1 + n2 + n3) / 3;        
    return promedio;    
  }    
  
  public static void main(String[] args) {        
    Calculadora2 calculadora = new Calculadora2();        
    double resultado =                
      calculadora.calcularPromedio(8, 9, 10);        
    System.out.println("Promedio: " + resultado);    
  } 
}
