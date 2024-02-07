package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuente mimarco = new MarcoConFuente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoConFuente extends JFrame {
	
	public MarcoConFuente() {
		setTitle("Prueba con Fuentes");
		
		setSize(400, 400);
		
		LaminaConFuentes milamina= new LaminaConFuentes();
		
		add(milamina);
		
		milamina.setForeground(Color.pink);
	}
}

class LaminaConFuentes extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente= new Font("Curier", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		//g2.setColor(Color.BLUE);
		
		g2.drawString("Mario", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 14));
		
		//g2.setColor(new Color(128,90,50).brighter());
		
		g2.drawString("Curso de Java", 100, 200);
	}
}