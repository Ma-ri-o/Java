package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche=new Coche();
		
		micoche.establece_color("verde");
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("i");
		
		System.out.println(micoche.dime_asientos());
		

	}

	
	
}
