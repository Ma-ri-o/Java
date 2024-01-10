package poo;

public class Coche {

	int rueda;

	int largo;

	int ancho;

	int motor;

	int peso_plataforma;

	String color;

	int peso_total;

	boolean asientos_cuero, climatizador;

	public Coche() {

		rueda = 4;

		largo = 2000;

		ancho = 300;

		motor = 1600;

		peso_plataforma = 500;

	}

	public String dime_datos_generales() {

		return "La plataforma del vehículo tiene " + rueda + " ruedas " + ". Mide " + largo / 1000
				+ " metros con un ancho " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
	}

	public void establece_color(String color_coche) {

		color = color_coche;
	}

	public String dime_color() {
		return " El color del coche es " + color;
	}

	public void configura_asientos(String asientos_cuero) {

		if (asientos_cuero == "si") {

			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}

	}

	public String dime_asientos() {

		if (asientos_cuero == true) {

			return " El coche tiene asientos de cuero";
		} else {
			return " EL coche tiene asientos de serie";

		}

	}

}
