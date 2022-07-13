
import javax.swing.*;

public class Entrada_de_Datos_II {

	public static void main(String[] args) {

		String 	nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad por favor"); //SIEMPRE DEVUELVE STRING
		
		int edad_usuario = Integer.parseInt(edad); //UTILIZAMOS INTEGER.PARSEINT PARA CAMBIAR A INT EL STRING
		
		System.out.println("Hola " + nombre_usuario + " el año que vienes tendrás " + (++edad_usuario) + " años.");
		
		
		
		
	}

}
