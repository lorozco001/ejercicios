package ejercicios.poo.ejercicio4;

import java.util.Scanner;

/*
 * Ejercicio 4: Construir un programa para una competencia de atletismo, 
 * el programa debe gestionar una serie de atletas caracterizados por su número de atleta, 
 * nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
public class ejercicio04 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		Scanner entrada1=new Scanner(System.in);
		String nombre;
		float tiempo;
		int numeroAtletas,numero,indiceMejorTiempo;
		
		System.out.print("Ingrese la cantidad de atletas a participar: ");
		numeroAtletas= entrada.nextInt();
		
		atleta[] atletas = new atleta[numeroAtletas];
		
		for (int i = 0; i < atletas.length; i++) {
			entrada.nextLine();
			System.out.println("Ingrese los datos del primer atleta: ");
			System.out.print("Ingrese su Numero: ");
			numero=entrada.nextInt();
			System.out.print("Ingrese su Nombre: ");
			nombre=entrada1.nextLine();
			System.out.print("ingrese su Tiempo: ");
			tiempo= entrada.nextFloat();
			
			atletas[i]=new atleta(numero, nombre, tiempo);
		}
		indiceMejorTiempo=indiceAtletaMRapido(atletas);
		System.out.println("\nEl atleta ganador es:");
		System.out.println(atletas[indiceMejorTiempo].mostrarDatos());
	}
	public static int indiceAtletaMRapido(atleta atletas[]) {
		int indice=0;
		float tiempo;
		
		tiempo=atletas[0].getTiempo();
		for (int i = 1; i < atletas.length; i++) {
			if (atletas[i].getTiempo()<tiempo) {
				tiempo=atletas[i].getTiempo();
				indice=i;
			}
		}
	
		return indice;
	}
}
