
package guia_4;
//Crea un procedimiento EsMultiplo que reciba los dos números pasados 
//por el usuario, validando que el primer número múltiplo del segundo

import java.util.Scanner;

//e imprima si el primer número es múltiplo del segundo, sino informe
//que no lo son.

public class EJ12_GUIAteorica {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        esMultiplo(num1,num2);
    
    }
    public static void esMultiplo(int num1, int num2){
        if(num1 % num2==0){
            System.out.println("el primer numero "+num1+" es multiplo de "+num2);
        }else{
            System.out.println("No son multiplos");
        }
    }
    
}
