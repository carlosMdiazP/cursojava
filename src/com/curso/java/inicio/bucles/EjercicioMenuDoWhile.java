package com.curso.java.inicio.bucles;

import java.util.Scanner;

import com.curso.java.utils.Utilidades;

public class EjercicioMenuDoWhile {

	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			System.out.println("1. Pintar cuadrado");
			System.out.println("2. Validar email");
			System.out.println("3. Crear alumno");
			System.out.println("4. Salir");
			
		//	System.out.println("Selecciona una opción");
		//	Scanner scan = new Scanner(System.in);
		//	opcion = scan.nextInt();
			opcion = Utilidades.datoNumerico("seleccione una opcion");
			System.out.println(opcion);
			
			
			switch(opcion) {
				case 1: 
					System.out.println("Escribe tamaño del cuadrado");
					Scanner scan = new Scanner(System.in);
					int tamanio = scan.nextInt();
					
					int fila =0;
					while(tamanio>fila) {
						int columna = 0;
						while (tamanio>columna) {
							System.out.print("* ");
							columna++;
						}
						fila++;
						System.out.println();
					}

					break;
				case 2: System.out.println("Vas a validar un email");
				String error = "";
				error = "";
				System.out.println("Escribe un email");
				//Scanner scan = new Scanner(System.in);
				String email = scan.nextLine();
				email = email.trim();
	           //El email no puede contener espacios en blanco
				
				if (email.contains(" ")) {
					error = " \no puede tener espacios en blanco";
				}
	           //El email solo contiene una @
				
				if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")) {
					error += " debe contener una @";
				}else {
					if(email.lastIndexOf(".")<email.indexOf("@")) {
						error +="debe contener un punto despues de la @" ;
					}
					String dominio = email.substring(email.indexOf("@")+1);
					if(dominio.indexOf(".")<2) {
						error = "el espacio entre la @ y el punto debe ser superior a 2";
					}
					String subdominio = dominio.substring(email.lastIndexOf(".")+1);
					System.out.println(subdominio);
					if(subdominio.length()>5 || subdominio.length()<2 ) {
						error = "despues del ultimo punto";
						break;
					}
				}
				System.out.println("El email  " + email +error);
				
				case 3: System.out.println("Vas a crear un alumno");break;
				case 4: System.out.println("Adios!!!");break;
				default: System.out.println("Opción incorrecta!!");break;	
			}
			
			
		}while(opcion!=4);
		
	
		
	}

}

