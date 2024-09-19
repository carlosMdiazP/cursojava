package com.curso.java.poo;

public class Persona {

	// Variables de instancia o atributos

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	// Definicion de constructor

	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	// Metodos get y set (getter y setter)

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public int getEdad() {
		return this.edad;

	}

	public String getDni() {
		return this.dni;
	}

	// Metodos

	public void correr() {
		System.out.println("la persona " + nombre + " esta corriendo");
		if (edad < 20) {
			System.out.println(" Muy rapido");
			{
				if (edad < 40) {
					System.out.println(" Lento");
					{
						if (edad < 30) {
							System.out.println("Normal");
						}
					}
				}
			}
		}
	}

	public void comer() {

		System.out.println("la persona " + nombre + " esta comiendo");

	}

}
