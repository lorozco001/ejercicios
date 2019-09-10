package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 6:leer los datos correspondiente a dos tablas de 12 elementos numericos y mezclarlos
 * en una tercera de la forma: 3 de la tabla A, 3 de la tabla B,otros 3 de A,otros de 3 de la B,etc 
 */
public class ejercicio06 {
	public static void main(String[] args) {
		int[] arreglo1=new int[12];
		int[] arreglo2=new int[12];
		int[] arreglo3=new int[24];
		int contadorArreglo3=0;
		int contadorCiclos=0;
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
		for (int i = 0; i < 4; i++) {
			//ingresamos 3 datos del arreglo1
			for (int j = contadorCiclos; j < (contadorCiclos+3); j++) {
				arreglo3[contadorArreglo3]=arreglo1[j];
				contadorArreglo3++;
			}
			//ingresamos 3 datos del arreglo 2
			for (int j = contadorCiclos; j < (contadorCiclos+3); j++) {
				arreglo3[contadorArreglo3]=arreglo2[j];
				contadorArreglo3++;
			}
			contadorCiclos+=3;
		}
		
		//imprimir el arreglo3
		System.out.print("LOS NUMEROS DEL ARREGLO 3 SON: ");
		for (int i = 0; i < arreglo3.length; i++) {
			System.out.print(" "+arreglo3[i]);
			
		}
	}
}
