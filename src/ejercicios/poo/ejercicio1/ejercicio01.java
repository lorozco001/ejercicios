package ejercicios.poo.ejercicio1;

import java.util.Scanner;

/*
 * Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la 
 * longitud de sus dos lados. Los valores de la longitud deberán introducirse por línea de ordenes. 
 * Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.
 */
public class ejercicio01 {
	public static void main(String[] args) {
		float lado1,lado2;
		Scanner entrada =new Scanner(System.in);
		cuadrilatero miCuadrilatero;
		
		System.out.print("ingrese el primer lado: ");
		lado1=entrada.nextFloat();
		System.out.print("ingrese el segundo lado: ");
		lado2=entrada.nextFloat();
		
		if (lado1==lado2) {
			miCuadrilatero=new cuadrilatero(lado1);
			
		}else {
			miCuadrilatero=new cuadrilatero(lado1, lado2);
		}
		System.out.println("el perimetro es: "+miCuadrilatero.perimetro());
		System.out.println("el area es: "+miCuadrilatero.area());
	}
}
