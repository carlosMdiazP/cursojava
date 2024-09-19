package com.curso.java.poo.componentes.ejercicio2;

public class Vestido {
	//variables instancia
	
	private String color;
	private int talla;
	private double precio;
	
	//constructores
	
	public Vestido(String color, int talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	//getter y setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
