
package guia_4;

//Crea una aplicación que nos pida un número por teclado y con una función se lo 

import java.util.Scanner;

//pasamos por parámetro para que nos indique si es o no un número primo, debe 
//devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
//17 si es primo.

public class EJ_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

    public static Boolean esPrimo(int num) {

        if (num <= 1) {
            return false;

        } else if (num == 2) {

            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }
}
    
        

    
