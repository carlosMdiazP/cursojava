package com.curso.java.inicio.condicionales.ejercicio;

public class EjercicioIf {
	public static void main(String[] args) {
		String asignatura = "Historia";
		String nombreAlumno = "Pepito";
		int nota = 7;
		System.out.println("curso de java");
		System.out.println("Pepito");
		if (nota <= 5) {
			System.out.println("El alumno " + nombreAlumno + " en la asignatura " + asignatura + " tiene un" + nota);

		}

		else if (nota >= 5 && nota <= 7) {
			System.out.println("El alumno " + nombreAlumno + " en la asignatura " + asignatura + " tiene un " + nota);
		} else if (nota >= 8 && nota < 9) {
			System.out.println("El alumno " + nombreAlumno + " en la asignatura " + asignatura + " tiene un " + nota);
		}

		else if (nota >= 9 && nota <= 10) {
			System.out.println("la nota es sobresaliente");
		} else {
			System.out.println("no es valido");
		}
	}

}
