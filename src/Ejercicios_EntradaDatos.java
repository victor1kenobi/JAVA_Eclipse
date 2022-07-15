import javax.swing.*;
import java.util.*;

public class Ejercicios_EntradaDatos {

	public static void main(String[] args) {
		
		/*		Ejercicio  2
		Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
		convertir debe ser introducida por teclado.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros que quieres convertir a pesetas");
		
		int euro = entrada.nextInt();
		
		Double pesetas = (euro * 166.386);
		
		Long pesetas_redondeo = Math.round(pesetas);
		
		System.out.print(euro + " euros son: \t " + pesetas_redondeo + " pesetas.");

		
		
		
		
		
		
		
		/*		Ejercicio  1
		Realiza un programa que pida dos números y que luego muestre el resultado 
		de su multiplicación.*//*
		
		String num1 = JOptionPane.showInputDialog("Introduce el primer numero (puede ser con decimales)");
		
		Double num1_1 = Double.parseDouble(num1);
		
		String num2 = JOptionPane.showInputDialog("Introduce el segundo numero (puede ser con decimales)");

		Double num2_1 = Double.parseDouble(num2);
		
		Double resultado = (num1_1 * num2_1);
		
		System.out.print("El resultado de la multiplicación es:\t");
		
		System.out.printf("%1.2f", resultado);
		
		*/
		
			

	}

}
