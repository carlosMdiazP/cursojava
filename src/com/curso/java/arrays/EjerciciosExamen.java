/*. Escribe un programa que solicite al usuario que introduzca una palabra y luego muestre cuántas letras tiene esa palabra (sin contar espacios).
Ejemplo:
Entrada: "Hola"
Salida: "La palabra tiene 4 letras."
2. Escribe un programa que pida al usuario una palabra y verifique si la primera letra es una vocal (a, e, i, o, u). Muestra un mensaje indicando si es o no una vocal.
Ejemplo:
Entrada: "Hola"
Salida: "La primera letra es una vocal."
*/

package com.curso.java.arrays;

import java.util.Scanner;

public class EjerciciosExamen {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir palabra: ");
		String palabra = scan.nextLine();
		System.out.println(palabra.trim());
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			contador++;
		}
		System.out.print("la palabra tiene " + contador + " letras");
		
/*2. Escribe un programa que pida al usuario una palabra y verifique si la primera letra es una vocal (a, e, i, o, u). Muestra un mensaje indicando si es o no una vocal.
Ejemplo:
Entrada: "Hola"
Salida: "La primera letra es una vocal."*/		
		
		
	}
	
	
}
