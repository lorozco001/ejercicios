package ejercicios.iniciales;

import java.util.Scanner;

/*
 * Guillermo tiene N dolares 
 * Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen los 3 juntos. 
 */

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =new Scanner(System.in);
		float Guillermo;
		float Luis;
		float Juan;
		System.out.print("Cuantos dolares tiene Guillermo: ");
		Guillermo=entrada.nextFloat();
		Luis=(Guillermo/2);
		Juan=((Guillermo+Luis)/2);
		System.out.println("Los tres tienen: "+(Guillermo+Luis+Juan));
		System.out.print("Donde Guillermo cuenta con: "+Guillermo+" Luis cuenta con: "+Luis+" Juan cuenta con: "+Juan);

	}

}
