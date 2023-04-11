
package guia.pkg5;

import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.*/

public class EXTRAS_1 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("Establezca el tamaño del vector");
       int N =leer.nextInt();
       int vector[]=new int[N];
       int suma=0;
        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < N; i++) {
            vector[i]=leer.nextInt();
           suma=suma+ vector[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos es: "+suma);
    }
    
}
