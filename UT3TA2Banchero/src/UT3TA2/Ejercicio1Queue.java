package UT3TA2;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1Queue {

	public static void main(String[] args) {
		Ejercicio1Queue ejercicio = new Ejercicio1Queue();
		ejercicio.simularFilaCaja();
	}
	
	public void simularFilaCaja() {
		Queue<String> fila = new LinkedList<>();
		
		System.out.println("Llegan personas a la fila:");
		
		System.out.println("Llega Candela a la fila");
		fila.offer("Candela");
		
		System.out.println("Llega Ana a la fila");
		fila.offer("Ana");
		
		System.out.println("Llega Facundo a la fila");
		fila.offer("Facundo");
		
		System.out.println("Llega Gaston a la fila");
		fila.offer("Gaston");
		
		System.out.println("Llega Sebastian a la fila");
		fila.offer("Sebastian");
		
		// Mostrar estado actual de la fila
		System.out.println("Personas actualmente en la fila: " + fila);
		System.out.println("Persona al frente de la fila: " + fila.peek());
        System.out.println("Número de personas en la fila: " + fila.size());
        
        System.out.println("Atendiendo clientes:");
        while(!fila.isEmpty()) {
        	String persona = fila.poll();
            System.out.println("Atendiendo a: " + persona + " (Quedan: " + fila.size() + " personas)");
        }
        
        System.out.println("Estado final de la fila: " + fila);
	}
}