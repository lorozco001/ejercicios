package ejercicios.matrices;

import java.util.Scanner;

/*
 * Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.
 */
public class ejercicio05 {
	public static void main(String[] args) {
	Scanner entrada =new Scanner(System.in);
		
		int matriz[][],nFilas,nColumnas;
		
		
		System.out.print("ingresa el numero de filas: ");
		nFilas=entrada.nextInt();
		System.out.print("ingresa el numero de columnas: ");
		nColumnas=entrada.nextInt();
		
		matriz = new int[nFilas][nColumnas];
		
		System.out.println("Digite la matriz.");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {	
				System.out.print("Digite posision ["+i+"]["+j+"] : ");
				matriz[i][j]=entrada.nextInt();
			}	
		}
		
		for (int i = 0; i < nFilas; i++) {
			int aux =0;
			for (int j = 0; j < nColumnas; j++) {
			aux+=matriz[i][j];
			}
			System.out.println("la suma de la filas "+(1+i)+" es: "+aux);
			
		}
		for (int i = 0; i < nColumnas; i++) {
			int aux =0;
			for (int j = 0; j <nFilas; j++) {
			aux+=matriz[j][i];
			}
			System.out.println("la suma de la columnas "+(1+i)+" es: "+aux);	
		}			
	}
}
