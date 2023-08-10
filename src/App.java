import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Calculadora calcu = new Calculadora();
        System.out.println("Ingrese el primer numero");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scan.nextInt();

        System.out.println("La suma es: " + calcu.suma(num1, num2));
        System.out.println("La resta es: " + calcu.resta(num1, num2));
        System.out.println("La multiplicacion es: " + calcu.multiplicacion(num1, num2));
        System.out.println("La division es: " + calcu.division(num1, num2));
    }
}
