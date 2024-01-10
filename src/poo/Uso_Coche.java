package poo;
import javax.swing.*;
import java.lang.*;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog(" Introduce color... "));
		
		System.out.println(micoche.dime_datos_generales());
		
		
		
		
		System.out.println(micoche.dime_color());
		
		//micoche.configura_asientos(JOptionPane.showInputDialog(" ¡Tiene asientos de cuero? "));
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		//micoche.configura_asientos(JOptionPane.showInputDialog("Tienes climatizador "));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println(" el precio final del coche es " + micoche.precio_coche());
		
		
		
	}

	
	
}

//micoche.configura_asientos(JOptionPane.showInputDialog(" ¡Tiene asientos de cuero? "));
