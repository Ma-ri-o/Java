package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConImagen mimarco = new MarcoConImagen();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class MarcoConImagen extends JFrame {

	public MarcoConImagen() {

		setTitle("Prueba con Imagen");

		setBounds(750, 300, 300, 200);
		;

		LaminaConImagen milamina = new LaminaConImagen();

		add(milamina);

	}
}

class LaminaConImagen extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		//File miimagen = new File("src/graficos/coche.png");

		try {

			imagen = ImageIO.read(new File ("src/graficos/bola.gif"));

		} catch (IOException e) {

			System.out.println("la imagen no se encuentra");
		}
		
		g.drawImage(imagen, 0, 0, null);
		
		for( int i =0; i<300; i++) {
			
			for (int j=0; j<200; j++) {
				
				g.copyArea(0, 0, 15, 15, 15*i, 15*j);
				
			}
		}
		
	// cd Documents/Curso-java-2024/Poo/PrimerosPasos/

	}

	private Image imagen;
}
