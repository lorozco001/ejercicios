package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 8: Pedir un numero N y mostrar todos los numeros del 1 al N.
 */
public class Ejercicio08 {
	public static void main(String[] args) {
	
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su numero: ");
		numero=entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.print(i+",");
		}
	}
}
