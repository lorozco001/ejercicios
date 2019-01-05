package ejercicios.condicionales;

import java.util.Scanner;

/*
 * pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
 */
public class ejercicio08 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int numero;
		
		System.out.print("ingresa la cantidad: ");
		numero=entrada.nextInt();
		
		if (numero>0&&numero<=100000) {
			if (numero>0&&numero<10) {
				System.out.print("1");
			}else if(numero>10&&numero<100) {
				System.out.print("2");
			}else if(numero>100&&numero<1000) {
				System.out.print("3");
			}else if(numero>1000&&numero<10000) {
				System.out.print("4");
			}else {
				System.out.print("5");
			}
		}else {
			System.out.print("el numero no corresponde es mayor a 5 cifras o es negativo.");
		}
		
	}
}
