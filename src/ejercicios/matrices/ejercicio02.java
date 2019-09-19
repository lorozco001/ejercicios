package ejercicios.matrices;

import java.util.Scanner;

/*
 *Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
 */
public class ejercicio02 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int[][]	matriz1 = new int[3][3];
		
		System.out.println("Programa que suma 2 matrices 3x3.");
		
		//llenamos la 1 matriz
		System.out.println("Digite la matriz 1.");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {	
				System.out.print("Digite posision ["+i+"]["+j+"] : ");
				matriz1[i][j]=entrada.nextInt();
			}	
		}
		
		//llenamos la matriz con la suma de la otra matriz
		System.out.println("Digite la matriz 2.");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {	
				System.out.print("Digite posision ["+i+"]["+j+"] : ");
				matriz1[i][j]+=entrada.nextInt();
			}	
		}
		
		//realizamos impresion de la matriz 
		System.out.println("la matriz es: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.print("|"+matriz1[i][j]+"|");
			}
			System.out.println();
		}		
	}
}
