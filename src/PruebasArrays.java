
public class PruebasArrays {

	public static void main(String[] args) {
		// Dentro del par�ntesis se declara un array a una o varias referencias de tipo
		// String

		int[] x = { 47, 31, 2, 5 };

		//Opci�n 1
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] * 4);
		}
		System.out.println();
		
		//Opci�n 2
		for (int e:x)
			System.out.println(e*4);
		System.out.println();
		
		//Opci�n inversa 
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i] * 4);
		}

	}

}
   