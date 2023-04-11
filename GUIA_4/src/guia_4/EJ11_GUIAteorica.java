
package guia_4;

import java.util.Scanner;
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego
//codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
//en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
//a  @
//e  #
//i  $
//o  %
//u  *
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
//Utilice la estructura “según” para la transformación. 
//Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser:     @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

public class EJ11_GUIAteorica {

     public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la frase");
        String palabra= leer.nextLine();
        String frasenueva;
        frasenueva = codigo(palabra);
        System.out.println(palabra);
        System.out.println(frasenueva);
    }
    public static String codigo(String palabra){
        String car;
        
        String retorno = "";
        int longitud = palabra.length();
        
        for (int i = 0; i<longitud; i++){
            car = palabra.substring(i,i+1);
            switch(car) {
                case "a":
                    retorno = retorno.concat("@");
                    break;
                case "e":
                    retorno = retorno.concat("#");
                    break;
                case "i":
                    retorno = retorno.concat("$");
                    break;
                case "o":
                    retorno = retorno.concat("%");
                    break;
                case "u":
                    retorno = retorno.concat("*");
                    break;
                 default:
                    retorno = retorno.concat(car);
            }
        }
        return retorno;
    }
}

        
    
