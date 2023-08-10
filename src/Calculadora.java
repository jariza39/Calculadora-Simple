//Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas, 
//como suma, resta, multiplicación y división.
public class Calculadora {
    
    public int suma(int a, int b){
        return a+b;
    }
    
    public int resta(int a, int b){
        return a-b;
    }
    
    public int multiplicacion(int a, int b){
        return a*b;
    }
    
    public int division(int a, int b){
        return a/b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.suma(5, 3));
        System.out.println("Resta: " + calc.resta(5, 3));
        System.out.println("Multiplicación: " + calc.multiplicacion(5, 3));
        System.out.println("División: " + calc.division(5, 3));
    }
}
