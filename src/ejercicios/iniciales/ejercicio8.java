package ejercicios.iniciales;

import java.util.Scanner;

/*
 * construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado
 * de coeficientes reales "chiclarronera".
 */
public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double x1,x2;
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.print("ingrese el valor de a: ");
		a=entrada.nextInt();
		System.out.print("ingrese el valor de b: ");
		b=entrada.nextInt();
		System.out.print("ingrese el valor de c: ");
		c=entrada.nextInt();
		
		x1=(-b + Math.sqrt((b*b)-4*a*c))/(2*a);
		x2=(-b - Math.sqrt((b*b)-4*a*c))/(2*a);
		
		System.out.println("las raices son: ");
		System.out.println("x1= "+x1);
		System.out.print("x2= "+x2);
	}

}
