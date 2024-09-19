package com.curso.java.inicio.bucles;

import java.util.Scanner;

/*Pedir el tamaño de un lado de un cuadrado: 
(Medio)
*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  * */
public class EjercicioPintarCuadradoRelleno {

	public static void main(String[] args) {
		System.out.println("Pintar Cuadrado");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIntroduce el número del lado");
		int lado = scan.nextInt();
		int filas = 0;
		int columnas = 0;
		while (filas < lado) {
			//filas = filas + 1;
			filas++;
			columnas = 0;
			while (columnas < lado) {
				System.out.print(" * ");

				//columnas = columnas + 1;
				columnas++;
			}
			System.out.println("");
		}
		
	}

}
