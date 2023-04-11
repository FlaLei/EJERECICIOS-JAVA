
package guia3extra;
//Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37     una resta realizada
//37 – 13 = 24     dos restas realizadas
//24 – 13 = 11     tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

import java.util.Scanner;

public class EJextra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros mayores a 1");
        int dividendo;
        int divisor;
        int cont = 0;
        
        
        do {
            dividendo = leer.nextInt();
            divisor = leer.nextInt();
            dividendo= dividendo - divisor;
            cont = cont + 1;
        } while(dividendo>divisor);
        System.out.println("el residuo es " + dividendo + " y el cociente es " + cont);
    }
}
