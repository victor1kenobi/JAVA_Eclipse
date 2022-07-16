import javax.swing.*;

public class While_Ejemplo_Peso_Ideal {

	public static void main(String[] args) {

		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		}while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros"));
		
		int peso_ideal = 0;
				
		if (genero.equalsIgnoreCase("H") == true) {
			
			peso_ideal = altura - 110;
			
		}else {
			
			peso_ideal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es " + peso_ideal + " kg");

		
	}

}
