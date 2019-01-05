package ejercicios.iniciales;

import java.util.Scanner;

/*
 * hacer un programa que calcule e imprima el salario semanal de un empleado 
 * apartir de sus horas semanales trabajadas y de su salario por hora.
 */

public class ejercicio2 {
	
	
	public static void main(String[] args) {
		float horas;
		float salario;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Bienvenido al sistema que calcula el salario de un empleado");
		System.out.print("Cuantas horas trabajo el empleado: ");
		horas=entrada.nextFloat();
		System.out.print("Cual es el salario por hora: ");
		salario=entrada.nextFloat();
		System.out.print("El salario del empleado es: "+(salario*horas));

	}

}
