
package guia_4;
//Crea una aplicación que a través de una función nos convierta una cantidad de
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, 

import java.util.Scanner;

//yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
//moneda a convertir que será una cadena, este no devolverá ningún valor y 
//mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
// i. * 0.86 libras es un 1 €
// ii. * 1.28611 $ es un 1 €
// iii. * 129.852 yenes es un 1 €

public class EJ_3 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que quiere convertir");
        double euro=leer.nextDouble();
        System.out.println("Seleccione la moneda a la cual quiere cambiar");
        System.out.println("1-DOLARES");
        System.out.println("2-YENES");
        System.out.println("3-LIBRAS");
        String moneda=leer.next();
        
        conversion(euro,moneda);
    }
    public static void conversion(Double euro,String moneda){
      switch(moneda){
          case "1":
          System.out.println(euro*1.28611);
          break;
          case "2":
              System.out.println(euro*129.852);
              break;
          case "3":
              System.out.println(euro*0.86);
              break;
              
          
                 
          
      }
    
}
}
