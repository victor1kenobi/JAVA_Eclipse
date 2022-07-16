import java.util.*;

public class While_Ejemplo_RandomNumber {

	public static void main(String[] args) {

		int aleatorio = (int)((Math.random()) * 100);//metodo Random entre 0 y 1
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		do  {
			
			intentos++;
			
			System.out.println("Introduce un numero por favor");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("el numero es mas bajo");
				
			}else if (aleatorio > numero) {
					
				System.out.println("el numero es mas alto");

				}
			
			}while(numero != aleatorio);
		
		System.out.println("Correcto lo has conseguido en " + intentos + " intentos ");

			
		}
			
		
		
		
	}
