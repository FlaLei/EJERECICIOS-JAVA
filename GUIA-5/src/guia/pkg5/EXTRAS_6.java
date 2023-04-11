
package guia.pkg5;

import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().*/
public class EXTRAS_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String matrizSopa[][]=new String[20][20];
        String vectorPalabras[]=new String[5];
        
        //cargo las 5 palabras,condicionando q sean de 3 a 5 caracteres
        System.out.println("Ingrese 5 palabras");
        for (int i = 0; i < 5; i++) {
             vectorPalabras[i]=leer.next();
                while(vectorPalabras[i].length()<3 || vectorPalabras[i].length()>5) {
                    System.out.println("Solo puede caragar palabras de 3 a 5 caracteres");
                    vectorPalabras[i]=leer.next();
                }
         }
        
        //creo la matriz y la lleno de 0
        int cont=0;
        for (int i = 0; i < matrizSopa.length; i++) {
            for (int j = 0; j < matrizSopa.length; j++) {
                matrizSopa[i][j]="0";
               
//                i= String.valueOf(int)(Math.random()*19);
//                j= String.valueOf(int)(Math.random()*19);
                
                System.out.print(matrizSopa[i][j]+" ");
            }
            System.out.println();
        }
        int aleatorio=(int)(Math.random()*20);
        for(int i=aleatorio; i<vectorPalabras.length;i ++){
               vectorPalabras[i]=vectorPalabras[i].substring(cont,cont+1);
               cont++;   //para ir seleccionando distintas letras
              }
        
        for (int i = 0; i < matrizSopa.length; i++) {
            for (int j = 0; j < matrizSopa.length; j++) {
                if (matrizSopa[i][j]=="0") {
                    //convierto en string los numeros a cargar porq la matriz es tipo string
                    matrizSopa[i][j]=String.valueOf((int)(Math.random()*9));
                }else{
                    matrizSopa[i][j]=vectorPalabras[i];
                }
            }
        }
    }     
}

        
    
      
    
    

