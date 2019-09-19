package ejercicios.poo.ejercicio5;

import java.util.Scanner;

/*
 * Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
 * Para ello defina los atributos necesarios que se requieren, 
 * proporcione métodos de consulta, un método constructor e implemente métodos para calcular 
 * el perímetro y el área de un triángulo, además implementar un método que a partir de un arreglo de 
 * triángulos devuelva el área del triángulo de mayor superficie.
 */
public class ejercicio05 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double base,lado;
		int numeroTriangulos;
	
		System.out.print("Digite el numero de triangulos a ingresar: ");
		numeroTriangulos=entrada.nextInt();
		
		triangulo triangulos[] =new triangulo[numeroTriangulos];
	
		for (int i = 0; i < triangulos.length; i++) {
			System.out.println("\nDigite los valores para el triangulo"+(i+1)+": ");
			System.out.print("Introduzca la base: ");
			base=entrada.nextDouble();
			System.out.print("Introduzca el lado: ");
			lado=entrada.nextDouble();
			
			triangulos [i]=new triangulo(base, lado);
			
			System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
			System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
		}
		System.out.println("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
	}
	private static double mayorArea(triangulo triangulos[]) {
		double area;
		
		area=triangulos[0].obtenerArea();
		for (int i = 1; i < triangulos.length; i++) {
			if (triangulos[i].obtenerArea()>area) {
				area=triangulos[i].obtenerArea();
			}
		}
		
		return area;
	}
}
