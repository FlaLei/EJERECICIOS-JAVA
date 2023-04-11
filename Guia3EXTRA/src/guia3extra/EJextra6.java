
package guia3extra;

import java.util.Scanner;

public class EJextra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas a evaluar");
        int N = leer.nextInt();
        int cont = 0;
        double promGral = 0;
        System.out.println("Ingrese las estaturas a promediar");
        for (int i = 0; i <= N - 1; i++) {
            double estatura = leer.nextDouble();
            if (estatura < 1.60) {
                cont = cont + 1;
            } else {
                promGral = promGral + estatura;
            }

        }
        System.out.println("El promedio de estaturas por debajo de 1.60 es: "+(cont/N*100));
        System.out.println("El promedio de estaturas en general es: "+(promGral/N*100));
    }
}
