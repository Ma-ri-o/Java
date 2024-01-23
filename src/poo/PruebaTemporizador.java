package poo;

import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

import javax.swing.Timer;
public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DameLaHora oyente = new DameLaHora();
		
		ActionListener oyente = new DameLaHora();
		
		

		Timer mitemporizador = new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		
		

	}

}

class DameLaHora implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 sg " + ahora );
		
		Toolkit.getDefaultToolkit().beep();

	}

}
