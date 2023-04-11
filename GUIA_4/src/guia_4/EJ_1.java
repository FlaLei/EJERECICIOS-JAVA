
package guia_4;

import java.util.Scanner;

public class EJ_1 {
//Crea una aplicación que le pida dos números al usuario y este pueda elegir
//entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
//para cada operación matemática y deben devolver sus resultados para imprimirlos
//en el main. 

   
    public static void main(String[] args) {
       int opcion = 0, n1, n2;
       Scanner leer = new Scanner(System.in);
       while(opcion != 5){
       System.out.println("ingrese el primer valor");
       n1 = leer.nextInt();
       System.out.println("ingrese el segundo valor");
       n2 = leer.nextInt();
        System.out.println("Seleccione la operacion:");
        System.out.println("1- sumar");
        System.out.print("");
        System.out.println("2- restar");
        System.out.print("");
        System.out.println("3- multiplicar");
        System.out.print("");
        System.out.println("4- dividir");
        System.out.print("");
        System.out.println("5- salir");
        System.out.print("");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                suma(n1, n2);
                break;
            case 2:
                resta(n1, n2);
                break;
            case 3:
                multiplicacion(n1,n2);
                break;
            case 4:
                division(n1,n2);
                break;
            case 5:
                System.out.println("adios");
            break;
        }
        }
    }
    public static void suma(int n1,int n2){
        int suma;
        suma = n1 + n2;
        System.out.println("el total de la suma es: " + suma);
    }
    public static void resta(int n1,int n2){
        int resta;
        resta = n1 - n2;
        System.out.println("el total de la resta es: " + resta);
    }
    public static void multiplicacion(int n1,int n2){
        int multiplicacion;
        multiplicacion = n1 * n2;
        System.out.println("el total de la multiplicacion es: " + multiplicacion);
    }
    public static void division(int n1,int n2){
        int division;
        division = n1 / n2;
        System.out.println("el total de la division es: " + division);
    }
}
        
   
    

