
package ej1_guia3;

import java.util.Scanner;

public class EJ1_GUIA3 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      int num;
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        if(num%2==0){
            System.out.println("EL NUMERO ES PAR");
        }else{
            System.out.println("El numero es IMPAR");
        }
    }
    
}
