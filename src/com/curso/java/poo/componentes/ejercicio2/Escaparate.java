/*Maniqui1: 1 pantalon y 1 camisa
		Maniqui2: Vestido*/

package com.curso.java.poo.componentes.ejercicio2;

public class Escaparate {

	public static void main(String[] args) {

		// como crear los objetos

		Boton boton1 = new Boton("plano", "negro", 10);
		Pantalon pantalon1 = new Pantalon("rojo", 8, 3.5, boton1);

		Boton boton2 = new Boton("redondo", "blanco", 5);
		Boton boton3 = new Boton("redondo", "blanco", 5);

		// coomo crear el array de botones

		Boton[] botones = { boton2, boton3 };
		Camisa camisa1 = new Camisa("azul", 12, 30.0, botones);

		Vestido vestido1 = new Vestido("amarillo", 42, 40.0);

		Maniqui maniqui1 = new Maniqui(1);

		Maniqui maniqui2 = new Maniqui(2, vestido1);
		Maniqui maniqui3 = new Maniqui(3, pantalon1, camisa1);

		// crear array

		Maniqui[] maniquies = { maniqui1, maniqui2, maniqui3 };

		// como acceder a una posicion en el array

		maniquies[0].getId();
		System.out.println(maniquies[0].getId());

		maniquies[1].getVestido().getColor();
		System.out.println("Maniqui1 tienes un Vestido  " + " Color " + maniquies[1].getVestido().getColor() + " Talla "
				+ maniquies[1].getVestido().getTalla() + " Precio " + maniquies[1].getVestido().getPrecio());

		maniquies[2].getPantalon();
		maniquies[2].getCamisa();
		System.out.println("Maniqui2 " + "Color " + maniquies[2].getPantalon().getColor() + " Precio  "
				+ maniquies[2].getPantalon().getPrecio() + " Talla " + maniquies[2].getPantalon().getTalla());
		System.out.println("Maniqui2 " + "Color " + maniquies[2].getCamisa().getColor() + "Talla  "
				+ maniquies[2].getCamisa().getTalla() + " Precio " + maniquies[2].getCamisa().getPrecio() + " boton  "
				+ maniquies[2].getCamisa() + botones);

		// como saber si tiene vestido

		for (Maniqui maniqui : maniquies) {
			if (maniqui.getVestido() != null) {
				System.out.println(maniqui.getVestido().getColor());

			}
		}

		// como desvestir el maniqui

		maniqui1.setId(1);
		maniqui2.setVestido(null);
		maniqui3.setPantalon(null);
		maniqui3.setCamisa(null);
		System.out.println("maniqui3" + maniqui3.getCamisa() + maniqui3.getPantalon());

		// como llamar al metodo desvetir

		maniqui1.desveestir();
		maniqui2.desveestir();
		maniqui3.desveestir();
		System.out.println("maniqui3" + maniqui3.getCamisa());

		// como llamar metodo vestir
		
		Vestido vestido2 = new Vestido("rosa", 42, 40.0);
		maniqui2.vestir(vestido2);
		
		// como llamar al metodo

		mostrarescaparate(maniquies);

	}
	// coomo pasar un metodo y mostrar si esta desnudo o vestido

	public static void mostrarescaparate(Maniqui[] maniquis) {

		for (Maniqui maniqui : maniquis) {
			System.out.println("\nmaniqui con id " + maniqui.getId());

			if (maniqui.getVestido() != null) {// si tiene vestido
				System.out.println("datos del vestido");
				System.out.println("\tColor" + maniqui.getVestido().getColor());
				System.out.println("\tPrecio" + maniqui.getVestido().getPrecio());
				System.out.println("\tTalla" + maniqui.getVestido().getTalla());

			}
			if (maniqui.getCamisa() != null) {// si tiene camisa
				System.out.println("datos del vestido");
				System.out.println("\tColor" + maniqui.getCamisa().getColor());
				System.out.println("\tPrecio" + maniqui.getCamisa().getPrecio());
				System.out.println("\tTalla" + maniqui.getCamisa().getTalla());

			} else {
				System.out.println("esta desnudo");
			}

		}

	}

}
