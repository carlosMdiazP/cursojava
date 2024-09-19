package com.curso.java.inicio.String;

public class EjercicioStringsubstring {

	public static void main(String[] args) {
		
		
		String nombreFichero = "fichero.jpg";
		
		int posicionpunto = nombreFichero.lastIndexOf(".");
		
		System.out.println("Extension: " + nombreFichero.substring(posicionpunto));
		System.out.println("Nombre: " +nombreFichero.substring(0,posicionpunto));
		

	}

}
