
package guia.pkg5;

import java.util.Scanner;

/*Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.*/

public class EXTRAS_4 {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int matriz [][]= new int [10][4];
      double total=0;
      int contA=0;
      int contD=0;
      double promedio=0;
      double promT1=0;
      double promT2=0;
      double promI1=0;
      double promI2=0;
        System.out.println("REGISTRO DE NOTAS");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las 4 notas");
            System.out.println("Alumno "+(i+1));
            for (int j = 0; j < 4; j++) {
                System.out.print("NOTA "+(j+1)+": ");
               matriz[i][j]=leer.nextInt();
                
                switch (j) {
                    case 0:
                        promT1=matriz[i][j] * 0.10;
                        break;
                    case 1:
                        promT2=matriz[i][j]*0.15;
                        break;
                    case 2:
                        promI1=matriz[i][j]*0.25;
                        break;
                    case 3:
                        promI2=matriz[i][j]*0.50;
                        break;
                    default:
                        break;
                }
                total=(promT1+promT2+promI1+promI2);
          }
            
            
            System.out.println("Promedio: "+total);
            if (total>=7) {
                contA++;
            }else{
                contD++;
            }
           
        }
        System.out.println("ALUMNOS APROBADOS: "+contA);
        System.out.println("ALUMNOS DESAPROBADOS: "+contD);
    }
    
}
