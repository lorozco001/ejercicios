package ejercicios.condicionales;

import java.util.Scanner;

/*
 * en megaplaza se hace un 20% de descuento a los clientes cuya compra supere los $300 
 * ¿cua sera la cantidad que gagara una persona por su compra?
 */
public class ejercicio04 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		float compra;
		
		System.out.println("cual es el total de la compra: ");
		compra=entrada.nextFloat();
		
		if (compra>=300) {
			compra=compra-(compra*.20f);
			System.out.println("el total es: "+compra);
		}else {
			System.out.println("el total es: "+compra);
		}
	}
}
