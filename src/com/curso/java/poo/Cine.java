package com.curso.java.poo;

public class Cine {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Eva", "Garcia", "1A", 28);
		persona1.getEdad();
		// persona1.get.edad = 28;
		persona1.getNombre();
		persona1.getDni();
		persona1.getApellidos();

		System.out.println(persona1.getNombre().toUpperCase() +" "+ persona1.getApellidos().toUpperCase() +" " + persona1.getEdad() + " " + persona1.getDni());

		persona1.correr();

		Persona persona2 = new Persona("Luz", "Garcia", "2A", 38);
		persona2.getEdad();
		persona2.getNombre();
		System.out.println(persona2.getNombre());

		persona2.correr();

		Persona persona3 = new Persona("Elvis", "Garcia", "3A", 18);
		persona3.getEdad();
		persona3.getNombre();
		persona3.correr();
		System.out.print(persona2.getNombre() + " " + persona2.getEdad());

		Persona persona4 = persona3;
		persona4.setNombre("Carlos");
		persona3.getNombre();

	}

}
