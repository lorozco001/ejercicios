package ejercicios.iniciales;

import java.util.Iterator;
import java.util.Scanner;

/*
 *Una compañia de venta de carros usados, 
 *paga a su personal de ventas un salario de $1000.00 mensuales,
 *mas una comision de $150 por cada carro vendido,
 *mas el 5% del valor de una venta por cada carro.
 *Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
 *Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.  
 */

public class ejercicio4 {
	
	public static void main(String[] args) {
		float ventas;
		Double total =0.0;
		float valor;
		Scanner entrada =new Scanner(System.in);
		
		System.out.print("Cuantas ventas realizo el empleado: ");
		ventas=entrada.nextFloat();
		for(int i=1;i<=ventas;i++) {
			System.out.print("ingrese el valor de la venta "+i+": ");
			valor=entrada.nextFloat();
			total=total+(150+(valor*0.05));
		}
		total=total+1000;
		System.out.print("el salario mensual es: "+total);
	}
}
