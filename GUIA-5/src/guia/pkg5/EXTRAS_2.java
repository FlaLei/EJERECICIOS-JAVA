
package guia.pkg5;

import java.util.Scanner;

/*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
los elementos).*/
public class EXTRAS_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el tamaño de los vectores");
        int N = leer.nextInt();
        int vector1[] = new int[N];
        int vector2[] = new int[N];
        //relleno vector1 y muestra
        System.out.println("VECTOR 1");
        for (int i = 0; i < N; i++) {
            vector1[i] = (int) (Math.random() * 10);
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("");
        //rellena vector2 y muestra
        System.out.println("VECTOR 2");
        for (int j = 0; j < N; j++) {
            vector2[j] = (int) (Math.random() * 10);
            System.out.print("[" + vector2[j] + "]");
        }
        System.out.println("");
        int cont = 0;
        for (int k = 0; k < N; k++) {
            if (vector1[k] == vector2[k]) {
                cont++;
            } else {
                System.out.println("Se detectó diferencias");
                break;
            }
        }
        if (cont == N) {
            System.out.println("Los vectores son iguales");

        }
    }
}

