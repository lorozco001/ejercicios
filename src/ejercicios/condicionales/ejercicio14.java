package ejercicios.condicionales;

import java.util.Scanner;

/*
 * hacer un programa que pase de kg a otra unidad de medida de masa, 
 * mostrar en la pantalla un menu con lasopciones posibles. 
 */
public class ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int cantidad,opcion;
		
		System.out.println("Bienvenido al programa de conversion de unidades de masa ");
		System.out.print("Ingrese la cantidad en kg que desee convertir: ");
		cantidad=entrada.nextInt();
		
		System.out.println("1.- Toneladas.");
		System.out.println("2.- Gramos.");
		System.out.println("3.- Miligramos");
		System.out.print("Ingrese la unidad: ");
		opcion=entrada.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.print(cantidad+" kilogramos son "+(cantidad*0.001)+" Toneladas.");
			break;
		case 2:
			System.out.print(cantidad+" kilogramos son "+(cantidad*1000)+" Gramos.");
			break;
		case 3:
			System.out.print(cantidad+" kilogramos son "+(cantidad*1000000)+" Miligramos.");
			break;
		default:
			System.out.print("opcion no valida");
			break;
		}
		
	}
}
