package ejercicios.matrices;
import java.util.Scanner;

/*
 * Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
 */
public class ejercicio03 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int[][]	matriz1 = new int[3][3];
		
		System.out.println("Programa que transpone una matriz 3x3.");
		
		//llenamos la 1 matriz
		System.out.println("Digite la matriz .");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {	
				System.out.print("Digite posision ["+i+"]["+j+"] : ");
				matriz1[i][j]=entrada.nextInt();
			}	
		}
		
		//realizamos impresion de la matriz original
		System.out.println("la matriz original es: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.print("|"+matriz1[i][j]+"|");
			}
			System.out.println();
		}	
		
		//realizamos la transposisionde la matriz
		int aux;
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < i; j++) {
				aux=matriz1[i][j];
				matriz1[i][j]=matriz1[j][i];
				matriz1[j][i]=aux;
				
			}
		}	
	
		//realizamos la impresion de la matriz transpuesta
		System.out.println("la matriz transpuesta es: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.print("|"+matriz1[i][j]+"|");
			}
			System.out.println();
		}	
	}
}
