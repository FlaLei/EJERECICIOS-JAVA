
package frasemaymin;

import java.util.Scanner;


public class FraseMayMin {

   
    public static void main(String[] args) {
        String frase;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();//next()solo nos toma una palabra, nextLine nos toma todo lo escrito
        
        System.out.println("En minusculas: " + frase.toLowerCase());
        
        System.out.println("En mayusculas: " + frase.toUpperCase());
    
 }
}