
package doble.triple.rc;

import java.util.Scanner;


public class DobleTripleRC {

   
    public static void main(String[] args) {
        int num;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        num= leer.nextInt();
        
        System.out.println("Doble: "+num*2);
        System.out.println("Triple: "+num*3);
        System.out.println("Raiz cuadrada: "+ Math.sqrt(num));
        
        
    }
    
}
