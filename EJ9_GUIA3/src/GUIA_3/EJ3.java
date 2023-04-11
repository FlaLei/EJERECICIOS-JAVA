
package GUIA_3;

import java.util.Scanner;


public class EJ3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase o plabra de 8 letras");
        String frase=leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
