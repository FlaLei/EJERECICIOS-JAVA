
package guia3extra;
//Realice un programa para que el usuario adivine el resultado de una multiplicación 
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al

import java.util.Scanner;

//usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta 
//se debe permitir al usuario ingresar su respuesta nuevamente. 
//Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

public class EJextra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int multiplicacion = num1 * num2;
        int resultado;
        System.out.println("Adivina el resultado de " + num1 + "*" + num2);

        do {
            resultado = leer.nextInt();

            if (multiplicacion == resultado) {
                System.out.println("ES CORRECTO");
            } else {

                System.out.println("ES INCORRECTO, intente nuevamente");
            }

        } while (multiplicacion != resultado);

    }

}

