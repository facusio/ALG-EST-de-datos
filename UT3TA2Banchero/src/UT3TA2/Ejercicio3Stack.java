package UT3TA2;

import java.util.Stack;

public class Ejercicio3Stack {

	public static void main(String[] args) {
		Ejercicio3Stack ejercicio = new Ejercicio3Stack();
        ejercicio.invertirPalabra();
	}

	public void invertirPalabra() {
		String palabra = "Hola Mundo";
		System.out.println("Palabra original: " + palabra);
		
		Stack<Character> pila = new Stack<>();
		
		// Apilar cada caracter de la palabra
		for (int i = 0; i < palabra.length(); i++) {
			char caracter = palabra.charAt(i);
			pila.push(caracter);
		}
		
		String palabraInvertida = "";
		while (!pila.isEmpty()) {
			char caracter = pila.pop();
			palabraInvertida = palabraInvertida + caracter;
		}
		
		System.out.println("Palabra original: " + palabra);
		System.out.println("Palabra invertida: " + palabraInvertida);
	}
}
