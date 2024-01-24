package graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JFrame;

public class EscribiendoEnMarco {

	public static void main(String[] args) {

		MarcoConTexto mimarco = new MarcoConTexto();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Lamina milamina = new Lamina();

		mimarco.add(milamina); // Agregar la lámina al marco

	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		setVisible(true);

		setSize(600, 450);

		setLocation(400, 200);

		setTitle("Primer texto");
	}
}

class Lamina extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}
