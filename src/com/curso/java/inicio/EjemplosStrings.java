package com.curso.java.inicio;

import java.util.Scanner;

public class EjemplosStrings {

	public static void main(String[] args) {
		// los String se compara SIEMPRE con el metodo equals
		String s1 = "hola";
		String s2 = "hola";
		String s3 = new String("hola");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		// inmutabilidad
		String nombre = " carlosT  T";
		String nombreMays = nombre.toUpperCase();
		System.out.println(nombre);
		Scanner scan = new Scanner(System.in);

		// System.out.println(nombre.substring(3, 6).replace);

		// Funciones
		System.out.println(nombre.toLowerCase().contains("ca"));
		System.out.println(nombre);

		String nombreFichero = "fichero.jpg";
		System.out.println(nombreFichero.endsWith(".jpg"));

		System.out.println(nombre.indexOf("T"));
		System.out.println(nombre.lastIndexOf("T"));
		System.out.println(nombre.length());
		System.out.println(nombre.indexOf("C"));
		System.out.println(nombre.charAt(nombre.length() - 1));

		String texto = "    f a  ";

		System.out.println(texto.trim());
		System.out.println(texto.trim().length());
		System.out.println(texto.isBlank());
		System.out.println(texto.trim().isEmpty());

		System.out.println(texto.replace(" ", ""));

		System.out.println(nombreFichero.substring(2, 5));

	}

}
