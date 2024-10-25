/*
Crea un programa que llig el contingut d'aquest fitxer de text de 6 línies 
i el bolque en un altre fitxer de text, convertint cada línia a majúscules.
El fitxer contindrà el nom de tots els mòduls en diferents línies.

Llenguatges de Marques
Programació
Bases de Dades
Entorns de Desenrotllament
Sistemes Informàtics
Projecte Intermodular


--> Has de fer servir el mètode toUpperCase de la classe String

*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Activitat14 {
    
    static final String RUTA_FITXER_MODULS = "resources" + File.separatorChar +  "activitat14" + File.separatorChar + "moduls.txt";    
    static final String RUTA_FITXER_MODULS_A_MAJUSC = "resources/activitat14/moduls_majuscules.txt";  // usar per a multiplaraforma: File.separatorChar
    
    
    public static void main(String[] args) throws IOException {
        
        Path fitxerPath = Path.of(RUTA_FITXER_MODULS);
        Path fitxerMajúsculesPath = Path.of(RUTA_FITXER_MODULS_A_MAJUSC);
        
        BufferedReader br = Files.newBufferedReader(fitxerPath);
        BufferedWriter bw = Files.newBufferedWriter(fitxerMajúsculesPath);
        
        String linia;

        System.out.printf("Llegint fitxer: '%s'\n", RUTA_FITXER_MODULS);
        System.out.println("Convertint a majúscules i bolcant a altre fitxer ...\n");
        
        // linia 1  =  Llenguatge de marques
        linia = br.readLine();        
        bw.write(linia.toUpperCase());
        bw.newLine();
        
        // linia 2  =  Programació
        linia = br.readLine();        
        bw.write(linia.toUpperCase());
        bw.newLine();
        
        // linia 3  =  Bases de Dades
        linia = br.readLine();        
        bw.write(linia.toUpperCase());
        bw.newLine();
        
        // linia 4  =  Entorns de Desenrotllament
        linia = br.readLine();        
        bw.write(linia.toUpperCase());
        bw.newLine();
        
        // linia 5  =  Sistemes Informàtics
        linia = br.readLine();        
        bw.write(linia.toUpperCase());
        bw.newLine();
        
        // linia 6  =  Projecte Intermodular
        linia = br.readLine();        
        bw.write(linia.toUpperCase());
        bw.newLine();
       
        br.close();
        bw.close(); 
        
       
        // Mostrem resultat de les operacions d'escriptura al fitxer
        System.out.printf("Fitxer '%s'.  S'ha Creat?: '%b'  (%d bytes)  \n",
                    fitxerMajúsculesPath, 
                    Files.exists(fitxerMajúsculesPath),
                    Files.size(fitxerMajúsculesPath));       
    }
    
}
