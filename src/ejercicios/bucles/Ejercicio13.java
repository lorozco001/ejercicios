package ejercicios.bucles;

import java.util.Scanner;

/*
 * EJERCICIO 14: Pedir 10 numeros positivos, la media de los numeros negativos y la cantifdad de ceros.
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		int ceros=0,numero,sumapos=0,sumaneg=0,contadorpos=0,contadorneg=0;
		float prompos,promneg;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i+".- INGRESE SU NUMERO: ");
			numero=entrada.nextInt();
			
			if (numero<0) {
				contadorneg++;
				sumaneg +=numero;
				
			}else if(numero>0) {
				contadorpos++;
				sumapos+=numero;
			}else if(numero == 0){
				ceros++;
			}
			
		}
		promneg=(float)sumaneg/contadorneg;
		prompos=(float)sumapos/contadorpos;
		if (contadorneg == 0) {
			if (contadorpos == 0) {
				System.out.println("NO HAY NUMEROS NEGATIVOS");
				System.out.println("NO HAY NUMEROS POSITIVOS");
				System.out.println("HAY "+ceros+" CEROS");	
			}else {
				System.out.println("NO HAY NUMEROS NEGATIVOS");	
				System.out.println("EL PROMEDIO POSITIVO ES: "+prompos);
				System.out.println("HAY "+ceros+" CEROS");	
			}
		}else if(contadorpos == 0){
			System.out.println("NO HAY NUMEROS POSITIVOS");	
			System.out.println("EL PROMEDIO NEGATIVOS ES: "+promneg);
			System.out.println("HAY "+ceros+" CEROS");	
		}else {
			System.out.println("EL PROMEDIO NEGATIVOS ES: "+promneg);
			System.out.println("EL PROMEDIO POSITIVO ES: "+prompos);
			System.out.println("HAY "+ceros+" CEROS");	
		}
	}
}
