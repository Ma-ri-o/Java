package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		
		
		String fuente=JOptionPane.showInputDialog("Introduce la fuente ");
		
		
		boolean estalafuente=false;
			
			
		// TODO Auto-generated method stub
		
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: nombresDeFuentes ) {
			
			if(nombredelafuente.equals(fuente)) {
				
				estalafuente=true;
			}
		}
		
		if(estalafuente) {
			
			System.out.println("Fuente instalada");
			
			
		}else {
			
			System.out.println("No esta instalada");
			
		}

	}

}
