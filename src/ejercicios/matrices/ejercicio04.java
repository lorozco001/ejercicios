package ejercicios.matrices;

import java.util.Scanner;

/*
 *Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la 
 *diagonal principal sean 1 y el resto 0.
 */
public class ejercicio04 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int[][]	matriz = new int[7][7];
		System.out.println("Programa de matriz simetrica 7x7.");
		
		//llenamos la 1 matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {	
				if (j==i) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}	
		}
		//realizamos impresion de la matriz original
		System.out.println("la matriz es: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("|"+matriz[i][j]+"|");
			}
			System.out.println();
		}
	}
}
