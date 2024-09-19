package com.curso.java.inicio.condicionales.ejercicio;

import java.util.Scanner;

public class EjercicioEaluaciones {

	public static void main(String[] args) {
		
		double calificacionfinal =  0;
		
		
		//solicite lsa calificaciones de los examenes,
//los proyectos y la participacion de tres estudiantes
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce nombre del alumno 1");
		String nombreAlumno1 = scan.nextLine();
		
		scan = new Scanner(System.in);
		System.out.println("Introduce la nota del examen 1 del alumno 1");
		double notaExamen1 = scan.nextDouble();
		
		scan = new Scanner(System.in);
		System.out.println("Introduce la nota del examen 2 del alumno 1");
		double notaExamen2 = scan.nextDouble();
		
		scan = new Scanner(System.in);
		System.out.println("Introduce la nota del Proyecto 1 del alumno 1");
		double notaProyecto1Alumno1 =scan.nextDouble();
		
		scan = new Scanner(System.in);
		System.out.println("Introduce la nota del Proyecto 2 del alumno 1");
		double notaProyecto2Alumno1 =scan.nextDouble();
		scan = new Scanner(System.in);
		
		//
		
		//Calculo la media de los dos examenes
		double notaMediaExamenAlumno1 = (notaExamen1Alumno1+notaExamen1alumno1);
		if (notaMediaExamenAlumno1<50) {
			System.out.println("el alumno " +nombreAlumno1+ " esta suspenso");
		}else {
			double notaMediaProyectosAlumno1 = (notaparticipacionAlumno + nota);
		}
	}

}
