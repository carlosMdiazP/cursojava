package com.curso.java.inicio.condicionales;

public class CondicionalesIf {
	public static void main(String[] args) {
		//Condicionales If
		
		int numero = 0;
		System.out.println("EMPIEZA");
		
		if (numero>10) {
			System.out.println("el numero es mayor que 10");
		}else if(numero>=0 && numero<5) {
			System.out.println("el numero esta entre 0 y 5");
		}else if(numero>=5) {
			System.out.println("el numero esta entre 5 y 10");
		}
		else {
			System.out.println("el numero es menor que 0");
		}
		
		System.out.println("FIN");

	}
}
