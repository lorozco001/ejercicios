package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 6: Pedir numeros hasta que se teclee un 0, 
 * mostrar la suma de todos los números introducidos.
 */
public class Ejercicio06 {
	public static void main(String[] args) {
	
		int numero,suma=0;
		Scanner entrada =new Scanner(System.in);
		System.out.print("Ingrese su numero y que no sea cero: ");
		numero =entrada.nextInt();
		
		
		while (numero!=0) {
			suma +=numero;
			System.out.println("\nLa suma es: "+suma);
			
			System.out.print("\nIngrese otro numero: ");
			numero=entrada.nextInt();
		}
		System.out.println("\nLa aplicacion aha finalizadao ingresaste un cero y tu suma fue "+suma);
	}
}
