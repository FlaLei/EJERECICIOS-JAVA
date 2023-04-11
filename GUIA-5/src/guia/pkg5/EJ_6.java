
package guia.pkg5;

import java.util.Scanner;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine
si este cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/

public class EJ_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int valor;
        //llenar matriz
        System.out.print("Ingrese los valores de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                valor = leer.nextInt();
                if (valor >= 1 && valor <= 9) {
                    matriz[i][j] = valor;
                }
                while (valor < 1 || valor > 9) {
                    System.out.print("Ingrese numeros del 1 al 9");
                    valor = leer.nextInt();
                }
            }
        }
        //mostrar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //sumar filas y columnas
        int sumaF;
        int sumaC;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaF = 0;
            sumaC = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaF += matriz[i][j];
                sumaC += matriz[j][i];
            }
            if (sumaF == sumaC) {
                cont++;
                System.out.println("suma fila: " + sumaF);
                System.out.println("suma columna: " + sumaC);
            }

        }

        //sumar diagonal principal  
        int sumaD1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    sumaD1 = sumaD1 + matriz[i][j];

                }
            }

        }
        System.out.println("suma diagonal 1: " + sumaD1);

        //sumar diagonal 2
        int sumaD2 = 0;
        int contJ = 0;
        for (int i = matriz.length - 1; i >= 0; i--) {
            sumaD2 = sumaD2 + matriz[i][contJ];
            contJ = contJ + 1;
        }
        System.out.println("suma diagonal 2: " + sumaD2);

        //comparacion
        if (cont == 3 && sumaD1 == sumaD2) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("NO es un cuadrado magico");
        }

    }
}
    

