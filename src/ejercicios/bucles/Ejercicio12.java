package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 12: Pedir un numero y calcular su factorial    N!= 1*2*3*4....N
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		int numero,factorial=1;
		Scanner entrada =new Scanner(System.in);
		
		System.out.print("INGRESE SU NUMERO PARA SACAR SU FACTORIAL  ");
		numero=entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			factorial*=i;
		}
		System.out.println("su factorial es: "+factorial);
	}
}
