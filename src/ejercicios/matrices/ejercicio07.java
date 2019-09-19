package ejercicios.matrices;


/*
 * Ejercicio 7: Crear una matriz “marco” de tamaño 5x5: todos sus elementos deben ser 0 
 * salvo los de los bordes que deben ser 1. Mostrarla.
 */
public class ejercicio07 {
	public static void main(String[] args) {
		int [][] marco = new int[5][5];
		
		for (int i = 0; i < marco.length; i++) {
			for (int j = 0; j < marco.length; j++) {
				if (j==0 || i==0 ||j==marco.length-1||i==marco.length-1) {
					marco[i][j]=1;
				}else {
					marco[i][j]=0;
				}
			}
		}
		for (int i = 0; i < marco.length; i++) {
			for (int j = 0; j < marco.length; j++) {
				System.out.print(marco[i][j]+" ");
			}
			System.out.println();
		}
	}
}
