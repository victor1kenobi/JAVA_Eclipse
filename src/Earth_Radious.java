
public class Earth_Radious {

	public static void main(String[] args) {
		
		final double distance = 10007.56F; //Distancia entre el Polo y el Ecuador

		final double circunference = Math.scalb(distance, 2);
		
		double earth_Radious = circunference / (2 * Math.PI);
		
		double earth_Radious2 = Math.pow(earth_Radious, 2);
		
		double earth_area = 4 * Math.PI * earth_Radious2;
		
		System.out.println("La distancia entre el ecuador y el Polo Norte es de: " + distance + " kilometros");
		
		System.out.println("Podemos deducir por tanto que la medida de la circunferencia de la tierra es " + distance + " x 4" + " = "
				+ circunference + " kilometros");
		
		System.out.println("c = 2 * PI * Earth_Radious  => Earth_Radious = c / 2 * PI");
		
		System.out.println("Earth_Radious = " + earth_Radious + " kilometros");
		
		System.out.println("Y el area de la tierra sería de 4 * PI * radio al cuadrado = " + earth_area + " = " 
		
			+ (long)earth_area + " kilometros cuadrados");





	}

}
