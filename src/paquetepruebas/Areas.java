import javax.swing.*;
import java.util.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");

		int figura = entrada.nextInt();

		switch (figura) {

		case 1:

			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El área del cuadrado es " + Math.pow(lado, 2));

			break;

		case 2:

			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));

			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));

			System.out.println("El área del rectangulo es " + base * altura);

			break;

		case 3:

			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));

			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));

			System.out.println("El área del triangulo " + (base * altura) / 2);

			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio "));
			
			System.out.print("El área del circulo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			
			System.out.print(" no es una opción correcta");
			


		}
	}
}
