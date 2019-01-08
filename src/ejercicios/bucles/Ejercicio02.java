package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio02 {
/*
 * EJERCICIO 2: Leer un numero e indicar si es positivo o negativo. 
 * El proceso se repetira hasta que se introduzca un cero.
 */

	public static void main(String[] args) {
		int numero;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca un numero para saber si es positivo o negativo: ");
		numero=entrada.nextInt();
		
	while (numero != 0) {
		if (numero>0) {
			System.out.println("el numero es positivo.");
		}else {
			System.out.println("el numero es negativo.");
		}
		System.out.println("Introduzca otro numero para saber si es positivo o negativo:");
		numero=entrada.nextInt();
		
	}
	System.out.println("adios...");
	}
}
