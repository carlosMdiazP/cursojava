/*saldo = 500
¿Por qué numero quieres apostar? (0-34) 
Si es otro numero numero se vuelve a formular la pregunta

¿Cuánto dinero quieres apostar? 
Si el importe de la apuesta es > que el saldo disponible por el usuario,
se notifica y se vuelve a formular la pregunta

De manera aleatoria generar un nº entre 0 y 36

Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y se suma al saldo no apostado
Si no lo es le restamos del saldo la cantidad apostada

Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le indicamos el saldo con el que se va y si no tiene saldo le indicamos que se ha quedado sin dinero.

*/
package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioRuleta {

	public static void main(String[] args) {
		String respuesta = "";
		int saldo = 500;
		do {
			int numRepeticiones = 10;// (int) (Math.random() * 37) ;
			// System.out.println( numRepeticiones );

			System.out.println("             ** RULETA **   ");

			System.out.println("Saldo = " + saldo);
			System.out.println("Que Número Quieres apostar");
			Scanner scan = new Scanner(System.in);
			int numeroapostar = scan.nextInt();
			if (numeroapostar <= 0 || numeroapostar > 36) {
				System.out.println("Introduce Numero Menor");
				numeroapostar = scan.nextInt();
			}

			System.out.println("Cuanto Quieres apostar");
			scan = new Scanner(System.in);
			int apuesta = scan.nextInt();
			if (apuesta > saldo) {
				System.out.println("introduce un Numero Menor");
				apuesta = scan.nextInt();

			}

			System.out.println("\nEl Numero es " + numRepeticiones);
			saldo -= apuesta;
			System.out.println("\nSu Nuevo Saldo es " + saldo);
			if (numeroapostar == numRepeticiones) {
				saldo += apuesta * 36; // saldo = apuesta * 36 + saldo;
				System.out.println("\nSus Ganancias son " + (apuesta * 36));
				System.out.println("Su Nuevo Saldo tras Ganar es  " + saldo);
			}
			respuesta = scan.nextLine();
			if (saldo > 0) {
				System.out.println("\nQuieres Seguir Jugando");
				respuesta = scan.nextLine();
			} else {
				System.out.println("SIN SALDO");
				break;
			}

			// if(respuesta.equalsIgnoreCase("no")) {

			// }

		} while (respuesta.equalsIgnoreCase("si"));

		System.out.println("\nVUELVE PRONTO");
	}

}