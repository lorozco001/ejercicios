package ejercicios.condicionales;

import java.util.Scanner;

/*
 * hacer un programa que lea un numero enteroy muestre si el numero es multiplo de 10
 */
public class ejercicio01 {
	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		int numero;
		
		System.out.print("ingrese su número: ");
		numero=entrada.nextInt();
		if (numero==0) {
			System.out.println(numero+" no es multiplo de 10");
		}else {
			if (numero%10==0) {
				System.out.println(numero+" si es multiplo de 10");
			}else {
				System.out.println(numero+" no es multiplo de 10");
			}
		}
	}
}
