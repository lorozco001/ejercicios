package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		int numero,contador=0;
		
		Scanner entrada =new Scanner(System.in);	
		System.out.print("ingrese un numero que no sea cero ni negativo: ");
		numero=entrada.nextInt();
		
		while (numero>0) {
			contador +=1;
			System.out.print("\nlleva "+contador+".- numeros ingrese otro numero: ");
			numero=entrada.nextInt();
		}
		
		System.out.println("fin del programa ya que puso un numero negativo  o cero");
		
	}	
}
