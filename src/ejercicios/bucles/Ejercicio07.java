package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 7: Pedir numeros hasta que se introduzca uno negativo, y calcular la media(promedio).
 */
public class Ejercicio07 {
	public static void main(String[] args) {
		int calificacion, contador=0, suma=0;
		float promedio;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Calculador de promedio");
		System.out.print("Ingrese su calificacion: ");
		calificacion=entrada.nextInt();
		
		while (calificacion>=0) {
			contador +=1;
			suma+=calificacion;
			System.out.print("Ingrese otra calificacion: ");
			calificacion=entrada.nextInt();
		}
			promedio=(float)suma/contador;
			System.out.println("Su promedio es: "+promedio);
		
		
	}

}
