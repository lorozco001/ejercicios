package ejercicios.matrices;
/*
 * Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5 
 * cargar la primera y transponerla a la segunda
 */
public class ejercicio06 {
	public static void main(String[] args) {
		int[][] matriz2=new int[5][9];
		int[][] matriz= {{1,2,3,4,5},
				 		{6,7,8,9,0},
				 		{1,2,3,4,5},
				 		{6,7,8,9,0},
				 		{1,2,3,4,5},
				 		{6,7,8,9,0},
				 		{1,2,3,4,5},
				 		{6,7,8,9,0},
				 		{1,2,3,4,5}};

		System.out.println("la matriz original es: ");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("|"+matriz[i][j]+"|");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				matriz2[i][j] = matriz[j][i];
			}
		}
		System.out.println("la matriz transpuesta es: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("|"+matriz2[i][j]+"|");
			}
			System.out.println();
		}
	}
}
