
package GUIA_3;

import java.util.Scanner;


public class EJ4 {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase que comience con A");
        String frase=leer.nextLine();
        String Letra=frase.substring(0,1);
        if(Letra.equals("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
}
