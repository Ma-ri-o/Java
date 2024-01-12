package poo;

import java.util.*;

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
		
		Jefatura jefe_RRHH=new Jefatura("jefazo", 17500, 2023, 01, 12);
		
		jefe_RRHH.estableceIncentivo(3500);
		
		
		
		
		

		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Mario Toriz", 15600, 1994, 01, 19);
		
		misEmpleados[1] = new Empleado("otro", 15600, 1992, 04, 11);
		
		misEmpleados[2] = new Empleado("otro más ", 15600, 1990, 10, 10);
		
		misEmpleados[3] = new Empleado("jirafales", 3000, 2022, 02, 02);
		
		misEmpleados[4] = jefe_RRHH; //poliformismo en acción. Principio de sustitución
		
		misEmpleados[5] = new Jefatura("Maria", 9500, 1999, 5, 30);
		
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
		
		jefa_finanzas.estableceIncentivo(55000);
		
		

		/*
		 * for(int i=0; i<3; i++) {
		 * 
		 * misEmpleados[i].subeSueldo(5); }
		 */
		for (Empleado e : misEmpleados) { // for each

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
			
			System.out.println("Nombre: " + e.dame_nombre() + " sueldo " 
			        + e.dameSueldo() + " Fecha de Alta "
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
		
		IdSiguiente++;
		
		Id = IdSiguiente;

		

	}

	public Empleado(String nom) {

		this(nom, 30000, 2000, 01, 01); // this llamá al otro constructor de la clase.

	}

	public String dame_nombre() {

		return nombre + " Id: " + Id;
	}

	public double dameSueldo() {

		return sueldo;
	}

	public Date dameFechaContrato() {

		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

	private String nombre;

	private double sueldo;

	private Date altaContrato;

	private static int IdSiguiente;

	private int Id ;

}

class Jefatura extends Empleado {

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);
	}

	public void estableceIncentivo(double b) {

		incentivo = b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}

	private double incentivo;

}
