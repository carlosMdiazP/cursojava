package com.curso.java.inicio.funciones;

import com.curso.java.utils.Utilidades;
import com.curso.java.utils.UtilidadesMatematicas;

public class PruebaUtilidadesMatematicas {

	public static void main(String[] args) {

		int num1 = Utilidades.datoNumerico("introduce un numero");
		int resultado = UtilidadesMatematicas.funcionSumar(num1, 3);
		System.out.println(resultado);

		double numeros = UtilidadesMatematicas.funcionOperacion(3, 4, "*");
		System.out.println("La Operacion es: "+numeros);

		int[] numero = { 1, 2, 3 };
		int resultadoSuma = UtilidadesMatematicas.calculaSumatorio(numero);
		System.out.println("Resultado Suma: "+resultadoSuma);

		int[] enteros = { 2, 3, 4, 6, 8, 6 };
		int resultadoMedia = UtilidadesMatematicas.calcularMedia(enteros);
		System.out.println("Resultado Media: " + resultadoMedia);
	}

}
