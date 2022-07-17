import javax.swing.*;

public class Bucle_For_Factorial {

	public static void main(String[] args) {

		long resultado = 1L; //Importante el alcance para no desbordar con los factoriales BigInteger..Long...
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for (int i = numero; i > 0; i--) {
			
			resultado = resultado * i;
			
			System.out.println("El valor de resultado en la vuelta numero " + i + " es " + resultado);

		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
		
		
	}

}
