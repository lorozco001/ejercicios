package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICO 3:leer numeros hasta que se introduzca un cero para cada uno indicar sies par o impar.
 * 
 */
public class Ejercicio03 {
	public static void main(String[] args) {
	 int numero;
	 
	 Scanner entrada =new Scanner(System.in);
	 
	 System.out.println("INGRESAR UN NUMERO: ");
	 numero=entrada.nextInt();
	 
	 while(numero!=0) {
		if(numero%2 == 0) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}
		System.out.println("INGRESAR OTRO NUMERO: ");
		 numero=entrada.nextInt();
	}
		
	 System.out.println("ADIOS...");	
		
	}
}
