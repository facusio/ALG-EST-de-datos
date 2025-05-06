package UT3TA2;

import java.util.ArrayList;

public class Ejercicio4ArrayList {

	public static void main(String[] args) {
		Ejercicio4ArrayList ejercicio = new Ejercicio4ArrayList();
        ejercicio.verificarPalabra();
	}

	public void verificarPalabra() {
		ArrayList<String> palabras = new ArrayList<>();
		
		palabras.add("Java");
		palabras.add("Python");
		palabras.add("C++");
		palabras.add("JavaScript");
		
		System.out.println("Lista de palabras: " + palabras);
		
		String[] palabrasABuscar = {"Java", "Ruby", "Python", "Swift"};
		
		// Verificar cada palabra
		for (String palabraBuscada : palabrasABuscar) {
			boolean contienePalabra = palabras.contains(palabraBuscada);
			
			// Mostrar resultados
			if (contienePalabra) {
				System.out.println("La palabra " + palabraBuscada + " esta en la lista.");
			} else {
				System.out.println("La palabra " + palabraBuscada + " no esta en la lista.");
			}
		}
	}
}