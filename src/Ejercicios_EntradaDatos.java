import javax.swing.*;
import java.util.*;

public class Ejercicios_EntradaDatos {

	public static void main(String[] args) {
		
		/*	Ejercicio  5
		Escribe un programa que calcule el área de un rectángulo.
			
			Ejercicio  6
		Escribe un programa que calcule el área de un triángulo.*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	Ejercicio  10
		Realiza un conversor de Mb a Kb.
			
			Ejercicio  11
		Realiza un conversor de Kb a Mb.*//*
		
		Scanner entrada = new Scanner(System.in);
		
		String convertir = "";
		
		Double megabyte = 0.0;
		
		Double kilobyte = 0.0;

		
		do {
			
			System.out.println("Que tipo de dato deseas convertir (MB o KB) ¿?");
			
			convertir = entrada.nextLine();
			
		}while(convertir.equalsIgnoreCase("MB") == false && convertir.equalsIgnoreCase("KB") == false);
		
		if(convertir.equalsIgnoreCase("MB") == true) {
			
			System.out.println("Cuantos MB deseas convertir a KB ¿? ");

			megabyte = entrada.nextDouble();
			
			System.out.println( megabyte + " megabytes son " + (megabyte * 1024) + " kilobytes ");

			
		}else {
			
			System.out.println("Cuantos KB deseas convertir a MB ¿? ");

			kilobyte = entrada.nextDouble();
			
			System.out.println( kilobyte + " kilobytes son " + (kilobyte / 1024) + " megabytes ");
		}
		
		
		*/
		
		
		
		/*		Ejercicio  4
		Escribe un programa que sume, reste, multiplique y divida dos números 
		introducidos por teclado.*//*
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero por teclado");
		
		Double numero1 = entrada.nextDouble();
		
		System.out.println("Introduce otro numero por teclado");
		
		Double numero2 = entrada.nextDouble();
		
		System.out.println("La suma de los numeros es :\t" + (long)(numero1 + numero2) + "\nLa resta de los numeros es:\t" 
		+ (long)(numero1-numero2) + "\nLa multiplicacion de los numeros es:\t" + (long)(numero1 * numero2) + "\nLa division de los numeros es:\t"
		+ (numero1/numero2));

		*/
		
		
		/* 		Ejercicio  3
		Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere 
		convertir debe ser introducida por teclado. *//*
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Introduce las pesetas que quieres convertir a euros");
		
		int pesetas = entrada.nextInt();
		
		Double euro = 166.386;
		
		System.out.print( pesetas + " son :\t");
		
		System.out.printf("%1.2f", (pesetas / euro));

		*/
		
		
		
		
		
		
		
		
		
		/*		Ejercicio  2
		Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
		convertir debe ser introducida por teclado.*//*
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros que quieres convertir a pesetas");
		
		int euro = entrada.nextInt();
		
		Double pesetas = (euro * 166.386);
		
		Long pesetas_redondeo = Math.round(pesetas);
		
		System.out.print(euro + " euros son: \t " + pesetas_redondeo + " pesetas.");

		/*
		
				
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
