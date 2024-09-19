/*Introduce tu email (a partir de un email proporcionado). Vamos a validar si el email es correcto o no.
 Para ello vamos a pasar las siguientes validaciones
   asdasd@as.dasd.easdasdasdsad   

1. El email solo contiene una @
2. El email no puede contener espacios en blanco 
3. Despues de la @ debe de haber al menos un punto
4. Entre la @ y el primer punto que esté depués tiene que haber una separación de 2 caracteres
5. Después del último punto tiene que haber entre 2 y 5 caracteres

Si no cumple validación se indica por qué */

package com.curso.java.inicio.String;

import java.util.Scanner;

public class EjercicioEmail {

	public static void main(String[] args) {
		String error = "";

		do {
			error = "";
			System.out.println("Escribe un email");
			Scanner scan = new Scanner(System.in);
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
				}
			}
			System.out.println("El email  " + email +error);

		} while (!error.isBlank());
		
		System.out.println("Correcto");

	}

}
