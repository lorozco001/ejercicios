package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 10: Pedir 10 numeros y escribir la suma total.
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		int numero, suma=0;
		System.out.println("INGRESE SUS 10 NUMEROS Y LE DARE SU SUMA: ");
		Scanner entrada =new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" número : ");
			numero=entrada.nextInt();
			suma +=numero;
		//	System.out.println();
			
		}
		System.out.println("EL RESULTADO DE LA SUMA ES: "+suma);
	}
}
