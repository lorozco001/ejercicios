package ejercicios.condicionales;

import java.util.Scanner;

/*
 * pedir una nota del 0 al 10 y mostrarla de la forma 
 * insuficiente, suficiente, bien, notable, sobresaliente con case
 */
public class ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int calificacion;
		System.out.print("ingrese calificacion: ");
		calificacion=entrada.nextInt();
		
		
		switch (calificacion) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.print("insuficiente.");
			break;
		case 6:
			System.out.print("suficiente.");
			break;
		case 7:
		case 8:	
			System.out.print("bien.");
			break;
		case 9:
			System.out.print("notable.");
			break;
		case 10:
			System.out.print("sobresaliente.");
			break;
		default:
			System.out.print("calificacion no valida.");
			break;
		}
		
		/* con sentencia if
		if (calificacion>0&&calificacion<=10) {
			if(calificacion<=5) {
				System.out.print("insuficiente.");
			}else if(calificacion==6) {
				System.out.print("suficiente");
			}else if(calificacion==7||calificacion==8) {
				System.out.print("bien");
			}else if (calificacion==9) {
				System.out.print("notable");
			}else {
				System.out.print("sobresaliente");
			}
		}else {
			System.out.print("calificacion incorrecta");
		}*/
	}
}
