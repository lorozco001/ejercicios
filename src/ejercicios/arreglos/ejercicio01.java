package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden que ingresaron.
 */
public class ejercicio01 {
	public static void main(String[] args) {
		int[] numeros=new int[5];
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 5 NUMEROS CON ARREGLOS.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
	
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS SON: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}
	}
}
