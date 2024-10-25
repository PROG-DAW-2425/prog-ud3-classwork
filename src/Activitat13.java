
/*
Crea un programa que llig el següent arxiu en el qual tenim el 
codi, nom i quantitat de productes que hi ha en stock en una botiga en línia. 
A continuació, ha de mostrar el nombre de televisions, monitors i teclats que es tenen i la suma total dels mateixos.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Activitat13 {

    static final String FITXER = "resources/activitat13/productes.txt";
    
    
    public static void main(String[] args) throws IOException {

        // 1.  Obrim fitxer por a lectura
        Path pathFitxer = Path.of(FITXER);
        BufferedReader br = Files.newBufferedReader(pathFitxer);

        
        // 2. LLegim les línies del fitxer per agafar el nom real
        //    i la quantitat de cada producte
        
        String linia;  // per a la lectura de la línia
        String quantitatStr;  // per a la subcadena de la quantitat
                
        int numTelevisions;
        int numMonitors;
        int numTeclats;
        int totalProductes;
        
        int indexPrimeraComa;   // posició de la primera coma en l'string de la línia llegida, per a traure després la subcadena del nom del producte
        int indexUltimaComa;    // posició de la segona coma en l'string de la línia llegida per a traure la subcadena de la quantitat de producte
        
        // linia 1
        br.readLine();  // Ordinador, no el volem, llegim la línia, però no la necessitem
        
        // linia 2
        linia = br.readLine();  // Teclat

        indexPrimeraComa = linia.indexOf(',');
        indexUltimaComa = linia.lastIndexOf(',');

        // subcadena corresponent al nom del producte       
        String nomProducteTeclats = linia.substring(indexPrimeraComa + 1, indexUltimaComa); 
        // subcadena de la quantitat del producte, eliminen blancs amb strip()
        quantitatStr = linia.substring(indexUltimaComa + 1).strip(); 
        
        // convertim l'string de la quantitat a número enter
        numTeclats = Integer.parseInt(quantitatStr);
        
        // linia 3
        br.readLine();   // vídeo-consola, no el volem
        // linia 4
        br.readLine();   // Telèfon, no el volem
        
        // linia 5
        linia = br.readLine();   //  Televisió

        indexPrimeraComa = linia.indexOf(',');
        indexUltimaComa = linia.lastIndexOf(',');

        String nomProducteTv = linia.substring(indexPrimeraComa + 1, indexUltimaComa);        
        quantitatStr = linia.substring(indexUltimaComa + 1);
        numTelevisions = Integer.parseInt(quantitatStr);

        
        // linia 6
        br.readLine();   //  Joystick, no el volem        
        // linia 7
        br.readLine();   //  Joc, no el volem    
        
        // linia 8
        linia = br.readLine();   //  Televisió

        indexPrimeraComa = linia.indexOf(',');
        indexUltimaComa = linia.lastIndexOf(',');

        String nomProducteMonitor = linia.substring(indexPrimeraComa + 1, indexUltimaComa);
        quantitatStr = linia.substring(indexUltimaComa + 1);
        numMonitors = Integer.parseInt(quantitatStr);

        // 3. calculem el total de productes
        totalProductes = numTelevisions + numMonitors + numTeclats;
        
        // 4. Mostrem en pantalla totes les dades        
        System.out.printf("Nombre de '%s': %d\n", nomProducteTeclats, numTeclats);        
        System.out.printf("Nombre de '%s': %d\n", nomProducteTv, numTelevisions);    
        System.out.printf("Nombre de '%s': %d\n", nomProducteMonitor, numMonitors);
        System.out.printf("TOTAL DE '%s', '%s' i '%s': %d\n", 
                nomProducteTeclats,
                nomProducteTv,
                nomProducteMonitor,
                totalProductes);

        // 5. Tanquem stream (associat al fitxer)
        br.close();

    }

}