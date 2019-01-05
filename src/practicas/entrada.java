package practicas;

import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String mistring;
		Scanner entrada1=new Scanner(System.in);
		int mientero;
		Scanner entrada2=new Scanner(System.in);
		float midecimal;
		
		System.out.println("Ingrese una Palábra: ");
		mistring=entrada.nextLine();
		System.out.println("Ingrese un Número Entero: ");
		mientero =entrada1.nextInt();
		System.out.println("Ingrese un Número Decimal:");
		midecimal=entrada2.nextFloat();
		
		System.out.println("Tu palabra es: "+mistring+" \nTu Número Entero es : "+mientero+"\nTu Número Decimal es: "+ midecimal);
	}

}
