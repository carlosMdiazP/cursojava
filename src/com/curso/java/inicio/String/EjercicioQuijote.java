/* Tamaño del texto sin los espacios en blanco del principio y del final
Mostrar la segunda frase del quijote
Aparece la palabra Quijote??
Cuantas comas aparecen en el texto 
Encontrar la palabra más larga: Identifica la palabra más larga en el texto.
Encontrar la palabra que mas se repite en el texto
Invertir las palabras: Invierte cada palabra en el texto manteniendo el orden original de las palabras.*/

package com.curso.java.inicio.String;

public class EjercicioQuijote {

	public static void main(String[] args) {

		String texto = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";

		// Tamaño del texto sin los espacios en blanco del principio y del final

		System.out.println("Tamaño del Texto " +texto.trim().length());

		// Mostrar la segunda frase del quijote

		System.out.println(texto.substring(texto.indexOf(".")+1).trim());

		// Aparece la palabra Quijote??//Tres formas diferentes de hacerlo
		String respuesta = "";
		if(texto.toLowerCase().contains("quijote")) {
			respuesta = "SI";
		}else {
			respuesta = "NO";
		}

		System.out.println("Aparece la palabra quijote \n" +respuesta);
		
		//Operadores ternarios
		
		String respuestaternario = texto.toLowerCase().contains("quijote")?"SI":"NO";
		System.out.println("Aparece la palabra quijote \n"+respuestaternario);
		
		System.out.println( "Aparece la palabra quijote \n"+texto.toLowerCase().contains("quijote"));
		
		//Cuantas comas aparecen en el texto
		
		int contador = 0;
		for(int i=0; i<texto.length(); i++) {
			if(texto.charAt(i)==',') {
				contador++;
			}
			
		}
		
		System.out.println("Número de comas = "+contador );
		
		//Encontrar la palabra más larga: Identifica la palabra más larga en el texto.
		
	}

}
