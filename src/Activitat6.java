// Activitat6:
// Sense utilitzar cap ajuda de l’entorn, indica quin resultat tindrem 
// per pantalla després d'executar el següent codi: 

// Eixida del programa:
/*
1.0/3.0 = 0,333 
1.0/3.0 = 0,33333 
1.0/2.0 = 00000,500 
1000/3.0 = 3,3e+02
3.0/4567.0 = 6,569e-04 
-1.0/0.0 = -Infinity 
0.0/0.0 =   NaN 
pi = 3,142 
*/

public class Activitat6 {
    public static void main(String[] args) {
        double q = 1.0/3.0;
        
        System.out.printf("1.0/3.0 = %5.3f \n", q);
        System.out.printf("1.0/3.0 = %7.5f \n", q);
        
        q = 1.0/2.0;
        System.out.printf("1.0/2.0 = %09.3f \n", q);
        
        q = 1000.0/3.0;
        System.out.printf("1000/3.0 = %7.1e\n", q);
        
        q = 3.0/4567.0;
        System.out.printf ("3.0/4567.0 = %7.3e \n", q);
        
        q = -1.0/0.0;
        System.out.printf("-1.0/0.0 = %7.2e \n", q);
        
        q = 0.0/0.0;
        System.out.printf("0.0/0.0 = %5.2e \n", q);
        
        System.out.printf ("pi = %5.3f \n", Math.PI);
        
    }
}
