/*Herramienta para calcular el precio de una llamada
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
de tal forma que:

+ los primeros cinco minutos cuestan 1€, 
+ los siguientes 3 minutos, 80 céntimos, 
+ los siguientes dos minutos a 70 céntimos 
+ y a partir del décimo minuto, 50 céntimos cada minuto.

Se carga un impuesto del 3% cuando es domingo, 
y si es otro día, 
	en turno de mañana 15% (6-12)
	y en turno de tarde 10%. (12-23)
	y en turno de noche -10%. (23-6)

Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada*/

package com.curso.java.inicio.condicionales.ejercicio;

public class CosteLlamada {

	public static void main(String[] args) {

		int tiempoLlamda =25;
		String diaSemanaLlamada = "lunes";
		int hora = 21;
		double coste = 0;

		System.out.println(3 + 2 * (6 + Math.pow(3, 2)) * 3);

		if (tiempoLlamda > 0 && tiempoLlamda <= 5) {
			coste = 1;
		} else if (tiempoLlamda > 5 && tiempoLlamda <= 8) {
			coste = 1.8;
		} else if (tiempoLlamda > 8 && tiempoLlamda <= 10) {
			coste = 2.5;
		} else if (tiempoLlamda > 10) {
			coste = 2.5 + (tiempoLlamda - 10) * 0.5;
		} else {
			System.out.println("Tiempo incorrecto");
		}
		System.out.println("Coste primera opción" + coste);

		// OPeradores
		coste = 0;
		coste--;
		coste = coste + 6;
		System.out.println("Coste: " + coste++);
		coste += 4;
		System.out.println("Coste: " + coste);

		// Operador mod
		System.out.println("Par: " + (coste % 2 == 0));

		// Ejercicio segunda forma
		coste = 0;
		if (tiempoLlamda > 0) {
			coste++;
		}

		if (tiempoLlamda > 5) {
			// coste = coste + 0.8;
			coste += 0.8;
		}

		if (tiempoLlamda > 8) {
			coste += 0.70;
		}

		if (tiempoLlamda > 10) {
			// coste = coste + ((tiempoLlamda-10)*0.5);
			coste += ((tiempoLlamda - 10) * 0.5);
		}

		System.out.println("Coste segunda opción " + coste);

		// Aplicamos impuestos al coste de la llamada

		// Si la llamada es en domingo aplicamos un 3% adicional
		if (diaSemanaLlamada.equalsIgnoreCase("domingo")) {
			coste += (coste * 0.03);
			// coste = coste + (coste*0.03);
		} else {
			if (hora > 6 && hora <= 12) {
				coste += (coste * 0.15);
			} else if (hora > 12 && hora <= 23) {
				coste += (coste * 0.10);
			} else {
				coste -= (coste * 0.10);
			}

		}

		System.out.println("El coste final de la llamada es: " + coste);

	}

}
