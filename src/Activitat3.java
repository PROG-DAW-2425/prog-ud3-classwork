
import java.util.Scanner;

// multiplicar 3 números reals que li preguntem a l'usuari
public class Activitat3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3;
        
        System.out.println("Introdueix 3 números amb decimals(, pel decimal): ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        double mult = num1 * num2 * num3;

        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + mult);

        
        scanner.close();
    }

}
