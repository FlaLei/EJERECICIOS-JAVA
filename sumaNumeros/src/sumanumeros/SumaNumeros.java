
package sumanumeros;

import java.util.Scanner;


public class SumaNumeros {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int total;
        
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
        
        total=num1 + num2;
        
        System.out.println("La suma de los dos numero es : "+total);
    
              
        
        
                
        
        
    }
    
}
