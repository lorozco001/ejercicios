package ejercicios.bucles;
import java.util.Random;
import java.util.Scanner;

/*
 * EJERCICIO 5: Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100, 
 *y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
 *El proceso termina cuando el usuario acierta y mostrar el numero de intentos. 
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		int numero,mialeatorio;
		
		Random aleatorio=new Random();
		mialeatorio=aleatorio.nextInt(100);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		numero=entrada.nextInt();
		
		while(mialeatorio != numero){	
			if (mialeatorio>numero) {
				System.out.println("\ntu numero es menor");
				System.out.print("dame otro numero: ");
				numero=entrada.nextInt();
			}else {
				System.out.println("\ntu numero es mayor");
				System.out.print("dame otro numero: ");
				numero=entrada.nextInt();
			}
		}
		System.out.println("\nfin del programa le atinaste el numero es: "+mialeatorio);
		//JOptionPane.showMessageDialog(null, "fin del programa le atinaste el numero es: "+mialeatorio);
	}
}
