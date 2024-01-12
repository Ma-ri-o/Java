package poo;

public class prueba {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("paco");

		Empleados trabajador2 = new Empleados("Ana");

		Empleados trabajador3 = new Empleados("Paola");

		Empleados trabajador4 = new Empleados("Mario");
		
		

		trabajador1.cambiaSeccion("RRHH");
		
		

		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos());

		System.out.println(trabajador3.devuelveDatos());

		System.out.println(trabajador4.dameIdSiguiente());

	}

}

class Empleados {

	public Empleados(String nom) { // Constructor

		nombre = nom;

		seccion = "Administración";

		Id = IdSiguiente;

		IdSiguiente++;

	}

	public void cambiaSeccion(String seccion) {// Setter

		this.seccion = seccion;
	}

	public String devuelveDatos() { // Getter

		return "El nombre es: " + nombre + "  la sección es " + seccion + " y el Id= " + Id;
	}

	public static String dameIdSiguiente() {

		return " el Id siguiente es: " + IdSiguiente;
	}

	private final String nombre;

	private String seccion;

	private int Id;

	private static int IdSiguiente = 1;

}
