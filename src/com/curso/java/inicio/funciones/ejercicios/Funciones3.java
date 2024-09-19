/* Funcion a la que le paso un numero y me pinta la tabla de multiplicar de ese numero*/

package com.curso.java.inicio.funciones.ejercicios;

import java.util.Scanner;

public class Funciones3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero: ");
		int num = scan.nextInt();
		multiplicador(num);
	}

	public static void multiplicador(int num) {

		for (int y = 0; y <= 10; y++) {
			System.out.println(+num + " x " + y + " = " + num * y);

		}
	}

}
