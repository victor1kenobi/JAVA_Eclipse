
public class Manipula_Strings_II {

	public static void main(String[] args) {

		
	String frase = "Hoy es un estupendo dia para aprender a programar en JAVA";
	
	//el primer parametro es el que queremos que aparezca y el segundo el que no queremos que salga
	
	//String frase_resumen = frase.substring(29, frase.length());
	
	String frase_resumen = frase.substring(0,29) + "irnos a la playa y olvidarnos de todo..." + " y " + frase.substring(29, 57);
	
	System.out.println(frase_resumen);
		
		

	}

}
