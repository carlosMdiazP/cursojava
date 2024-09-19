/*+ Definir array bidimensional de enteros de 2x3
+ Dar los valores de cada posición de una en una
+ Mostrar todos los datos en formato matriz con dos for anidados
+ Hacer los mismo con 2 foreach*/
package com.curso.java.arrays;

public class EjercicioArrays4 {

	public static void main(String[] args) {

		int[][] notas = new int[2][3];

		notas[0][0] = 1;
		notas[0][1] = 2;
		notas[0][2] = 3;
		notas[1][0] = 4;
		notas[1][1] = 5;
		notas[1][2] = 6;
		for (int fila = 0; fila < notas.length; fila++) {
			for (int columna = 0; columna < notas[fila].length; columna++) {
				System.out.print(notas[fila][columna] + "|");
			}
			System.out.println(" ");
		}
		System.out.println("\n============================\n");
		// foreach
		for (int[] fila : notas) {
			for (int num : fila) {

				System.out.print(num + "|");
			}
			System.out.println(" ");
		}
	}

}
