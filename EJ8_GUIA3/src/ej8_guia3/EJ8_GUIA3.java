
package ej8_guia3;

import java.util.Scanner;


public class EJ8_GUIA3 {

    
    public static void main(String[] args) {
       
    Scanner leer= new Scanner(System.in);
    int nota;
       System.out.println("Ingrese una nota entre 0 y 10");
       nota= leer.nextInt();
       while (nota<0 || nota>10){
            System.out.println("Ingrese una nota valida, recuerde de 0 a 10");
            nota= leer.nextInt();
        }
        System.out.println("La nota ingresada es correcta");
    }
    
}
