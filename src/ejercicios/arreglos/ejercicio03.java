package ejercicios.arreglos;

import java.util.Scanner;


/*
 * Ejercicio 3: LeerEjercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo 
 * y a continuación realizar la media de los números positivos, 
 * la media de los negativos y conteo el número de ceros.
*/
public class ejercicio03 {
	  public static void main(String[] args) {
	       int numeros[]= new int [5];
	       int contadorNegativo=0, sumaNegativos=0,contadorPositivo=0,sumaPositivos=0,contadorCeros=0;
	       Scanner entrada =new Scanner(System.in);
	       System.out.println("PROGRAMA QUE GUARDA 5 NUMEROS CON ARREGLOS Y MEDIAS.");
			
			//guarda datos en el arreglo
			for (int i = 0; i < numeros.length; i++) {
				System.out.print("DAME EL "+(i+1)+" NUMERO: ");
				numeros[i]=entrada.nextInt();
			}
		
			//recorrer el arreglo
			for (int i = 0; i < numeros.length; i++) {		
				if (numeros[i]<0) {	//numeros negativos 
					contadorNegativo++;
					sumaNegativos+=numeros[i];
				}else if(numeros[i]>0){	//numeros positivos 
					contadorPositivo++;
					sumaPositivos+=numeros[i];
				}else {//ceros
					contadorCeros++;
				}
			}
			
			//imprimir el arreglo 
			System.out.print("LOS NUMEROS SON: ");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(" "+numeros[i]);
			}
			
			//media positiva
			if (contadorPositivo>0) {
				System.out.println("\n"+"media de numeros positivos: " +(sumaPositivos/contadorPositivo));
			}else {
				System.out.println("\n"+"no hay numeros positivos");
			}
			
			//media negativa
			if (contadorNegativo>0) {
				System.out.println("media de numeros positivos: " +(sumaNegativos/contadorNegativo));
			}else {
				System.out.println("no hay numeros negativos");
			}
			
			//cantidad de ceros
			System.out.println("cantidad de ceros: " +contadorCeros);
	  }
	  
}
