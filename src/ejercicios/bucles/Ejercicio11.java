package ejercicios.bucles;
/*
 * Diseñar un programa que muestre el producto de los 10 primeros numeros impares.
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		int producto=1;
		for (int i = 1; i <= 20;i+=2 ) {
			System.out.print(i+",");
			producto*=i;
		}
		System.out.println("\nEL PRODUCTO ES: "+producto);
	}
}
