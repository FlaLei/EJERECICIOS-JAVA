
package gradosfahrenheit;

import java.util.Scanner;


public class GradosFahrenheit {

   
    public static void main(String[] args) {
        double gradosC;
        double fahrenheit;
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingrese los grados a convertir en Fahrenheit");
        gradosC= leer.nextDouble();
        fahrenheit= 32+((9*gradosC)/5);
        
        System.out.println("El equivalente en Fahrenheit es: "+fahrenheit);
               
    }
    
}
