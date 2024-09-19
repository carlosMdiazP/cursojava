/* Funcion que recibe un numero y un texto y me va a pintar el texto que le pasemos el numéro indicado por el parámetro*/
package com.curso.java.inicio.funciones.ejercicios;

import java.util.Scanner;

public class Funciones2 {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un texto: ");
		String texto = scan.nextLine();
		System.out.println("Escribe un numero: ");
		int numero = scan.nextInt();
		parametro(texto, numero);

	}

	public static void parametro(String texto, int numero) {

		for (int i = 0; i < numero; i++) {

			System.out.println(texto);

		}

	}
}
