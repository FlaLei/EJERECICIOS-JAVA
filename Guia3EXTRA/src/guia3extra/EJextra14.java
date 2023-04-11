
package guia3extra;
//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad 
//de hijos. Escriba un programa que pida la cantidad de familias y para cada familia

import java.util.Scanner;

//la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.

public class EJextra14 {

    public static void main(String[] args) {
       int N;//num de familias
       int M;//cant de hijos
       int media;
       int edad;
       int suma=0;
       int cont=0;
       Scanner leer=new Scanner(System.in);
        System.out.println("Numero de familias:");
        N=leer.nextInt();
        for (int i = 1; i <=N; i++) {
            System.out.println("Cantidad de hijos familia "+i+": ");
            M=leer.nextInt();
                for (int j = 1; j <= M; j++) {
                    System.out.println("Ingrese la edad de hijo "+j);
                    edad=leer.nextInt();
                    suma=suma+edad;
                    cont=cont+1;
                }
           
        }
        media=suma/cont;
        System.out.println("El promedio de edad de todos los hijos de todas las familias es "+media);    
    }
                 
}
    

