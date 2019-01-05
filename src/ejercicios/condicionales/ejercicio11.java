package ejercicios.condicionales;

import java.util.Scanner;

/*
 * contruir un programa que simule el funcionamiento de una calculadora donde se realicen las 4 operaciones basicas
 * (suma,resta,multiplicacion,division) con valores enteros. el usuario debe especificar la operacion con el primer caracter
 * del primer parametro de la linea de comandos.
 * S o s  suma
 * R o r  resta
 * M o m  multiplicación
 * D o d  division
 */
public class ejercicio11 {
	public static void main(String[] args) {
		Scanner entradanumeros= new Scanner(System.in);
		int num1, num2;
		Scanner entradachar=new Scanner(System.in);
		char operacion;
		
		System.out.print("ingrese el primer numero: ");
		num1=entradanumeros.nextInt();
		System.out.print("ingrese el segundo numero: ");
		num2=entradanumeros.nextInt();
		System.out.print("ingrese la operacion: ");
		operacion=entradachar.nextLine().charAt(0);
	
		switch (operacion) {
		case 'S':
		case 's':
			System.out.print("el resultado de la suma es: "+(num1+num2));
			break;
		case 'R':
		case 'r':
			System.out.print("el resultado de la resta es: "+(num1-num2));
			break;
		case 'M':
		case 'm':
			System.out.print("el resultado de la multiplicacion es: "+(num1*num2));
			break;
		case 'D':
		case 'd':
			System.out.print("el resultado de la division es: "+(num1/num2));
			break;
		default:
			break;
		}
	
	
	
	}
}
