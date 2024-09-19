package com.curso.java.arrays;

import java.util.Scanner;

public class EjercicioArrays2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	       System.out.println("Introduce numero de alumnos: ");
	       int numAlumnos = scan.nextInt();
	       String [] nombreAlumnos = new String[numAlumnos];
	       
	       
	   	for( int i=0; i < nombreAlumnos.length; i++) {
	   		System.out.println("introduce el nombre de alumno"+i);
	   		scan = new Scanner(System.in);
	   		String nombre = scan.nextLine();
	   		nombreAlumnos[i] = nombre;
	   	}
	   	for (String nombre : nombreAlumnos)
	   		if(nombre.toLowerCase().contains("a")) {
	   			System.out.println(nombre);
	   		}

	}

}
