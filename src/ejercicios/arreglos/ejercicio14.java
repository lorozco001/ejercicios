package ejercicios.arreglos;

import java.util.Scanner;

/*
 * Ejercicio 14: Leer dos series de 10 enteros, que estaran ordenados crecientemente. 
 * Copiar (Fusionar) las dos tablas en una tercera, de forma que sigan ordenados
 *
 *NOTA: este programa hubiera sido mejor con poo ya que el codigo se repite mucho 
 */
public class ejercicio14 {
	public static void main(String[] args) {
		int[] arreglo1=new int[5];
		int[] arreglo2= new int[5];
		int[] arreglo3=new int[10];
		boolean acendente = false,decendente=false;
		
		Scanner entrada =new Scanner(System.in);
		
		//guarda datos en el arreglo
		for (int i = 0; i < 5; i++) {
			System.out.print("DAME EL "+(i+1)+" NUMERO DEL PRIMER ARREGLO: ");
			arreglo1[i]=entrada.nextInt();
		}
		for (int i = 0; i < (arreglo1.length-1); i++) {
			if (arreglo1[i]<=arreglo1[(i+1)]) {
				acendente=true;
			}else if (arreglo1[i]>=arreglo1[(i+1)]) {
				decendente=true;
			}
		}
		if (acendente == true && decendente==false) {
			acendente=false;
			for (int i = 0; i < 5; i++) {
				System.out.print("DAME EL "+(i+1)+" NUMERO DEL SEGUNDO ARREGLO: ");
				arreglo2[i]=entrada.nextInt();
			}
			for (int i = 0; i < (arreglo2.length-1); i++) {
				if (arreglo2[i]<=arreglo2[(i+1)]) {
					acendente=true;
				}else if (arreglo2[i]>=arreglo2[(i+1)]) {
					decendente=true;
				}
			}
			if (acendente == true && decendente==false) {
				int temporalArr1=0 ,temporalArr2=0;
				for (int j = 0; j < arreglo3.length; j++) {
					if (temporalArr1>=arreglo1.length) {
						arreglo3[j]=arreglo2[temporalArr2];
						temporalArr2++;
					}else if (temporalArr2>=arreglo2.length) {
						arreglo3[j]=arreglo1[temporalArr1];
						temporalArr1++;
					}else if (arreglo1[temporalArr1]<=arreglo2[temporalArr2]) {
							arreglo3[j]=arreglo1[temporalArr1];
							temporalArr1++;
					}else {
							arreglo3[j]=arreglo2[temporalArr2];
							temporalArr2++;
					}
				}
			}else {
				System.out.println("no se puede realizar ya que no es un arreglo acendente");
			}
			
		}else {
			System.out.println("no se puede realizar ya que no es un arreglo acendente");
		}
		
		//imprimir el arreglo acendente
		System.out.print("LOS NUMEROS SON: ");
			for (int i = 0; i < arreglo3.length; i++) {
			System.out.print(" "+arreglo3[i]);
		}
		
	}
}
