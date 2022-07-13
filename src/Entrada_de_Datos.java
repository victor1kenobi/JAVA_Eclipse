import java.util.*;

public class Entrada_de_Datos {

	public static void main(String[] args) {
		
		// SE UTILIZA EL CONSTRUCTOR DE LA API DE JAVA PARA CREAR EL OBJETO (INSTANCIAR) DE TIPO SCANNER
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre por favor");
		
		/*PARA QUE SE PUEDA INTRODUCIR LA INFO POR CONSOLA HAY QUE USAR LOS METODOS NEXT.INT, NEXT.DOUBLE, NEXT.LINE, AL SER METODOS
		NO ESTATICOS HAY QUE HABER CREADO ANTES UN OBJETO TIPO SCANNER*/
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad por favor");
		
		int edad_usuario = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario + 1) + " años");



		
		
	}

}
