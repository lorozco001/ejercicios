package ejercicios.condicionales;

import java.util.Scanner;

/*
 * pedir tres numeros y mostrarlos ordenados del mayomenormenorr al menor
 */
public class ejercicio07 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int a, b, c;
		
		System.out.print("ingresa el primer numero: ");
		a=entrada.nextInt();
		System.out.print("ingresa el primer numero: ");
		b=entrada.nextInt();
		System.out.print("ingresa el primer numero: ");
		c=entrada.nextInt();
		
		 if(a>b&&a>c){
		        if (b>c) {
		            System.out.print("El orden es: "+a+", "+b+", "+c);
		        }else if(c>b){
		            System.out.print("El orden es: "+a+", "+c+", "+b);
		        }else{
		            System.out.print("El orden es: "+a+", "+c+" igual "+b);
		        }
		    }else if(b>a&&b>c){
		        if (a>c) {
		            System.out.print("El orden es: "+b+", "+a+", "+c);
		        }else if(c>a){
		            System.out.print("El orden es: "+b+", "+c+", "+a);
		        }else{
		            System.out.print("El orden es: "+b+", "+c+" igual "+b);
		        }
		    }else if(c>a&&c>b){
		        if (a>b) {
		            System.out.print("El orden es: "+c+", "+a+", "+b);
		        }else if(b>a){
		        	System.out.print("El orden es: "+c+", "+b+", "+a);
		        }else{
		            System.out.print("El orden es: "+c+", "+b+" igual "+a); 
		        }
		    }else{
		        if(a==b&&a==c){
		        	System.out.print("Todos son iguales con un valor de: "+a);//abc
		        }else{
		            if (a==b) {
		                System.out.print("El orden es: "+a+" igual "+b+", "+c);
		            }else if (a==c) {
		                System.out.print("El orden es: "+a+" igual "+c+", "+b);
		            }else {
		                System.out.print("El orden es: "+b+" igual "+c+", "+a);
		            }
		        }
		    }
	}
}
