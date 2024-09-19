package com.curso.java.poo.componentes.ejercicio2;

public class Maniqui {

	// variables instancia
	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;

//construtores
	public Maniqui(int id) {
		this.id = id;
	}

	public Maniqui(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;

	}

	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;

		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
//metodo desvestir al maniqui

	public void desveestir() {

		this.vestido = null;
		this.camisa = null;
		this.pantalon = null;
	}
	public boolean estaDesnudo() {
		boolean desnudo =false;
		if(this.vestido==null && this.camisa==null && this.pantalon==null) {
			desnudo =true;
		}
				return desnudo;
	}

//metodo vestir al maniqui con sobrecarga

	public void vestir(Vestido vestido) {

		//se inicializa la variable del objeto
		
		this.vestido = vestido;
	}

	public void vestir(Pantalon pantalon) {
		
		this.pantalon = pantalon;

	}
	public void vestir(Camisa camisa) {
		
		this.camisa=camisa;
		
	}
	
	// metodo Precio Ropa

	public void mostrarPreciodeLaropa() {

		this.vestido.getPrecio();
		this.pantalon.getPrecio();
		this.camisa.getPrecio();
	}
}
