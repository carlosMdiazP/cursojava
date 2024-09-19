/*Teniendo en cuenta que || sirve para ver si una condición cumplu un valor u otro, hacer lo siguiente:

Declarar una variable para guardar un nombre de un mes
Indicar con que estación del año se corresponde

Enero, Febrero, marzo --> Invierno
Abril, mayo, Junio --> Primavera
Julio, Agosto, septiembre --> Verano
octube, noviembre, diciembre --> Otoño*/

package com.curso.java.inicio.condicionales.ejercicio;

import java.util.Scanner;

public class Estaciones {

	public static void main(String[] args) {
		String mes = "";
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine();
		System.out.println(mes);
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo")) {
			System.out.println("Invierno");

		} else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto")
				|| mes.equalsIgnoreCase("Septiembre")) {
			System.out.println(" Verano");

		} else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			System.out.println("Primavera");

		} else if
				  (mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase ("noviembre") ||
				  mes.equalsIgnoreCase ("diciembre"))
				  {
			System.out.println("Otoño");

		}
	}

}
