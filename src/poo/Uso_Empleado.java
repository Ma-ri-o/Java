package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato =  calendario.getTime();

	}
	
	
	public String dame_nombre() {
		
		return nombre;
	}

	private String nombre;

	private double sueldo;

	private Date altaContrato;
}
