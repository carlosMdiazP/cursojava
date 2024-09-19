/*Teniendo en cuenta que || sirve para ver si una condición cumplu un valor u otro, hacer lo siguiente:

Declarar una variable para guardar un nombre de un mes
Indicar con que estación del año se corresponde

Enero, Febrero, marzo --> Invierno
Abril, mayo, Junio --> Primavera
Julio, Agosto, septiembre --> Verano
octube, noviembre, diciembre --> Otoño*/

package com.curso.java.inicio.condicionales;

import java.util.Scanner;

public class CondicionalesSwitch {
	public static void main(String[] args) {
		String mes = "";
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine();

		String estacion = "";
		switch (mes.toLowerCase()) {
		case "enero":
		case "febrero":
		case "marzo":
			estacion = "invierno";
			break;
		case "abril":
			estacion = "Primavera";
			break;
		}
		switch (mes) {
		case "Enero", "Febrero", "Marzo":
			estacion = "Invierno";
			break;
		case "Abril", "Mayo", "Junio":
			estacion = "Primavera";
			break;
		case "julio", "agosto", "septiembre":
			estacion = "Verano";
			break;
		case "octubre", "noviembre", "diciembre":
			estacion = "Otoño";
			break;
		}
		if (estacion.equals("")) {
			System.out.println("mes introducido erroneamente");
		} else {
			System.out.println("el mes " + mes + " esta en la estacion en " + estacion);
		}
	}
}
