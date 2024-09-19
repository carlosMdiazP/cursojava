/*De una matriz 4x4
Pedir los datos de la matriz
Sacar los números de la diagonal
Invertir la diagonal y mostrar la matriz
 */
package com.curso.java.arrays;

import java.util.Scanner;

public class EjercicioArrays5 {

	public static void main(String[] args) {
			
		int[][] numeros = new int[4][4];
		
		for(int fila=0;fila<numeros.length;fila++) {
			for(int columna=0;columna<numeros[fila].length; columna++) {
				
				
			
				Scanner scan = new Scanner(System.in);
				System.out.println("Escribe un número para la posicion ["+fila+"]["+columna+"]");
				numeros[fila][columna]=scan.nextInt();
			}
		}
		
		for (int fila = 0; fila < numeros.length; fila++) {
			for (int columna = 0; columna < numeros[fila].length; columna++) {
				if(fila==columna)
				System.out.print(numeros[fila][columna] + "|");
				
			}
			System.out.println("");
		}
		System.out.println("\n===============================\n");
		//foreach
		for(int[]filas:numeros) {
			for(int num: filas) {
				System.out.print(num+ "|");
			}
			System.out.println("");
		}
		
		
	}

}
