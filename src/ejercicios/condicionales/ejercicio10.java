package ejercicios.condicionales;

import java.util.Scanner;

/*
 * pedir el dia mes y año de una fecha e indicar si la fecha es correcta 
 * con meses de 28 30y 31 dias sin años biciestos.
 */
public class ejercicio10 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int dia, mes ,ano;
		System.out.print("dame el dia: ");
		dia =entrada.nextInt();
		System.out.print("dame el mes: ");
		mes =entrada.nextInt();
		System.out.print("dame el año: ");
		ano =entrada.nextInt();
		
		
		if(ano>0&&ano<=2018) {
			if (mes>0&&mes<=12) {
				if (mes==2) {//febrero
					if (dia>0&&dia<=28) {
						System.out.println("dia correcto");
					}else {
						System.out.println("dia incorrecto");
					}
				}else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {//meses con 31
					if (dia>0&&dia<=31) {
						System.out.println("dia correcto");
					}else {
						System.out.println("dia incorrecto");
					}
				}else { //if(mes==4||mes==6||mes==9||mes==11) {meses 30
					if (dia>0&&dia<=30) {
						System.out.println("dia correcto");
					}else {
						System.out.println("dia incorrecto");
					}
				}
			}else {
				System.out.println("mes incorrecto");
			}
		}else {
			System.out.println("año incorrecto");
		}
	}
}
