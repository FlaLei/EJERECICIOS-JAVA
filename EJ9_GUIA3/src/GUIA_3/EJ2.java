
package GUIA_3;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {//psvm +tab
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        
        }else {
            System.out.println("INCORRECTO");
        }
    }    
}
