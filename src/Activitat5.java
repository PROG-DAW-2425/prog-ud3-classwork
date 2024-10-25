// tots els formats i opcions de printf



public class Activitat5 {
     public static void main(String[] args) {
        // chars de conversió
        System.out.println("CARÀCTERS DE CONVERSIÓ:");
        System.out.printf("Enter: %d\n", 1000);
        System.out.printf("Flotant: %.2f\n", 10.346);
        
        System.out.printf("Cadena: %s\n", "Hola món!");
        System.out.printf("Cadena en majúscules: %S\n", "Hola món!");
        
        System.out.printf("Caràcter 'a': %c\n", 'a');
        System.out.printf("Caràcter 'a' en majúscula: %C\n", 'a');
        
        System.out.printf("Enter 255, en Hexadecimal: %x\n", 255);        
        System.out.printf("Float 150.65, en Hexadecimal %a\n", 150.65f); 
        System.out.printf("Float 150.65, en Hexadecimal (majúscules) %A\n", 150.65f); 
        
        System.out.printf("Enter 255, en Hexadecimal majúcules: %X\n", 255);
        System.out.printf("Enter 255, en Hexadecimal amb 0x per davant: %#x\n", 255);     // 0xff    
        
        
        System.out.printf("Num en notació científica: %e\n", 234343434255.989898989989898665757575);
        System.out.printf("Num en notació científica (majúscules): %E\n", 234343434255.989898989989898665757575);
        System.out.printf("Num en notació científica automàtica si és molt gran o xicotet: %g\n\n", 23.5);
        
        // ample i precisió
        System.out.println("WIDTH i PRECISION");
        System.out.printf("Ample de 10 chars: %10d\n", 1234567);
        System.out.printf("Precisió de 2 decimals: %.2f\n", 1.457);
        System.out.printf("Ample de 10 chars i precisió 2 decimals: %10.2f\n\n", 12345.457);
        
        // flags
        System.out.println("FLAGS:");
        System.out.printf("Alineat esquerra dins les 10 posicions d'ample: ==>>%-10d<<==\n", 1000); // alineat a l'esquerra de les 10 posicions que ocupa
        System.out.printf("Mostra Signe + si és positiu: %+d\n", 1000);  // mostrar sempre el signe + si és positiu
        System.out.printf("Mostra num entre () si és negatiu: %(f\n", -1000.567);  // mostrar sempre el signe + si és positiu
        System.out.printf("Reomplir amb zeros fins les 10 posicions: %010f\n", 10.56);
        System.out.printf("Separador de milers: %,f\n\n", 1234567.25f);
        
        System.out.println("COMBINATS");
        System.out.printf("Combinat per a -343356.6767676: %,(+015.3f\n", -343356.6767676);
        System.out.printf("Combinat per a  343356.6767676: %,(+015.3f\n\n", 343356.6767676);
        
        
        
    }
}
