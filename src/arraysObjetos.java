
public class arraysObjetos {

	public static void main(String[] args) {

//		String[] dias;
//		dias = new String[7]; // Se crea un array de la clase String con 7 posiciones
		
//		Almacenamiento de datos en las 7 posiciones del array
//		dias [0] = "lunes";
//		dias [1] = "martes";
//		dias [2] = "mi�rcoles";
//		dias [3] = "jueves";
//		dias [4] = "viernes";
//		dias [5] = "s�bado";
//		dias [6] = "domingo";
		
		String[] dias = {"lunes", "martes", "mi�rcoles", "jueves", "viernes", "s�bado", "domingo"};
		

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]); // resultado null: ninguna posici�n tiene referencia
		}

	}

}
