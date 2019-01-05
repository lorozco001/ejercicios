package ejercicios.iniciales;

import java.util.Scanner;

/*
 * hacer un ejercicio que calcule e imprima la suma de tres calificaciones
 */

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cal1,cal2,cal3,resultado;
		Scanner calificaciones=new Scanner(System.in);
		
		System.out.println("Bienvenido al programa al programa que calcula la suma de tres calificaciones");
		System.out.print("Digite sus tres calificaciones: ");
		cal1=calificaciones.nextFloat();
		cal2=calificaciones.nextFloat();
		cal3=calificaciones.nextFloat();
		resultado=cal1+cal2+cal3;
		System.out.println("el resultado de la suma es: "+resultado);
		
	}

}
