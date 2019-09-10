package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 7: Leer por teclado una serie de 10 números enteros. 
 * La aplicación debe indicarnos si los números están ordenados de forma creciente, 
 * decreciente, o si están desordenados.
 */
public class ejercicio07 {
	public static void main(String[] args) {
		boolean acendente=false,decendente=false;
		
		int[] numeros=new int[10];
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE MUESTRA SI EL ARREGLO ESTA ORDENADO.");
		
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
		
		//
		for (int i = 0; i < (numeros.length-1); i++) {
			if (numeros[i]<=numeros[(i+1)]) {
				acendente=true;
			}else if (numeros[i]>=numeros[(i+1)]) {
				decendente=true;
			}
		}				
		
		if (acendente == true && decendente==false) {
			System.out.println("\n"+"Arreglo en forma acendente");
		}else if (acendente ==false & decendente==true) {
			System.out.println("\n"+"Arreglo en forma decendente");
		}else {
			System.out.println("\n"+"Arreglo desordenado");
		}
		
	}
}
