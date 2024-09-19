package com.curso.java.utils;

import java.util.Scanner;

public class Utilidades {
	public static int datoNumerico(String pregunta) {
		int dato = 0;
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextInt();

		return dato;
	}

	public static String datoString(String palabra) {

		String texto = "";
		System.out.println(palabra);
		Scanner scan = new Scanner(System.in);
		texto = scan.nextLine();
		return texto;

	}

	public static void pintarMenu(String[] opcionesMenu, boolean pintarnumeros) {

		if (pintarnumeros) {
			for (int i = 0; i < opcionesMenu.length; i++) {
				System.out.println(i + 1 + ".-" + opcionesMenu[i]);
			}
		} else {
			for (String opcion : opcionesMenu) {
				System.out.println(opcion);
			}

		}
	}

}


