import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nombre_uruario=JOptionPane.showInputDialog("Introduce tú nombre, por favor");
		
		String edad=JOptionPane.showInputDialog(" \"Introduce tú edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		
		
		System.out.println("Hola " + Nombre_uruario + " El año que viene tendras  " + edad_usuario + " años ");
		
		

		
		
	}

}
