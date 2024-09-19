/* Todo número entero positivo llegará siempre a ser UNO siguiendo las siguientes reglas matemáticas
Se pide un numero
Si el número es par: Dividimos entre dos
Si el número es impar: Multiplicados por tres y sumamos 1

Repetir mientras que el numero sea distinto de 1*/

package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioConjeturaCollatz {

	public static void main(String[] args) {
		String respuesta = "";
		do {
			System.out.println("Escribe un Número");
			Scanner scan = new Scanner(System.in);
			int numero = scan.nextInt();

			while (numero != 1) {
				if (numero % 2 == 0) {// el numero par
					// numero = numero/2;
					numero /= 2;
				} else {// impar
					numero = numero * 3 + 1;
				}
				System.out.println(numero);
			}
			System.out.println("Desea Continuar");
			scan = new Scanner(System.in);
			respuesta = scan.nextLine();

		} while (respuesta.equals("si"));
		System.out.println("Termina");
	}

}