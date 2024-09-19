/*Pedir numero de coches
Por cada coche pedir su velocidad
Indicar a qué velocidad va el coche más rápido*/

package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioforCoches {

	public static void main(String[] args) {
		// Para pedir informacion
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero de coche");
		int numerocoche = scan.nextInt();
		double velocidadmaxima = 0;

		for (int i = 0; i < numerocoche; i++) {
			System.out.println("Introduce velocidad coche " + (i + 1));

			scan = new Scanner(System.in);
			double velocidad = scan.nextDouble();

			if (velocidadmaxima < velocidad) {
				velocidadmaxima = velocidad;
			}

		}
		System.out.println("velocidad mas rapida " + velocidadmaxima+"Km/h");
	}
}