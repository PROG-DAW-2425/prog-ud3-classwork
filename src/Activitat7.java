
/* 
Activitat7: Implementa un programa que:

- Sol·licite a l'usuari el seu nom de pila (no pot haver-hi espais en blanc) i la seua edat i ho mostre tot per pantalla (usant printf). 
- Sol·licite a l'usuari tres números reals, calcule el seu producte, i el mostre en els següents formats i aplicant en la consola els colors i/o estils indicats: 
  -Format decimal amb dos decimals (fons negre, color de text blanc i en negreta) 
  -Format científic (fons verd, color de text roig i subratllat) 
  -Format hexadecimal (fons magenta, color de text cian, i subratllat) 
  -Format amb 5 dígits com a mínim de la part sencera i 3 de la part decimal (combinació que desitges). 

*/

import java.util.Scanner;


public class Activitat7 {
    // Codis ANSI per a colors i estils
    public static final String RESET = "\u001B[0m";
    public static final String NEGRETA = "\u001B[1m";
    public static final String SUBRATLLAT = "\u001B[4m";
    
    public static final String FONS_NEGRE = "\u001B[40m";
    public static final String FONS_VERD = "\u001B[42m";
    public static final String FONS_MAGENTA = "\u001B[45m";
    
    public static final String FONS_ROIG = "\u001B[41m";
    public static final String FONS_CYAN = "\u001B[46m";
    
    public static final String TEXT_BLANC = "\u001B[37m";
    public static final String TEXT_ROIG = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sol·licitar nom i edat
        System.out.print("Introdueix el teu nom de pila (sense espais): ");
        String nom = scanner.next();
        System.out.print("Introdueix la teua edat: ");
        int edat = scanner.nextInt();

        // Mostrar nom i edat
        System.out.printf("Nom: %s, Edat: %d%n%n", nom, edat);

        // Sol·licitar tres números reals
        System.out.print("Introdueix tres números reals: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Calcular el producte
        double producte = num1 * num2 * num3;

        // Mostrar el producte en diferents formats
        System.out.printf("%s%s%sProducte en format decimal amb dos decimals: %.2f%s\n", 
                          FONS_CYAN, TEXT_BLANC, NEGRETA, producte, RESET);  // EL CANVIEM PER CYAN, SI EL NEGRE NO ES VEU
        
        System.out.printf("%s%s%sProducte en format científic: %e%s\n", 
                          FONS_VERD, TEXT_ROIG, SUBRATLLAT, producte, RESET);
        
        System.out.printf("%s%s%sProducte en format hexadecimal: %a%s\n", 
                          FONS_MAGENTA, TEXT_CYAN, SUBRATLLAT, producte, RESET);
        
        System.out.printf("%s%sProducte amb 5 dígits com a mínim de la part sencera i 3 de la part decimal: %s%s%s%09.3f\n", 
                          FONS_ROIG, TEXT_BLANC, RESET, FONS_NEGRE, TEXT_BLANC, producte);

        scanner.close();
    }
}

