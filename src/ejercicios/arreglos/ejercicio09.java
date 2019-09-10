package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y 
 * la desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero 
 * y así sucesivamente. El último pasa a ser el primero.
 */
public class ejercicio09 {
	public static void main(String[] args) {
		int[] numeros=new int[10];
		int numero, posision, ultimo;
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 10 NUMEROS CON ARREGLOS.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < (numeros.length); i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
		
		//guarda el ultimo digito y recorre el arreglo
		ultimo=numeros[9];
		for (int i = 8; i >=0; i--) {
			numeros[i+1]=numeros[i];	
		}
		numeros[0]=ultimo;
		
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS SON: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}
	}
}
