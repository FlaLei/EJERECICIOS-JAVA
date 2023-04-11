
package guia3extra;

import java.util.Scanner;

public class EJextra5 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese clase de socio: A, B, C");
        String socio= leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        int costo= leer.nextInt();
        switch(socio){
            case "A":
                System.out.println("El importe a pagar es: "+(costo-(costo*50/100)));
                break;
            case "B":
                System.out.println("El importe a pagar es: "+(costo-(costo*35/100)));
                break;
            case "C":
                System.out.println("El importe a pagar es "+costo);
                break;
        }
    }
    
}
