import javax.swing.*;
import java.util.*;

public class Ejercicios_EntradaDatos {

	public static void main(String[] args) {
		
		
		
		/*		Ejercicio  9
		Escribe un programa que calcule el volumen de un cono según la fórmula V    =
		1
		3 πr
		2h*//*
		
		
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del cono"));
		
		Double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del cono"));
		
		System.out.print("El volumen del cono es:\t " );
		
		System.out.printf("%1.2f", ((altura * Math.PI * Math.pow(radio, 2))/3));

		*/		
		
		
		
		
		
		
		/*		Ejercicio  12
		Escribe un programa que calcule el precio final de un producto según su 
		base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, 
		reducido o superreducido) y el código promocional. Los tipos de IVA general, 
		reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi- 
		gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan 
		respectivamente que no se aplica promoción, el precio se reduce a la mitad, 
		se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se 
		muestran los valores correctos, aunque los números no estén tabulados.
		Ejemplo:
		Introduzca la base imponible: 25
		Introduzca el tipo de IVA (general, reducido o superreducido): reducido
		Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad 
		Base imponible       25.00
		TOTAL
		IVA (10%)
		Precio con IVA 27.50 
		Cód. promo. (mitad): -13.75
		2.50
		13.7*/
		
		
		
		
		
		
		/*	Ejercicio  8
		Escribe un programa que calcule el salario semanal de un empleado en base 
		a las horas trabajadas, a razón de 12 euros la hora. *//*
		
		Double horas_trabajadas = Double.parseDouble(JOptionPane.showInputDialog("Introduce las horas trabajadas esta semana"));
		
		System.out.println("Has trabajado esta semana un total de " + horas_trabajadas);
		
		System.out.println("El salario de esta semana es de \t" + (horas_trabajadas * 12));

		*/		
		
		
		
		/*	Ejercicio  7
		Escribe un programa que calcule el total de una factura a partir de la base 
		imponible.*/
		
		/*
		 
		Double base_imponible =  Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe de la factura por favor"));
		
		System.out.println("El importe neto de la factura es: " + base_imponible);
		
		System.out.println("El importe de la factura aplicando un IVA del 21% es de " + (base_imponible + (base_imponible * 0.21))
				+ " euros respectivamente");
		
		*/		 
		
		
		
		
		/*	Ejercicio  5
		Escribe un programa que calcule el área de un rectángulo.
			
			Ejercicio  6
		Escribe un programa que calcule el área de un triángulo.*/
		
		/*
		
		Scanner entrada = new Scanner(System.in);
		
		Double base;
		
		Double altura;
		
		System.out.println("Para el calculo de su area, introduce: \n1: Rectangulo \n2: Trianglo");
		
		int numero = entrada.nextInt();
		
		switch (numero) {
		
		case 1:
			
			System.out.println("Introduce la base");
			
			base = entrada.nextDouble();
			
			System.out.println("Introduce la altura");
			
			altura = entrada.nextDouble();
			
			System.out.println("El area del rectangulo es " + (base * altura));
			
			break;

		case 2:
			
			System.out.println("Introduce la base");
			
			base = entrada.nextDouble();
			
			System.out.println("Introduce la altura");
			
			altura = entrada.nextDouble();
			
			System.out.println("El area del triangulo es " + (base * altura)/2);
			
			break;

		default:
			
			System.out.println("No has seleccionado ninguna de las opciones");

		
		}
		
		
		
		*/		
		
		
		
		
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
