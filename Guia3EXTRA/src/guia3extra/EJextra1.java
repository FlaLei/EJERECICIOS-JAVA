
package guia3extra;

import java.util.Scanner;

public class EJextra1 {

    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese los minutos a convertir");
        int min=leer.nextInt();
        
        int dia=1440;
        int hora=60;
        
        System.out.println("Equivalen a  " +min/dia+ " dias, y " +min/hora+ " horas");
    }
    
}
