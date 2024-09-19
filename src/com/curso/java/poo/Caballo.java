package com.curso.java.poo;

public class Caballo {

	// variables de instancia:

	private int id;
	private String nombre;
	private int edad;
	private int velocidad;
	private int peso;

	// constructores

	public Caballo(int id, String nombre, int edad, int velocidad, int peso) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}

	// metodos getter y setter

	public int getId() {
		return this.id;

	}

	public int setId() {
		return this.id;

	}

	public String getNombre(String nombre) {
		return this.nombre;

	}

	public String setNombre() {
		return this.nombre;
	}

	public int getEdad(int edad) {
		return this.edad;
	}

	public int setEdad() {
		return this.edad;

	}

	public int getVelocidad(int velocidad) {
		return this.velocidad;

	}

	public int setVelocidad() {
		return this.velocidad;

	}

	public int getPeso(int peso) {
		return this.peso;

	}

	public int setPeso() {
		return this.peso;
	}

	// Metodo

	public void correr() {

		System.out.println(" " + nombre + " esta corriendo");
		if (velocidad >= (int) (Math.random() * 20 + 1)) {
			System.out.println(" Muy rapido");
		}
		if (velocidad <15) {
			System.out.println("Normal ");
			{
				if (velocidad < 10) {
					System.out.println("Lento");
				}
				if (velocidad < 5) {
					System.out.println("camminando");
				}

				velocidad = (int) (Math.random() * 20 + 1);
				System.out.println(velocidad);
				peso = (int) (Math.random() * 3 + 1);
				System.out.println(peso);
				edad = (int) (Math.random() * 3 + 1);
				System.out.println(peso);

			}
		}
	}
}
