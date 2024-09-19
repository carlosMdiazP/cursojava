package com.curso.java.poo.ejercicio1;

import java.util.Scanner;

import com.curso.java.utils.Utilidades;

public class Alumno {

	// variables de instancia

	private String dni;
	private String nombre;
	private String apellido;
	private boolean mayoredad;
	private int nota;

	// 4 constructores

	public Alumno() {

	}

	public Alumno(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;

	}

	public Alumno(String dni, String nombre, String apellido, int nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;

	}

	public Alumno(String dni, String nombre, String apellido, int nota, boolean mayoredad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.mayoredad = mayoredad;

	}

	// Metodo get y set

	public String getDni() {
		return this.dni;

	}

	public String setDni(String dni) {
		return this.dni = dni;

	}

	public String setNombre(String nombre) {
		return this.nombre = nombre;

	}

	public String getNombre() {
		return this.nombre;

	}

	public String setApellido(String apellido) {
		return this.apellido = apellido;

	}

	public String getApellido() {
		return this.apellido;

	}

	public int getNota() {
		return this.nota;

	}

	public int setNota(int nota) {
		return this.nota = nota;

	}

	public boolean setMayoredad(boolean mayoredad) {
		return this.mayoredad = mayoredad;

	}

	public boolean isMayoredad() {
		return this.mayoredad;

	}

	// Metodo
	public void verNota() {

		if (mayoredad) {
			if (this.nota == 0) {
				System.out.println("El alumno  no ha estudiado nada");
			} else if (this.nota < 5) {
				System.out.println("Ha estudiado poco:");
			} else if (this.nota < 9) {
				System.out.println("Ha estudiado Mucho");
			} else if (this.nota <= 10) {
				System.out.println("Es un Genio");
			}

		} else {
			System.out.println("No se puede mostrar la nota");
		}

	}

}
