
package guia3extra;

import java.util.Scanner;

public class EJextra8 {

    public static void main(String[] args) {
        int num;
        int contPar = 0;
        int contImpar = 0;
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros enteros");
        do {
            num = leer.nextInt();
            if (num % 2 == 0) {
                contPar = contPar + 1;
            } else if (num % 2 != 0) {
                contImpar = contImpar + 1;
            }
            if(num>0){
                cont = cont + 1;
            }
        } while (num % 5 != 0);
        System.out.println("Cantidad de numeros leidos: " +cont);
        System.out.println("Cntidad de numeros pares: " + contPar);
        System.out.println("Cantidad de numeros impares: " + contImpar);
    }
}
    

