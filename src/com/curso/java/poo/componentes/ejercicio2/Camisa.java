package com.curso.java.poo.componentes.ejercicio2;

public class Camisa {
//variables de instancia
	
	private String color;
	private int talla;
	private double precio;
	private Boton[] boton;
	
	//constructores
	
	public Camisa(String color, int talla, double precio, Boton[] boton) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
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

	public Boton[] getBoton() {
		return boton;
	}

	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}
	
	
	
}
