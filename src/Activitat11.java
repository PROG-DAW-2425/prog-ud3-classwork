/*
Crea un programa que demane a l'usuari la ruta relativa d'un arxiu (s'assumeix 
que la ruta existeix) i el programa l'ha d'eliminar. 
S'ha d'informar per consola de l'eliminació.

*/


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Activitat11 {
    
    public static void main(String[] args) throws IOException {
        Scanner teclat = new Scanner(System.in);
        
        // usant java.io.File
        // Demanar la ruta de l'arxiu a eliminar
        System.out.println("----- Eliminar un arxiu existent usant 'java.io.File'  -----");
        System.out.print("Introdueix la ruta relativa de l'arxiu a eliminar: ");
        String rutaArxiu = teclat.nextLine();
        
        // Crear objecte File i eliminar l'arxiu
        File arxiu = new File(rutaArxiu);
        boolean estaEliminat = arxiu.delete();
        
        // Mostrar informació de l'operació
        System.out.println("Es va a eliminar l'arxiu: " + arxiu.getPath());
        System.out.println("Operació completada? " + estaEliminat);
        
        
        
        // usant java.nio.files
        // Demanar la ruta de l'arxiu a eliminar
        System.out.println("----- Eliminar un arxiu existent usant 'java.nio.file'  -----");
        System.out.print("Introdueix la ruta relativa de l'arxiu a eliminar: ");
        String nouArxiu = teclat.nextLine();
        
        Path pathArxiu = Path.of(nouArxiu);
        
        estaEliminat = Files.deleteIfExists(pathArxiu);
        
        // Mostrar informació de l'operació
        System.out.println("Es va a eliminar l'arxiu: " + pathArxiu);
        System.out.println("Operació completada? " + estaEliminat);
        
        
        teclat.close();
        
    }
    
            
    
}
