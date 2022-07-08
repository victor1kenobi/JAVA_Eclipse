
public class ClaseMath {

	public static void main(String[] args) {
		
		
		//double raiz = Math.sqrt(9.52);
		
		//intellisense nos indica que tipos de valores debemos de utilizar para Math.round
		
		/*float num1 = 5.85F;
		
		int resultado = Math.round(num1);
		
		System.out.println(resultado);
		
		*/
		
		/*En caso de querer usar un tipo distinto al que establece la clase, se puede usar la REFUNDICION
		 * poniendo entre parentesis el tipo de dato que queremos convertir el resultado
		 */
		
		/*double num1 = 5.85;
		
		int resultado = (int)Math.round(num1);
		
		
		System.out.println(resultado);
		
		*/
		//Ejemplo metodo POW con REFUNDICION
		
		double base = 5;
		
		double exponente = 3;		
		
		int resultado = (int)Math.pow(base, exponente);
		
		
		System.out.println("El resultado de " + (int)base + " elevado a " + exponente + " es " + resultado);
		
		
		
		
		

	}

}
