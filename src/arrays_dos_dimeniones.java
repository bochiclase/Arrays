import java.util.Random;

public class arrays_dos_dimeniones {

	public static void main(String[] args) {

		Random r = new Random();

		int[][] matriz;
//		matriz = new int[7][5]; LA MISMA CANTIDAD DE COLUMNAS PARA CADA FILA
		
		matriz = new int[7][];
		matriz[0] = new int[10];
		matriz[1] = new int[100];
		matriz[2] = new int[26];
		matriz[3] = new int[3];
		matriz[4] = new int[80];
		matriz[5] = new int[6];
		matriz[6] = new int[77];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(100);
				System.out.print(String.format("%02d ", matriz[i][j]));
			}
			System.out.println();
		}
	}

}
		
//		
////		ASIGNACI�N DE VALORES A LAS POSICIONES DE LA MATR�Z
//		for (int i = 0; i < s; i++) {
//			for (int j = 0; j < 5; j++) {
//				matriz[i][j] = r.nextInt(100);
//			}
//		}
//
//		
////		MOSTRAR VALORES DE LAS POSICIONES DE LA MATR�Z
//		for (int i = 0; i < 7; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(String.format("%02d ", matriz[i][j]));
////				Format es un especificador de formato
////				La d indica que la cadena se va a covert�r en n�mero entero
////				el 3 indica que va a ser m�ximo de tres d�gitos, y el - es
////				para alinear todo a izquierda. El espacio despu�s de la d
////				es para separar 
//			}
//			System.out.println();
//		}
