
package GUIA_3;

import java.util.Scanner;


public class EJ5 {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite= leer.nextInt();
        int suma =0;
        System.out.println("Ingrese numeros positivos");
        
        do{
           int num=leer.nextInt();
           suma=suma+num;
        }while(suma<limite);
        System.out.println(suma);
    }
    
}
