package com.curso.java.poo;

public class Pesos {

	public static void main(String[] args) {
		int velocidad = (int) (Math.random() * 20 + 1);
		System.out.println("velocidad es: " + velocidad);
		int peso = (int) (Math.random() * 3 + 1);
		System.out.println("Peso es: " + peso);
		int edad = (int) (Math.random() * 3 + 1);
		System.out.println("edad es: " + edad);
		String nombre = "negrito";

		System.out.println(" " + nombre + " esta corriendo");
		if (velocidad <= 20 && velocidad >= 15) {
			System.out.println(" Muy rapido");
		}
		if (velocidad <= 14 && velocidad >= 10) {
			System.out.println("Normal ");
		}
		if (velocidad <= 9 && velocidad >= 0) {
			System.out.println("Lento");
		}

	}

}
