
package ej10_guia3;

import java.util.Scanner;

public class EJ10_GUIA3 {

    public static void main(String[] args) {
       
      
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entre 1 y 20");

        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print(num+" ");

            for (int j = 0; j < num; j++) {
              System.out.print("*");
           }
           System.out.println("");
        }

    }
}

    
    

