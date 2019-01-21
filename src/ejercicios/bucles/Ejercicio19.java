package ejercicios.bucles;

import java.util.Scanner;

/*
 * Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
public class Ejercicio19 {
 public static void main(String[] args) {
	 int aprobados=0,suspensos=0,condicionados=0,notas;
	 Scanner entrada = new Scanner(System.in);
	 for (int i = 1; i <= 6; i++) {
		 
		 System.out.print("Ingrese sus notas: ");
		 notas=entrada.nextInt();
	 
		 while (notas <= 0 || notas>=10) {
			 System.out.print("ingrese una nota valida: ");
			 notas=entrada.nextInt();
		 }
	 
		if (notas>=5) {
			aprobados++;
		}else if (notas<=3) {
			condicionados++;
		}else {
			suspensos++;
		}
	}
	 System.out.println("aprobados: "+aprobados);
	 System.out.println("condicionados: "+condicionados);
	 System.out.println("suspenso: "+suspensos);
	 
}
 
}
