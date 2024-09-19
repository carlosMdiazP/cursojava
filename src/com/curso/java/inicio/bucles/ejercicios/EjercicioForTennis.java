/*Pedir número de tenistas, por cada tenista pedir su nombre 
y la posición que ocupa en el ranking. 
Indicar cuantos tenistas hay entre los 10 primeros
y el nombre del mejor tenista. (bloque)*/

/**comentario de documentacion (javadoc)*/
//comentario de linea
package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForTennis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero de tenistas");
		int numerotenistas = scan.nextInt();
		int primeros10 = 0;
		int rankingultimo = Integer.MAX_VALUE;
		String elmejor = "";

		for (int i = 0; i < numerotenistas; i++) {
			System.out.println("Introducir nombre tenista ");

			scan = new Scanner(System.in);
			String nombretenista = scan.nextLine();
			System.out.println("introducir ranking");
			scan = new Scanner(System.in);
			int ranking = scan.nextInt();
			if (ranking < 11) {
				primeros10++;
			}
			if (ranking < rankingultimo) {
				elmejor = nombretenista;
				rankingultimo = ranking;
			}
			
		}
		System.out.println("estos son los primeros 10 tenistas " + primeros10);
		System.out.println("El mejor tenista es:  " + elmejor);
	}

}
