package com.curso.java.utils;

public class UtilidadesMatematicas {
	/* funcion sumar le pasais dos parámetros y os devuelve la suma. */
	public static int funcionSumar(int num1, int num2) {

		int resultado = num1 + num2;

		return resultado;

	}

	/*
	 * funcion operacion, le vamos a pasar tres parametros, los dos primeros son
	 * numeros y el tercero es la operacion que queremos hacer con los números. Me
	 * devolverá el resultado de la operación
	 */
	public static double funcionOperacion(double num1, double num2, String operacion) {

		double resultado = 0;

		if (operacion.equals("suma") || operacion.equals("+")) {
			resultado = num1 + num2;
		} else if (operacion.equals("resta") || operacion.equals("-")) {
			resultado = num1 - num2;
		} else if (operacion.equals("multiplica") || operacion.equals("*")) {
			resultado = num1 * num2;

		} else if (operacion.equals("divide") || operacion.equals("/")) {
			resultado = num1 / num2;
		}

		// switch(operacion) {
		// case "+":resultado = num1+num2;break;
		// case "-":resultado = num1-num2;break;
		// case "*":resultado = num1*num2;break;
		// case "/":resultado = num1/num2;break;

		// }

		return resultado;
	}

	/*
	 * uncion calculaSumatorio que le pasamos un [] de enteros y me devuelve la suma
	 * de todos los numeros
	 */
	public static int calculaSumatorio(int[] numeros) {
		int resultado = 0;
		for (int numero : numeros) {
			resultado += numero;
		}
		return resultado;
	}

	/*
	 * funcion calcularMedia que le pasamos un [] de enteros, que llama a la función
	 * calculaSumatorio para realizar el cálculo y devuelve la media de todos los
	 * numeros del array.
	 */
	
	public static int calcularMedia(int[] enteros) {
		int media = 0;

		int sumatotal = calculaSumatorio(enteros);
		media = sumatotal / enteros.length;

		return media;
	}
}
