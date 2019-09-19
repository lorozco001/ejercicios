package ejercicios.matrices;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int matriz[][], nFilas,nColumnas;
		boolean simetrica=true;
		
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
		if (nFilas==nColumnas) {
			int i=0,j;
			while (i<nFilas && simetrica==true) {
				j=0;
				while (j<i && simetrica==true) {
					if (matriz[i][j]!=matriz[j][i]) {
						simetrica=false;
					}
					j++;
				}
				i++;
			}
			if (simetrica==true) {
				System.out.println("la matriz es simetrica.");
			}else {
				System.out.println("la matriz no es simetrica ");
			}
		}else {
			System.out.println("la matriz no es simetrica ");
		}
		
		
		
	}
}
