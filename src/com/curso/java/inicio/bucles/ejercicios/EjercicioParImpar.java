/* Mostra los numero pares del 2 al 100 y los impares del 99 al 1
2,99
4,97
6,95
.... */
package com.curso.java.inicio.bucles.ejercicios;

public class EjercicioParImpar {

	public static void main(String[] args) {
	//for(int i=2, j=99; i<=100; i+=2, j-=2) {
		//System.out.println(i+","+j);
	//}
	for(int i=2; i<=100; i+=2) {
		System.out.println(i+","+(101-i));	}
		//for(int i=2; i<=100; i++) {
			//if(i%2==0) {
				//System.out.println(i);
			//}
		//}
System.out.println("FIN");
	}

}
