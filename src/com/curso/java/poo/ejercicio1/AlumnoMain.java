package com.curso.java.poo.ejercicio1;

import com.curso.java.utils.Utilidades;

public class AlumnoMain {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno();
		alumno1.setDni("0A");
		alumno1.setNombre("Emma");
		alumno1.setApellido("Perez");
		alumno1.setNota(6);
		alumno1.setMayoredad(true);
		System.out.println(alumno1.getNombre());
		
		Alumno alumno2 = new Alumno("1A", "Pepito", "Barco", 8, true);
		alumno2.setNota(8);
		alumno2.setMayoredad(true);
		
		System.out.println(alumno2.getDni() + " " + alumno2.getNombre() + " " + alumno2.getApellido());

		Alumno alumno3 = new Alumno("2A", "Maria", "Barsenas", 7, true);

		alumno3.setMayoredad(true);
		

		System.out.println(alumno3.getDni() + " " + alumno3.getNombre() + " " + alumno3.getApellido() + "  Nota  "
				+ alumno3.setNota(7));

		Alumno alumno4 = new Alumno("3A", "luz", "Barquillo", 3, true);

		System.out.println(alumno4.getDni() + " " + alumno4.getNombre() + " " + alumno4.getApellido() + " Nota "
				+ alumno4.setNota(8));
		
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		alumno4.verNota();
		
		Alumno[]alumnos= {alumno1,alumno2,alumno3,alumno4};
		Alumno a = alumnos[alumnos.length-1];
		System.out.println(a.getApellido());
		
		System.out.println("han aprobado");
	

		//como crear metodos  desde Main
		
		
		
		AlumnoMain alumnoMain =new AlumnoMain();
		alumnoMain.mostarInfoAlumno(alumnos);

	}

	
	public void mostarInfoAlumno(Alumno[]alumnos) {
		for(Alumno alumno: alumnos) {
			int nota= alumno.getNota();
			if(nota>=5) {
				System.out.println(alumno.getNombre()+ " " +alumno.getApellido()+" " +nota);	
			}
		
		}
		
	}
}
