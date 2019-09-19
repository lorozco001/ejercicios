package ejercicios.poo.ejercicio2;

import javax.swing.JOptionPane;

/*
 * Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y 
 * actualice su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
 * Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación 
 * del objeto dentro del tablero.
 */
public class ejercicio02 {
	public static void main(String[] args){
        //Variable
        char proximoMov;
        boolean salir=false;
        //Crear objeto con cordenadas iniciales x=0, y=0
        movimiento objeto = new movimiento(0,0);
        System.out.println("POSICION INICIAL: ("+objeto.getEjeX()+","+objeto.getEjeY()+")");
        
        while (!salir) {
        	proximoMov = JOptionPane.showInputDialog("Ingrese el siguiente movimiento\n"+
					"W-Adelante\n"+
					"S-Atras\n"+
					"A-Izquierda\n"+
					"D-Derecha\n"+
					"E-Salir\n ").charAt(0);
		
        	switch(proximoMov){
            case 'W': 
                objeto.moverArriba();
                break;
            case 'S':
                objeto.moverAbajo();
                break;
            case 'A':
                objeto.moverIzquierda();
                break;
            case 'D': 
                objeto.moverDerecha();
                break;
            case 'E':
                System.out.println("Gracias por jugar!");
                salir=true;
                break;
            default: 
                System.out.println("Movimiento no reconocido");
                break;
                
        	}
		}
	}
}