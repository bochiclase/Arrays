import java.util.Random;
import java.util.Scanner;

public class ejercicio1_Vectores {
	
//	  Programa que cree un vector de números enteros de un tamaño especificado por
//	  el usuario, mayor que 1 y menor o igual que 50. El vector se llenará con
//	  números aleatorios comprendidos entre -100 y 100 sin repetir ninguno. A
//	  continuación se creará un segundo vector que contenga los elementos del
//	  anterior almacenados en orden inverso.


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.println("Tamaño del vector (entre 1 y 50): ");
			n = in.nextInt();
			if (n < 2 || n > 50)
				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 1 y 50");
		} while (n < 2 || n > 50);
		int[] vector = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			vector[i] = r.nextInt(201) - 100;
		}
		int[] vectoralreves = new int[vector.length];
		for (int i = 0; i < n; i++) {
			vectoralreves[vector.length - i - 1] = vector[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(vector[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(vectoralreves[i] + "  ");
		}
		in.close();
	}
}