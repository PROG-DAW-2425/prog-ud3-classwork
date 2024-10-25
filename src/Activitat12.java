/*
Crea un programa que demane a l'usuari la ruta relativa d'un arxiu 
(s'assumeix que la ruta existeix) i visualitze per consola el nom, la ruta absoluta, 
si es pot escriure, si es pot llegir i si és un directori o un arxiu.

*/


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Activitat12 {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        
        // Amb java.io.File
        // Demanar la ruta de l'arxiu
        System.out.println("----- Mostrar informació d'un arxiu java.io.File ------ ");
        System.out.print("Introdueix la ruta relativa de l'arxiu: ");
        String rutaArxiu = teclat.nextLine();
        
        // Crear objecte File i obtindre la informació
        File arxiu = new File(rutaArxiu);
       
        
        // Mostrar tota la informació demanada
        System.out.println("\n\tInformació de l'arxiu:");
        System.out.println("\tNom: " + arxiu.getName());
        System.out.println("\tRuta absoluta: " + arxiu.getAbsolutePath());
        System.out.println("\tTenim permís per a escriure? " + arxiu.canWrite());
        System.out.println("\tTenim permís per a llegir? " + arxiu.canRead());
        System.out.println("\tÉs un directori ? " + arxiu.isDirectory());
        System.out.println("\tÉs un arxiu? " + arxiu.isFile());
        
        
        
        // Amb java.io.File
        // Demanar la ruta de l'arxiu
        System.out.println("----- Mostrar informació d'un arxiu java.nio.file ------ ");
        System.out.print("Introdueix la ruta relativa de l'arxiu: ");
        String novaRutaArxiu = teclat.nextLine();
        
        Path pathNouArxiu = Path.of(novaRutaArxiu);
        
        // Mostrar tota la informació demanada
        System.out.println("\n   Informació de l'arxiu:");
        System.out.println("\tNom: " + pathNouArxiu.getFileName());
        System.out.println("\tRuta absoluta: " + pathNouArxiu.toAbsolutePath());
        System.out.println("\tTenim permís per a escriure? " + Files.isWritable(pathNouArxiu));
        System.out.println("\tTenim permís per a llegir? " + Files.isReadable(pathNouArxiu));
        System.out.println("\tÉs un directori ? " + Files.isDirectory(pathNouArxiu));
        System.out.println("\tÉs un arxiu? " + Files.isRegularFile(pathNouArxiu));
        
        
        teclat.close();
        
        
        // per a saber mes: Rutes relatives entre 2 Path
        /*
        
        System.out.println("user dir: " + System.getProperty("user.dir") );
        
        Path directoriActual = Path.of(System.getProperty("user.dir"));
        Path rutaDirectori = Path.of("resources/kk");
        
        Path rutaRelativa = directoriActual.relativize(rutaDirectori.toAbsolutePath());
        
        System.out.println("Ruta relativa entre 'user.dir' i /home/batoi/..../resources/kk : " + rutaRelativa);   
        
        // imprimeix:  
        // user dir: /home/batoi/NetBeansProjects/PROG-UD2-CLASSWORK
        // Ruta relativa: resources/kk
        
        */
        
    }
    
            
    
}
