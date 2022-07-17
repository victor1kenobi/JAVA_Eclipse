import javax.swing.JOptionPane;

public class Bucle_Prueba_Comprueba_Mail {

	public static void main(String[] args) {

		
		int arroba = 0;
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce el email");
		
		for (int i = 0; i < mail.length(); i++) {
			
			if (mail.charAt(i) == '@') {
				
				arroba++;
				
			}
			
			if (mail.charAt(i) == '.') {
				
				punto = true;
			}

		}
		if (arroba == 1 && punto == true) {
			
			System.out.println("Es correcto");

			
		}else {
			
			System.out.println("No es correcto");

		}
		
		
		
	}

}
