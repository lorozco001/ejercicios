package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 16: Pide un numero (que debe estar entre el 0 y el 10) y mostrar la tabla de multiplicar de dicho numero 
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		int tabla;
		Scanner entrada =new Scanner(System.in);
		
		System.out.print("QUE TABLA QUE DESEA OBTENER DEL 0 AL 10: ");
		tabla=entrada.nextInt();
		while (tabla<0  || tabla>10) {
			System.out.print("TABLA NO VALIDA SOLO ES DEL 0 AL 10: ");
			tabla=entrada.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(tabla+"x"+i+"="+(i*tabla));
		}
	}
}
