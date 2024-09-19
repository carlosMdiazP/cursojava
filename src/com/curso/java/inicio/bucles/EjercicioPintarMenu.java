/*Ejercicio pintar menu
================================================================

(Facil)
1. Pintar cuadrado
2. Validar email
3. Crear alumno
4. Salir

Selecciona una opción

Si se pulsa la opcion 1,2 o 3 que nos indique la opción seleccionada, y que vuelva a pintar el menú
Si se selecciona la opcion 4, me dice Adios! y no se vuelve a mostrar el menú (Medio)

*/
package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioPintarMenu {

	public static void main(String[] args) {

		System.out.println("Selecciona una Opción");
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		System.out.println("\n1. Pintar cuadrado\n" + "2. Validar email\n" + "3. Crear alumno\n" + "4. Salir");
		int opcion = scan.nextInt();

		//if (opcion < 4) {
			//System.out.println(opcion);

		//} else if (opcion == 4)

		//{
			//System.out.println("salir");
		//}
		switch(opcion){
		case 1:System.out.println("1. Pintar Cuadrado"); break;
		case 2:System.out.println("2. Validar email"); break;
		case 3:System.out.println("3. Crear alumno");break;
		case 4:System.out.println("4. Salir");break;
		default:System.out.println("El numero introducido no es valido"); 
		}
	}
}