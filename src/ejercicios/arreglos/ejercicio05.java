package ejercicios.arreglos;
/*
 * Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y 
 * mezclarlas en una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
 */

import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		int[] arreglo1=new int[10];
		int[] arreglo2=new int[10];
		int[] arreglo3=new int[20];
		int contadorArreglo3=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 10 NUMEROS CON  2 ARREGLOS y HACE 1 SOLO.");
		System.out.println("DATOS DEL ARREGLO 1");
		//guarda datos en el arreglo1
		for (int i = 0; i < arreglo1.length; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			arreglo1[i]=entrada.nextInt();
		}
		
		System.out.println("DATOS DEL ARREGLO 2");
		//guarda datos en el arreglo2
		for (int i = 0; i < arreglo2.length; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			arreglo2[i]=entrada.nextInt();
		}
		
		//guarda datos en el arreglo3
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo3[contadorArreglo3]=arreglo1[i];
			contadorArreglo3++;
			arreglo3[contadorArreglo3]=arreglo2[i];
			contadorArreglo3++;
		}
		
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS DEL ARREGLO 3 SON: ");
		for (int i = 0; i < arreglo3.length; i++) {
			System.out.print(" "+arreglo3[i]);
			
		}
	}
}
