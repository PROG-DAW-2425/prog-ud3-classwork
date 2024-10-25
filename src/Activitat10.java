/*
Crea un programa que demane a l'usuari la ruta relativa d'un directori 
(la ruta s'assumeix que no existeix). El programa ha de crear el nou directori
en la ruta especificada, informant per consola de l'èxit.
 */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Activitat10 {

    public static void main(String[] args) throws IOException {

        Scanner teclat = new Scanner(System.in);

        // Amb java.io.File
        // Demanar la ruta a l usuari        
        System.out.println("----- Creem un directori usant java.io.File ------ ");
        System.out.print("Introdueix la ruta relativa del directori a crear: ");
        String rutaDirectori = teclat.nextLine();

        // Crear objecte File corresponent a la ruta
        File directori = new File(rutaDirectori);
        // Crear directori
        boolean estaCreatDirectori = directori.mkdir();  // si usem mkdirs(), també crea els directoris intermitjos

        // Mostrar missatge de confirmació amb la ruta absoluta
        System.out.println(" Directori: " + directori.getPath()
                         + "\n Creat? " + estaCreatDirectori);

        // Amb java.nio.file
        // Demanar la ruta a l'usuari     
        System.out.println("----- Crear un directori usant java.nio.file ------ ");
        System.out.print("Introdueix la ruta relativa del directori a crear: ");
        String novaRutaDirectori = teclat.nextLine();

        // Crear objecte path del directori, necessitem convertir string a Path
        Path pathRuta = Path.of(novaRutaDirectori);
        // Crear directory
        Path pathDirectori = Files.createDirectory(pathRuta);

        //comprovem que existeix efectivament
        System.out.println(" Directori: " + pathRuta.toString()
                         + "\n Creat? " + Files.isDirectory(pathDirectori));

        teclat.close();

    }

}
