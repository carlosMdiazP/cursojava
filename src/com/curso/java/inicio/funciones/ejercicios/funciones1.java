/*definir funcion que recibe un String y devuelve la longitud del String*/
package com.curso.java.inicio.funciones.ejercicios;

import java.util.Scanner;

public class funciones1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un Texto: ");
		String texto = scan.nextLine();
		System.out.println(frase(texto));
	
	}

	public static int  frase(String texto) {
		int longitud = texto.length();
		return longitud;
	}

}
