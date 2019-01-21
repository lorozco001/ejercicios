package ejercicios.bucles;

import java.util.Scanner;

/*
 *EJERCICIO 14: Pedir 10 sueldos y mostrar su suma y cuantos hay mayores de $1000.
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		int sueldos, suma=0, mayores=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESA LOS 10 SUELDOS");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" Sueldo: ");
			sueldos=entrada.nextInt();
			suma +=sueldos;
			if (sueldos >= 1000) {
				mayores++;
			}
		}
		System.out.println("la suma es: "+suma );
		System.out.println("hay "+mayores+" personas que ganas mas de $1000 pesos");
	}

}
