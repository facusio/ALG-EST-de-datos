package UT3TA2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio3Queue {

	public static void main(String[] args) {
		Ejercicio3Queue ejercicio = new Ejercicio3Queue();
        
		// Definicion de palindromo: Palabra o frase cuyas letras estan dispuestas
		// de tal manera que resulta la misma leida de izquierda a derecha que
		// de derecha a izquierda.
		
        // Ejemplos de palabras para verificar si son palíndromos
        String[] palabras = {
            "anilina",
            "reconocer",
            "radar",
            "Anita lava la tina",
            "Java",
            "Oso",
            "programacion"
        };
        
        for (String palabra : palabras) {
        	boolean esPalindromo = ejercicio.esPalindromo(palabra);
        	System.out.println("Palabra: " + palabra);
        	
        	String resultado;
        	if (esPalindromo) {
        		resultado = "Si";
        	} else {
        		resultado = "No";
        	}
        	
        	System.out.println("¿Es palindromo? " + resultado);
        }
	}

	public boolean esPalindromo(String palabra) {
		String palabraLimpia = palabra.toLowerCase().replaceAll(" ", "");
		
		Queue<Character> cola = new LinkedList<>();
		Stack<Character> pila = new Stack<>();
		
		for (int i = 0; i < palabraLimpia.length(); i++) {
			char caracter = palabraLimpia.charAt(i);
			cola.offer(caracter);
			pila.push(caracter);
		}
		
		boolean esIgual = true;
		while (!cola.isEmpty()) {
			if (cola.poll() != pila.pop()) {
				esIgual = false;
			}
		}
		
		return esIgual;
	}
}
