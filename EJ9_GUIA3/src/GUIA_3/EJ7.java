
package GUIA_3;
//Realizar un programa que simule el funcionamiento de un dispositivo RS232,
//este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
//deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
//de largo, el primer carácter tiene que ser X y el último tiene que ser una O.

//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
//distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
//cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

import java.util.Scanner;

public class EJ7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 5 letras, que comience con X y termine con 0 ."
                + "Para salir presione &&&&");
        String palabra = leer.nextLine();
        int longpalabra=palabra.length();
        String FDE = "&&&&";
        int contC=0;
        int contI=0;
        do {
              if(palabra.substring(0,1).equalsIgnoreCase("X")&& palabra.substring(longpalabra).equalsIgnoreCase("O")){
                    contC=contC+1;
                }else{
                    contI=contI+1;
                }
          
        } while ((palabra.length() <= 5) && (!palabra.equals(FDE)));
        System.out.println("Lecturas correctas: "+contC);
        System.out.println("Lecturas incorrectas: "+contI);
    }
}
