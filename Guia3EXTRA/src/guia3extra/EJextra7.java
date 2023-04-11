
package guia3extra;
//Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
//y el promedio de n números (n>0). El valor de n se solicitará al principio
//del programa y los números serán introducidos por el usuario. Realice dos 
//versiones del programa, una usando el bucle “while” y otra con el bucle “do - while
import java.util.Scanner;


public class EJextra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numero a operar");
        int n = leer.nextInt();
        int max = 0;
        int num;
        int min= max;

        int suma = 0;
        int cont = 0;
        System.out.println("Ingrese los numeros");
        while (n > 0 && cont < n) {
            num = leer.nextInt();
            
            cont = cont + 1;
            suma = suma + num;
            if (num > max) {
                max = num;
            } else if (num < max) {
                min = num;
            }

        }
        System.out.println("El valor minimo es : " + min);
        System.out.println("El valor maximo es: " + max);
        System.out.println("El promedio de todos los numeros ingresados es: " + (suma * n / cont));

    }
}
