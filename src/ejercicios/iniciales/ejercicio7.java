package ejercicios.iniciales;

import java.util.Scanner;

/*
 * construir un programa que, dado un numero total de horas,
 * devuelve el numero de semanas, dias y horas equivalentes.
 * Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas,
 * 6 dias y 16 horas  
 */
public class ejercicio7 {
	public static void main(String[] args) {
		int semanas,dias,horas,total;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese el numero total de horas: ");
		total=entrada.nextInt();
		//semana 168
		//dia 24
		semanas=total/168;
		dias=total%168/24;
		horas=total%24;

		System.out.println("semanas: "+semanas);
		System.out.println("dias: "+dias);
		System.out.println("horas: "+horas);
		
	}
}
