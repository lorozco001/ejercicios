package ejercicios.iniciales;

import java.util.Scanner;

/*
 *La calificacion final de un estudiante de informatica 
 *se calcula con base a las calificaciones de cuatro aspectos de su rendimiento academico:
 *
 *participacion          10%
 *primer examen parcial  25%
 *segundo examen parcial 25%
 *examen final           40%
 *
 *Hacer un programa que calcule e imprima la calificacion final obtenida por un estuadiante. 
 */

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double partotal,par,ex1,ex2,exf;
		
		
		Scanner entrada =new Scanner(System.in);
				
		System.out.print("ingrese el total de participaciones: ");
		partotal=entrada.nextDouble();
		System.out.print("ingrese la participacion del alumno: ");
		par=entrada.nextDouble();
		System.out.print("ingrese la calificacion del primer examen: ");
		ex1=entrada.nextDouble();
		System.out.print("ingrese la calificacion del segundo examen: ");
		ex2=entrada.nextDouble();
		System.out.print("ingrese la calificacion del examen final: ");
		exf=entrada.nextDouble();
	
		
		if(partotal>=par) {
			partotal=(1/partotal);
			par=par*partotal;
			ex1=ex1*0.25;
			ex2=ex2*0.25;
			exf=exf*0.40;
			System.out.println("su calificacion es: "+(par+ex1+ex2+exf));
		}else {
			System.out.println("la participacion total no pude se menor a la participacion del alumno");
		}
		
	}
}
