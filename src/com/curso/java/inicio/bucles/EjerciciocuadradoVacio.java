
package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjerciciocuadradoVacio {

	public static void main(String[] args) {
		System.out.println("Pintar Cuadrado");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce el número del lado");
		int tamanio = scan.nextInt();
		int filas = 0;
		int columnas = 0;
		while (tamanio > filas) {
			// filas = filas + 1;			

			columnas = 0;
			while (tamanio > columnas) {
				if (filas == 0 || filas == (tamanio - 1) || columnas == 0 || columnas == (tamanio - 1)) {
					System.out.print("* ");

					// columnas = columnas + 1;

				} else {
					System.out.print("  ");
				}
				columnas++;

			}
			filas++;
			System.out.println();
		}
		System.out.println();
	}
}
