
package ej7_guia3;

import java.util.Scanner;


public class EJ7_GUIA3 {

   
    public static void main(String[] args) {
        int tipoMotor;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un valor del 1 al 4");
        tipoMotor= leer.nextInt();
        
       switch (tipoMotor){
           case 1:
               System.out.println("Es una bomba de agua");
               break;
           case 2:
               System.out.println("La bomba es de gasolina");
               break;
           case 3:
               System.out.println("La bomba es de hormigón");
               break;
           case 4:
               System.out.println("La bomba es de pasta alimenticia");
               break;
           default:
               System.out.println("No existe valor válido para tipo de bomba ingresado");
       }
    }
}
