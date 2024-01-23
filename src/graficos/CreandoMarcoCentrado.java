package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame {

	public MarcoCentrado() {

		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(alturaPantalla/4, anchoPantalla/4);
		
		setTitle("marcoCentral");
		
		Image miIcono=mipantalla.getImage("icono.gif");
		
		setIconImage(miIcono);
		
		
		
		
		
	}

}
