/*Definir un array de enteros de longitud 3
Vais a dar los valores de cada posición de una en una
Mostrar 
+ Uno por uno
+ Desde un bucle
2. Definir un array de nombres de alumnos de longitud (se pregunta). Mostrar solo aquellos alumnos que contengan una a en el nombre
Longitud de un array se puede saber con length
3.Definir un array de nombres de alumnos de longitud (se pregunta). Mostrar solo aquellos alumnos que contengan una a en el nombre
Longitud de un array se puede sabe con length
*/
package com.curso.java.arrays;

import java.util.Scanner;

public class IntroArrays {

	public static void main(String[] args) {
	
		double [] notaAlumno = new double[4] ;
		notaAlumno[1] = 5.5;
        System.out.print(notaAlumno[1]+"\n" );
        
       int [] numeros = new int[3];
       double suma = 0;
       int num1 = 0;
      
       numeros[0] = 12;
       numeros[1] = 16;
       numeros[2] = 4;
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println("========================");
       for(int  i=0; i < numeros.length;  i++){
        	System.out.println(numeros[i]);
        	//suma = suma + i;
        	suma += i;
        	
        	
        }
       System.out.println("Promedio es: "+suma/numeros.length);
       System.out.println("====Calculo de la media====");
        //bucle foreach
       
       for(int num : numeros) {
    	   System.out.println(num);
    	   //suma = suma +num;
    	   suma += num;
    	   
    	   
       }
       System.out.println("Promedio es: "+suma/numeros.length);
       
      
   		
   }  
	}
	
