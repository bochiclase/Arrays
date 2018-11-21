
public class PruebasArrays {

	public static void main(String[] args) {
		// Dentro del paréntesis se declara un array a una o varias referencias de tipo
		// String

		int[] x = { 47, 31, 2, 5 };

		//Opción 1
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] * 4);
		}
		System.out.println();
		
		//Opción 2
		for (int e:x)
			System.out.println(e*4);
		System.out.println();
		
		//Opción inversa 
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i] * 4);
		}

	}

}
   