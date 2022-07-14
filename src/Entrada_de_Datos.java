import java.util.*;

public class Entrada_de_Datos {

	public static void main(String[] args) {
		
		// SE UTILIZA EL CONSTRUCTOR DE LA API DE JAVA PARA CREAR EL OBJETO (INSTANCIAR) DE TIPO SCANNER
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre seguido de un espacio y tu apellido");
		
		/*PARA QUE SE PUEDA INTRODUCIR LA INFO POR CONSOLA HAY QUE USAR LOS METODOS NEXT.INT, NEXT.DOUBLE, NEXT.LINE, AL SER METODOS
		NO ESTATICOS HAY QUE HABER CREADO ANTES UN OBJETO TIPO SCANNER*/
		
		String nombre_usuario = entrada.next(); // CON SCANNER NEXT SE PUEDEN METER VAFRIOS PARAMETROS DE UNA VEZ
		
		String apellido_usuario = entrada.nextLine();/*SE PUEDE USAR NEXTLINE Y HACER 2 ENTRADAS EN VEZ DE LOS 2 PARAMETROS
		SEPARADOS POR UN ESPACIO*/

		System.out.println("Introduce tu edad por favor");
		
		int edad_usuario = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + apellido_usuario + ".\tEl año que viene tendrás " + (edad_usuario + 1) + " años");



		
		
	}

}
