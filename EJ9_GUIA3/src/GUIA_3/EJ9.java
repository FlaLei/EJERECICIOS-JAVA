
package GUIA_3;

import java.util.Scanner;

public class EJ9 {

    
    public static void main(String[] args) {
        int num;
        int cont=0;
        int suma=0;
        Scanner leer = new Scanner(System.in);
        
     System.out.println("Ingrese 20 numeros, excepto 0 que parará el programa");
    
     do{
       num= leer.nextInt();
       if(num > 0){   
         suma=suma+num;
        }
     
      if(num == 0){
          System.out.println("Se capturo el numero 0");
          break;
      }
       
      cont=cont+1;
     }while(cont<20);
     
     System.out.println("La suma de los valores ingresados es "+suma);
    } 
}
 