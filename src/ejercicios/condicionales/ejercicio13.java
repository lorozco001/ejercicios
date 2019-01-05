package ejercicios.condicionales;

import java.util.Scanner;

/*
 * hacer un programa que simule un cajero automatico con un saldo inicial de 1000 pesos
 * con el siguiente menu de opciones
 */
public class ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int opcion,operacion;
		
		System.out.println("Bienvenido al cajero cuenta con $1000");
		System.out.println("Seleccione la opcion que desea realizar");
		System.out.println("1.- Ingresar dinero a la cuenta.");
		System.out.println("2.- Retirar dinero de la cuenta.");
		System.out.println("3.- Salir");
		System.out.print("Ingrese su Opcion: ");
		opcion=entrada.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.print("cuanto desea ingresar: ");
			operacion=entrada.nextInt();
			System.out.print("su monto total es de: "+(1000+operacion));
			break;
		case 2:
			System.out.print("cuanto desea retirar: ");
			operacion=entrada.nextInt();
			if (operacion>0&&operacion<=1000) {
				System.out.print("su monto total es de: "+(1000-operacion));
			}else {
				System.out.print("no se puede retirar, la cantidad tiene que ser menor a $1000.");
			}
			break;
		case 3:
			System.out.print("vuelva pronto.");
			break;
		default:
			System.out.println("opcion no valida");
			break;
		}
		
	}
}
