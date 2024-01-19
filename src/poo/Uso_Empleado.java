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

		Jefatura jefe_RRHH = new Jefatura("Juan", 17500, 2023, 01, 12);

		jefe_RRHH.estableceIncentivo(3500);

		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Ana", 15600, 1994, 01, 19);

		misEmpleados[1] = new Empleado("Carlos", 15600, 1992, 04, 11);

		misEmpleados[2] = new Empleado("Paco ", 15600, 1990, 10, 10);

		misEmpleados[3] = new Empleado("Antonio", 3000, 2022, 02, 02);

		misEmpleados[4] = jefe_RRHH; // poliformismo en acción. Principio de sustitución

		misEmpleados[5] = new Jefatura("Maria", 9500, 1999, 5, 30);

		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];

		jefa_finanzas.estableceIncentivo(55000);
		
		Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05,05);
		
		Comparable ejemplo = new Empleado ("Elisabeth", 95000, 2011, 06,06);// Principio de sustitución
		
		if(director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("implementa la interfaz comparable");
			
		}
		
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		
		

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
		
			Arrays.sort(misEmpleados); //

		for (Empleado e : misEmpleados) {

			System.out.println("Nombre: " + e.dame_nombre() + " sueldo " + e.dameSueldo() + " Fecha de Alta "
					+ e.dameFechaContrato());

		}

	}

}

class Empleado  implements Comparable {

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
	
	/**
	 * Compare to.
	 *
	 * @param miObjeto the mi objeto
	 * @return the int
	 */
	public int compareTo(Object miObjeto) { //se sobre escribe el metodo de la interfaz comparable
		
		Empleado otroEmpleado=(Empleado) miObjeto; //refundición  //creando objet otroEmpleado
		
		if(this.Id<otroEmpleado.Id) { 
			
			return -1;
			
		}
		
		if(this.Id>otroEmpleado.Id) {
			
			return 1;
		} 
		
		return 0;
		
		
	}

	private String nombre;

	private double sueldo;

	private Date altaContrato;

	private static int IdSiguiente;

	private int Id;

}

class Jefatura extends Empleado implements Jefes {

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {
		
		return "un mimembro de la dirección ha tomado la decisión de: " + decision;
	}

	public void estableceIncentivo(double b) {

		incentivo = b;
	}

	public double dameSueldo() {

		double sueldoJefe = super.dameSueldo();

		return sueldoJefe + incentivo;
	}

	private double incentivo;

}

class Director extends Jefatura {

	public Director(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia) ;
		
		
		
		
		
		
	}
	
	
	

}
