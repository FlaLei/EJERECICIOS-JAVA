
package GUIA_3;
/*Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
vuelve a mostrar el menú*/
import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTIPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("5- SALIR");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de " + num1 + ", y " + num2 + " es = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + ", y " + num2 + " es = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de " + num1 + ", y " + num2 + " es = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de " + num1 + ", y " + num2 + " es = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Estas seguro que deseas salir? S/N");
                    String resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Saliste del programa");
                        break;

                    }
                    while (!resp.equalsIgnoreCase("S")) {
                    }

            }
        }


         
    
    
      


