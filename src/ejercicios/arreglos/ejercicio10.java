package ejercicios.arreglos;

import java.util.Scanner;

/*
 *Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace N posiciones  en el arreglo 
 *(N posiciones digitado por el usuario)
 */
public class ejercicio10 {
	public static void main(String[] args) {
		int[] numeros=new int[10];
		int recorrido, ultimo;
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 10 NUMEROS CON ARREGLOS.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < (numeros.length); i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
		
		//guarda el numero del recorrido
		System.out.print("Digite la cantidad de posisiones que desee recorrer:");
		recorrido=entrada.nextInt();
		
		//guarda el ultimo digito y recorre el arreglo
		for (int j = 0; j < recorrido; j++) {
			ultimo=numeros[9];
			for (int i = 8; i >=0; i--) {
				numeros[i+1]=numeros[i];	
			}
			numeros[0]=ultimo;
		}
		
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS SON: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}
	}
}
