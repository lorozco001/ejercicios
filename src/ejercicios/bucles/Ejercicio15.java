package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 15: Dada las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75.
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		int edad,cant18=0,cant175=0;
		float promedad, promaltura,altura,sumaedad=0,sumaaltura=0;

		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("INGRESAR ALTURA DEL "+i+" ALUMNO.");
			altura=entrada.nextFloat();
			while(altura<=0) {
				System.out.println("ALTURA NO VALIDA");
				System.out.print("INGRESAR ALTURA DEL "+i+" ALUMNO.");
				altura=entrada.nextFloat();
			}
			if(altura>=1.75) {
				cant175++;
			}
			sumaaltura+=altura;
			System.out.print("INGRESAR LA EDAD DEL "+i+" ALUMNO.");
			edad=entrada.nextInt();
			while(edad<=0) {
				System.out.println("EDAD NO VALIDA");
				System.out.print("INGRESAR LA EDAD DEL "+i+" ALUMNO.");
				altura=entrada.nextFloat();
			}
			if (edad>=18) {
				cant18++;
			}
			sumaedad+=edad;
		}
		promedad=sumaedad/5;
		promaltura=sumaaltura/5;
		System.out.println();
		System.out.println("EL PROMEDIO DE LA EDAD ES: "+promedad);
		System.out.println("EL PROMEDIO DE LA ALTURA ES: "+promaltura);
		System.out.println("HAY "+cant18+" ALUMNOS MAYORES DE 18 AÑOS");
		System.out.println("HAY "+cant175+" ALUMNOS MAYORES DE 1.75 CM");
		
	}
	
}
