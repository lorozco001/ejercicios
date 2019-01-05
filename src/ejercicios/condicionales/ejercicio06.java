package ejercicios.condicionales;

import java.util.Scanner;

/*
 * hacer un programa que tome 2 numeros y diga si ambos son pares o impares
 */
public class ejercicio06 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int num1,num2;
		
		System.out.print("ingrese el primer numero: ");
		num1=entrada.nextInt();
		System.out.print("ingrese el segundo numero: ");
		num2=entrada.nextInt();
		
		
		if (num1%2==0&&num2%2==0) {
			System.out.println("los 2 son pares");
		}else if(num1%2==0&&num2%2!=0){
			System.out.println("el primer numero es par el segundo es impar");
		}else if (num1%2!=0&&num2%2==0) {
			System.out.println("el primer numero es impar el segundo es par");
		}else {
			System.out.println("los dos numeros son impares");
		}
	}
}
