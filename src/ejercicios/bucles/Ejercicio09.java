package ejercicios.bucles;
/*
 * EJERCICIO 9: Escribir todos los numeros del 100 al 0 de 7 en 7.
 */
public class Ejercicio09 {
	public static void main(String[] args) {
		for (int i = 100; i >= 0; i-=7) {
			System.out.print(i+",");
		}
	}
}
