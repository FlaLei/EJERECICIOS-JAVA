
package guia.pkg5;

import java.util.Scanner;

/*Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.*/

public class EXTRAS_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Determine las filas y columnas de la matriz");
        int N=leer.nextInt();
        int M=leer.nextInt();
        int[][]matriz=new int[N][M];
        int suma=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]=(int)(Math.random()*9);
                suma+=matriz[i][j];       //en vez de hacer suma=suma+matriz[i][j]
                System.out.print("["+matriz[i][j]+"]");  //muestro la matriz
            }
            System.out.println("");
        }
        System.out.println("LA SUMA DE TODOS LOS ELEMENTOS ES: "+suma);
       
        
        
        
    }
    
}
