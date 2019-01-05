package ejercicios.condicionales;

import java.util.Scanner;

/*
 * hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula 
 */

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		char letra;
		
		System.out.print("ingrese su letra: ");
		letra= entrada.nextLine().charAt(0);
		
		if (Character.isUpperCase(letra)) {
			System.out.println("es mayuscula");
		}else {
			System.out.println("es minuscula");
		}
	}
	

}
