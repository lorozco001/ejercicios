package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 12: Leer por tecladouna tabla de 10 elementos numéricos enteros y una posision (entre 0 y 9)
 *  eliminar el elemento situado en la posision dada sin dejar huecos. 
 */
public class ejercicio12 {
	public static void main(String[] args) {
		int indice=0;
		int[] numeros=new int[10];
		Scanner entrada =new Scanner(System.in);
		//System.out.println("PROGRAMA QUE MUESTRA SI EL ARREGLO ESTA ORDENADO.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
	
		//obtiene y guarda el indice
		System.out.print("Que elemento desea eliminar:");
		indice=entrada.nextInt();
		indice--;
		
		//validar el valor
		if(indice>=10) {
			System.out.println("no existe la posision");	
		}else {
			for (int i = 0; i < numeros.length; i++) {
				if (i==indice) {
					numeros[i]=0;
					
					
				}
			}
		}
		
		
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS SON: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}
		
		//
	}	
}
