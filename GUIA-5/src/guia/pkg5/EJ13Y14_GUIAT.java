
package guia.pkg5;

import java.util.Scanner;

/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su
tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/

public class EJ13Y14_GUIAT {

    public static void main(String[] args) {
       String vector[]=new String[5];
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los nombre de los compañeros");
        for (int i = 0; i < 5; i++) {
            vector[i]=leer.next();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("["+vector[i]+"]");
        }
    }
    
}
