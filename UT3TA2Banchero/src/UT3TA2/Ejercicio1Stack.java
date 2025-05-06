package UT3TA2;

import java.util.Stack;

public class Ejercicio1Stack {

	public static void main(String[] args) {
		Ejercicio1Stack ejercicio = new Ejercicio1Stack();
		ejercicio.simularPilaPlatos();
	}
	
	public void simularPilaPlatos() {
		Stack<String> pilaPlatos = new Stack<>();
		
		// Apilar los platos
		System.out.println("Apilando platos ...");
		pilaPlatos.push("Plato 1");
		pilaPlatos.push("Plato 2");
		pilaPlatos.push("Plato 3");
		pilaPlatos.push("Plato 4");
		pilaPlatos.push("Plato 5");
		
		// Mostrar estado actual de la pila de platos
        System.out.println("Estado actual de la pila: " + pilaPlatos);		
		
		// Desapilar los platos
		System.out.println("Desapilando platos ...");
		
		while(!pilaPlatos.isEmpty()) {
			System.out.println(pilaPlatos.pop());
		}
		
		// Verificar el estado final de la pila de platos
        System.out.println("Estado final de la pila: " + pilaPlatos);
	}
}
