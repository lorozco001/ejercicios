package ejercicios.condicionales;

import java.util.Scanner;

/*
 * pedir el dia mes y año de una fecha e indicar si la fecha es correcta.
 * suponiendo que todos los meses son de 30 dias.
 */
public class ejercicio09 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int dia, mes ,ano;
		System.out.print("dame el dia: ");
		dia =entrada.nextInt();
		System.out.print("dame el mes: ");
		mes =entrada.nextInt();
		System.out.print("dame el año: ");
		ano =entrada.nextInt();
		
		if (dia>0&&dia<=30 &&mes>0&&mes<=12 && ano>0&&ano<=2018) {
			System.out.print("fecha correcta: "+dia+","+mes+","+ano);
		}else {
			System.out.print("fecha incorrecta: "+dia+","+mes+","+ano);
		}
		
		
	}
}
