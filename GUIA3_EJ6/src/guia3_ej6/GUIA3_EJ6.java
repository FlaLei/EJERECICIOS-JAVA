
package guia3_ej6;

import java.util.Scanner;


public class GUIA3_EJ6 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int num1;
       int num2;
       
       System.out.println("Ingrese un numero entero");
        num1= leer.nextInt();
        
       System.out.println("Ingrese otro numero entero");
        num2= leer.nextInt();
        
        if ( num1>25 && num1==num2 ){
            System.out.println("Ambos son mayores a 25");
        }else if( num1>25 || num2>25 ){
        System.out.println("Uno de los numeros ingresados es mayor a 25");
    }else{
            System.out.println("Ninguno es mayor a 25");
        }
        }
        
}

