/* Mostrar la tabla de multiplicar dex los números del 1 al 10
*/

package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForTablas {

	public static void main(String[] args) {

		System.out.println("Tablas de Multiplicar ");

		for (int x = 1; x < 11; x++) {
			System.out.println("\nTabla el muliplicar del " + x );
			for (int y = 0; y < 11; y++) {
				System.out.println(x + " x " + y + " = " + (x * y));
//preguntar si se desea continuar, si dicen que no deja de mostrar ls tablas
			}
			System.out.println("\nDesea continuar");
			Scanner scan= new Scanner(System.in);
			String respuesta = scan.nextLine();
			if(respuesta.equalsIgnoreCase("no")) {
				break;
			}

		}
		System.out.println("ADIOS!!");
	}

}
