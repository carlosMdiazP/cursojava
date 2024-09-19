package com.curso.java.inicio.bucles;

public class EjercicioFibonacci {

	public static void main(String[] args) {
		int numRepeticiones = (int) (Math.random() * 10) + 1; // Se genera de manera aleatoria un numero 1 y 10
		System.out.println("se van a mostar" + numRepeticiones + "de la serie fibonacci");
		int num1 = 0;
		int num2 = 1;
		System.out.print("" + num1 + ", " + num2);

		for (int i = 0; i < numRepeticiones - 2; i++) {
			int suma = num1 + num2;
			System.out.print(", " + suma);
			num1 = num2;
			num2 = suma;

		}

		// Hecho con el while
		int repeticion = 0;
		while (repeticion < numRepeticiones - 2) {
			int suma = num1 + num2;
			System.out.print(", " + suma);
			num1 = num2;
			num2 = suma;

			repeticion++;
		}
	}
}
