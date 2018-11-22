 import java.util.Random;
 import java.util.Scanner;
 
 public class ejercicio2_Vectores {
 
 	/*
 	 * Programa que cree un vector de números enteros de un tamaño
 	 * especificado por el usuario, mayor o igual que 10 y menor o 
 	 * igual que 1.000.000. El vector se llenará con números
 	 * aleatorios comprendidos entre -999.999 y 1.000.000 sin repetir
 	 * ninguno. A continuación mostrará el tamaño del vector, el tiempo
 	 * empleado en llenarlo, la diferencia entre el menor y el mayor
 	 * de los números almacenados en el vector y el tiempo empleado en
 	 * obtener dicha diferencia.
 	 * 
 	 */
 	
 	public static void main(String[] args) {
 		Scanner in = new Scanner(System.in);
 		int n;
 		do {
 			System.out.println("Tamaño del vector (entre 10 y 1.000.000): ");
 			n = in.nextInt();
 			if (n < 10 || n > 1000000)
 				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 10 y 1.000.000");
		} while (n < 10 || n > 1000000);
		int [] vector = new int[n];
		Random r = new Random();
//		long t0 = System.currentTimeMillis();
		long t0 = System.nanoTime();
		for (int i=0; i<n; i++) {
			int valor;
			do {
				valor = r.nextInt(2000000) - 999999;
			} while (repetido(vector, valor, i - 1));
			
			vector[i] = valor;
		}
		long t1 = System.currentTimeMillis();
		tiempoTranscurrido("Tiempo empleado en crear el vector", t1 - t0);
		
//		for (int i=0; i<n; i++) {
//			System.out.print(vector [i] + "  ");
//		}
//		System.out.println();
		tiempoTranscurrido("Tiempo empleado en crear el vector", System.nanoTime() - t0);
		
		t0 = System.nanoTime();
		
		int mayor = vector[0];
		int menor = vector[0];
		
		for(int i = 1; i < vector.length; i++) {
			if(menor > vector [i])
				menor = vector [i];
			if(mayor< vector [i])
				mayor = vector [i]; 
		}
		System.out.println("Número mayor= " + mayor);
		System.out.println("Número menor= " + menor);
		System.out.println("Diferencia = " + (mayor - menor));
				
		tiempoTranscurrido("Tiempo empleado en calcular la diferencia entre el mayor y el menor", System.nanoTime() - t0);
		
		in.close();
	}
	
	static boolean repetido(int [] vector, int valor, int p) {
 		for (int i=0; i<=p; i++) {
 			if (vector[i] == valor) {
 				return true;
 			}
 		}
 		return false;
	}
	
	static void tiempoTranscurrido(String msg, long t) {
//		long m = t / 60000;
//		t = t % 60000;
//		long s = t / 1000;
//		t = t % 1000;
		long m = t / 60000000000L;
		t = t % 60000000000L;
		long s = t / 1000000000L;
		t = t % 1000000000L;
		System.out.print(msg + ": ");
		System.out.println(m + "m " + s + "s " + t + "ms");
		System.out.println(m + "m " + s + "s " + t + "ns");
		
		
	}
}