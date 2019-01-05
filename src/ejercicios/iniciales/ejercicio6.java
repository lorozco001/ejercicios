package ejercicios.iniciales;

import java.util.Scanner;

/*
 *hacer un programa que calcule el cuadrado de una suma
 *(a+b)^2=a^2+2ab+b^2 
 */      
public class ejercicio6 {
	public static void main(String[] args) {
		int a,b;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("ingrese a: ");
		a=entrada.nextInt();
		System.out.print("inigrese b: ");
		b=entrada.nextInt();
		
		System.out.println("el resultado es: "+((a*a)+(2*a*b)+(b*b)));
	}
}
