package ejercicios.arreglos;

import java.util.Scanner;

/*
 *Ejercicio 8:Diseñar una aplicacion que declare una tabla de 10 elementos enteros
   leer  mediante el teclado 9 numeros. despues se debe pedir un numero
  y una posicion, insertarlo en la posicion indicada, dezplazando los que esten dretras

 */
public class ejercicio08 {
	public static void main(String[] args) {
		int[] numeros=new int[10];
		int numero, posision;
		Scanner entrada =new Scanner(System.in);
		System.out.println("PROGRAMA QUE GUARDA 8 NUMEROS CON ARREGLOS.");
		
		//guarda datos en el arreglo
		for (int i = 0; i < (numeros.length)-1; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO: ");
			numeros[i]=entrada.nextInt();
		}
		
		//guarda el numero extra
		System.out.println("arreglo se lleno completamente");
		System.out.print("Digite el munero extra: ");
		numero=entrada.nextInt();
		
		//valida una posision verdadera
		do {
			System.out.print("Digite la posision valida");
			posision =entrada.nextInt();
			posision--;
		} while (posision>9);
		
		//recorre el ingreso y coloca el numero
		for (int i = 8; i >=posision; i--) {
			numeros[i+1]=numeros[i];	
		}
		numeros[posision]=numero;
		
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS SON: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}
	}
}
