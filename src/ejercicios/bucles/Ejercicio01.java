package ejercicios.bucles;

import java.util.Scanner;
/*
 * EJERCICO 1: Leer un numero y mostrar su cuadrado, 
 * repetir el proceso hasta que se introduzca un numero negativo.
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		int numero;
		double resultado;
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Ingrese su numero para elevarlo al cuadrado: ");
		numero=entrada.nextInt();
		
		while (numero>=0) {
			resultado=numero*numero;
			System.out.println("el resultado es: " + resultado);
			
			System.out.println("Ingrese otro numero para elevarlo al cuadrado: ");
			numero=entrada.nextInt();
		}
		System.out.println("gracias hasta la proxima");
		
	}
}
