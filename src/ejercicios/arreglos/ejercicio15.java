package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 15: Leer 10 enteros ordenados creciente mente. Leer N y buscarlo en la tabla. 
 * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
 */
public class ejercicio15 {
	public static void main(String[] args) {
		int[] numeros=new int[10];
		Scanner entrada =new Scanner(System.in);
		int comparador=0,posision=0; 
		boolean acendente = false,decendente=false;
	
		//guarda datos en el arreglo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
				
		for (int i = 0; i < (numeros.length-1); i++) {
			if (numeros[i]<=numeros[(i+1)]) {
				acendente=true;
			}else if (numeros[i]>=numeros[(i+1)]) {
				decendente=true;
			}
		}
		if (acendente == true && decendente==false) {
			System.out.print("DAME EL NUMERO A BUSCAR EN EL ARREGLO: ");
			comparador=entrada.nextInt();
			for (int i = 0; i < numeros.length; i++) {
				if (comparador==numeros[i]) {
					posision=i+1;
				}else if(i==numeros.length){
					System.out.println("no se encontro el numero");
				}				
			}
		}else {
			System.out.println("no se puede realizar ya que no es un arreglo acendente");
		}
		System.out.println("el numero "+ comparador+" se encuentra en la posision: "+posision);
	}
}
