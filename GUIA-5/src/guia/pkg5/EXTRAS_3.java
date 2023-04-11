
package guia.pkg5;

import java.util.Scanner;

/*Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que imprima
el vector*/
public class EXTRAS_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Determine le tamaño del vector");
        int N=leer.nextInt();
        int vector[]=new int[N];
          
        llenarVector(vector);
        mostrarVector(vector);
        }
    
   //Funcion para rellenar vector
    public static void llenarVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*9);
        }
        
    }
    
    //Funcion para mostrar
    public static void mostrarVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");//salto de linea
    }
 }

