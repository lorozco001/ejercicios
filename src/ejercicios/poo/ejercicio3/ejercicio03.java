package ejercicios.poo.ejercicio3;

import java.util.Scanner;

/*
 * Ejercicio 3: Construir un programa que dada una serie de vehículos 
 * caracterizados por su marca, modelo y precio, imprima las propiedades
 * del vehículo más barato. 
 * Para ello, se deberán leer por teclado las características de cada vehículo y 
 * crear una clase que represente a cada uno de ellos.
 */
public class ejercicio03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String marca,modelo;
		float precio;
		int numeroVehiculos,indiceBarato;
		
		System.out.print("Digite la cantidad de vehiculos: ");
		numeroVehiculos = entrada.nextInt();
		
		vehiculo coches[]=new vehiculo[numeroVehiculos];
		
		for (int i = 0; i < coches.length; i++) {
			entrada.nextLine();
			System.out.println("\nDigite las caracteristicas del coche "+(i+1)+":");
			System.out.print("Introduzca su marca: ");
			marca = entrada.nextLine();
			System.out.print("Introduzca su modelo: ");
			modelo = entrada.nextLine();
			System.out.print("Introduzca su precio: ");
			precio = entrada.nextFloat();
			
			coches[i]= new vehiculo(marca, modelo, precio);
		}
		indiceBarato=indiceCocheMBarato(coches);
		System.out.println("\nEl coche mas barato es:");
		System.out.println(coches[indiceBarato].mostrarDatos());
	}
	
	 public static int indiceCocheMBarato(vehiculo coches[]) {
			float precio;
			int indice=0;
			
			precio=coches[0].getPrecio();
			for (int i = 1; i < coches.length; i++) {
				if (coches[i].getPrecio()<precio) {
					precio=coches[i].getPrecio();
					indice=i;
				}
			}
			return indice;
		}
}
