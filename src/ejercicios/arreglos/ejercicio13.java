package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 13: Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, 
 * y a continuación los elementos impares.
 */
public class ejercicio13 {
	public static void main(String[] args) {
		int[] pares=new int[10];
		int[] impares= new int[10];
		int contadorPares=0,contadorImpares=0;
		Scanner entrada =new Scanner(System.in);

		//guarda datos en el arreglo
			for (int i = 0; i < 10; i++) {
				int temporal;
				
				System.out.print("DAME EL "+(i+1)+" NUMERO: ");
				temporal=entrada.nextInt();
				if (temporal%2==0) {
					pares[contadorPares]=temporal;
					contadorPares++;
				}else {
					impares[contadorImpares]=temporal;
					contadorImpares++;
				}				
			}
			//imprimir el arreglo acendente
			System.out.print("LOS NUMEROS PARES SON: ");
			for (int j = 0; j < contadorPares; j++) {
				System.out.print(" "+pares[j]);
			}
			System.out.println();
			//imprimir el arreglo acendente
			System.out.print("LOS NUMEROS IMPARES SON: ");
			for (int k = 0; k < contadorImpares; k++) {
				System.out.print(" "+impares[k]);
			}
	}
}
