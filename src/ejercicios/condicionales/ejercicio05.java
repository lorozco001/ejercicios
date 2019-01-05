package ejercicios.condicionales;

import java.util.Scanner;

/*
 * un obrero necesita calcular su salario semanal el cual obtiene de la siguiente manera
 * si trabaja 40 hrs o menos se le pagara $16 por hora
 * si trabaja mas de 40 hrs se le pagara 20 por cada hora extra
 */
public class ejercicio05 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int horas,salario;
		
		System.out.println("cuantas horas trabajo a la semana: ");
		horas=entrada.nextInt();
		
		if (horas>40) {
			salario=((horas-40)*20)+(40*16);
			System.out.println("su salario es: "+salario);
		}else {
			salario=horas*16;
			System.out.println("su salario es: "+salario);
		}
	}
}
