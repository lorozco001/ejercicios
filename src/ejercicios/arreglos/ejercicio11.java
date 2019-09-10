package ejercicios.arreglos;

import java.util.Scanner;


/*
 * Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
 * Éstos los guardaremos en una tabla de tamaño 10. 
 * Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
public class ejercicio11 {
	public static void main(String[] args) {
		int[] numeros=new int[6];
		boolean acendente = false,decendente=false;
		int numero=0,posision=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 6 NUMEROS CON ARREGLOS.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < 5; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
		
		//saber si el arreglo esta de forma acendente
		for (int i = 0; i < (numeros.length-1); i++) {
			if (numeros[i]<=numeros[(i+1)]) {
				acendente=true;
			}else if (numeros[i]>=numeros[(i+1)]) {
				decendente=true;
			}
		}
		if (acendente == true && decendente==false) {
			
			//guarda el numero extra
			System.out.println("arreglo se lleno completamente");
			System.out.print("Digite el munero extra: ");
			numero=entrada.nextInt();
			
			//obtenemos la posision del numero 
			for (int i = 0; i < numeros.length; i++) {
				if (numero<=numeros[i]) {
					posision=i;
					break;
				}if (numero>=numeros[i]) {
					posision=i;
				}
			}
			
			//recorre el ingreso y coloca el numero
			for (int i = 4; i >=posision; i--) {
				numeros[i+1]=numeros[i];	
			}
			numeros[posision]=numero;
			
			//imprimir el arreglo acendente
			System.out.print("LOS NUMEROS SON: ");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(" "+numeros[i]);
			}
			
		}else {
			System.out.println("no se puede realizar ya que no es un arreglo acendente");
		}
	}
}