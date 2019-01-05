package ejercicios.condicionales;

import java.util.Scanner;

/*
 * pedir 2 numeros al usuario y decidir cual es el mayor o si los 2 son iguales
 */
public class ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		
		int num1,num2;
		System.out.print("ingrese el primer numero: ");
		num1=entrada.nextInt();
		System.out.print("ingrese el segundo numero: ");
		num2=entrada.nextInt();
		
		if (num1==num2) {
			System.out.println("los numeros son iguales.");
		}else if (num1>num2) {
			System.out.println("el numero "+num1+" es mayor al numero "+num2);
		}else {
			System.out.println("el numero "+num2+" es mayor al numero "+num1);
		}
			
		
	}
}
