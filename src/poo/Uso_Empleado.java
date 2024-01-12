package poo;

import java.util.*;

// TODO: Auto-generated Javadoc

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Empleado empleado1 = new Empleado("Mario Toriz", 85000, 1990, 12, 17);
		 * 
		 * Empleado empleado2 = new Empleado("Pao ana ", 95000, 1991, 11, 11);
		 * 
		 * Empleado empleado3 = new Empleado("   ana ", 75000, 1993, 05, 03);
		 * 
		 * empleado1.subeSueldo(5);
		 * 
		 * empleado2.subeSueldo(5);
		 * 
		 * empleado3.subeSueldo(5);
		 * 
		 * System.out.println("Nombre : "+ empleado1.dame_nombre() + " Sueldo:  " +
		 * empleado1.dameSueldo()+"  Fecha de Alta "+ empleado1.dameFechaContrato());
		 */

		Empleado[] misEmpleados = new Empleado[4];

		misEmpleados[0] = new Empleado("Mario Toriz", 15600, 1994, 01, 19);
		misEmpleados[1] = new Empleado("otro", 15600, 1992, 04, 11);
		misEmpleados[2] = new Empleado("otro más ", 15600, 1990, 10, 10);
		misEmpleados[3] = new Empleado("jirafales");

		/*
		 * for(int i=0; i<3; i++) {
		 * 
		 * misEmpleados[i].subeSueldo(5); }
		 */
		for (Empleado e : misEmpleados) {

			e.subeSueldo(5);

		}

		/*
		 * for(int i=0; i<3; i++) {
		 * 
		 * System.out.println("Nombre: " + misEmpleados[i].dame_nombre() + " sueldo "+
		 * misEmpleados[i].dameSueldo() + "Fecha de Alta" +
		 * misEmpleados[i].dameFechaContrato());
		 * 
		 * }
		 */
		
		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.dame_nombre() + " sueldo " + e.dameSueldo() + " Fecha de Alta "
					+ e.dameFechaContrato());
			
			

		}

	}

}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();

	}
	
	public Empleado(String nom) {
		
		nombre = nom;
	}

	public String dame_nombre() {

		return nombre;
	}

	/**
	 * Dame sueldo.
	 *
	 * @return the double
	 */
	public double dameSueldo() {

		return sueldo;
	}

	/**
	 * Dame fecha contrato.
	 *
	 * @return the date
	 */
	public Date dameFechaContrato() {

		return altaContrato;
	}

	/**
	 * Sube sueldo.
	 *
	 * @param porcentaje the porcentaje
	 */
	public void subeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

	
	private String nombre;

	private double sueldo;

	private Date altaContrato;
}
