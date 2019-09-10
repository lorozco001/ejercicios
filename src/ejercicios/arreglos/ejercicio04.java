package ejercicios.arreglos;

import java.util.Scanner;

/*
 *Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo, Debemos mostrarlos
 *en el siguiente orden: el primeros, el ultimo, el segundo, el penultimo, el tercero, etc.  
 */
   
public class ejercicio04 {
	public static void main(String[] args) {
		int[] numeros=new int[10];
		int temporal=1;
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 10 NUMEROS CON ARREGLOS.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
		
		//impresion del arreglo
		System.out.print("LOS NUMEROS SON: ");
		for (int i = 0; i < 5; i++) {
			
			System.out.print(" "+numeros[i]);
			System.out.print(" "+numeros[numeros.length-temporal]);
			temporal++;
		}
		
	}
}
