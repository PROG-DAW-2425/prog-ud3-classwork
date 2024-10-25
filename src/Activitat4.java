


// preguntar les monedes que tenim de: 2ct, 5ct, 10ct, 20ct, 50ct, 1euro, 2euros
// imprimir els euros que tenim i
import java.util.Scanner;


public class Activitat4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantes monedes tens de 2 cèntims? ");
        int monedes2Centims = scanner.nextInt();
        
        System.out.print("Quantes monedes tens de 5 cèntims? ");
        int monedes5Centims = scanner.nextInt();
	
	System.out.print("Quantes monedes tens de 10 cèntims? ");
        int monedes10Centims = scanner.nextInt();
	
        System.out.print("Quantes monedes tens de 20 cèntims? ");
        int monedes20Centims = scanner.nextInt();
	
        System.out.print("Quantes monedes tens de 50 cèntims? ");
        int monedes50Centims = scanner.nextInt();
	
        System.out.print("Quantes monedes tens de 1 € ? ");
        int monedes1Euro = scanner.nextInt();
	
	System.out.print("Quantes monedes tens de 2 € ? ");
        int monedes2Euros = scanner.nextInt();
	
        
	
	long totalCentims = monedes2Centims * 2 + monedes5Centims * 5 + monedes10Centims * 10
                         + monedes20Centims * 20 + monedes50Centims * 50;
		
	long totalEuros = monedes1Euro + monedes2Euros * 2 + totalCentims/100;
	
	totalCentims %= 100;
	
	System.out.println("Tens " + totalEuros + " € i " + totalCentims + " cèntims");
        
        
        scanner.close();
    }
}
