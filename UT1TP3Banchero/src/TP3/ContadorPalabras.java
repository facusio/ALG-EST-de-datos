package TP3;

public class ContadorPalabras {

	/**
	 * Metodo para contar palabras en una frase.
	 * Caracteristicas: No usar split(), Una palabra debe contener al menos un caracter alfabetico.
	 * @param frase Texto a analizar
	 * @return Numero de palabras
	 */

	public int contarPalabras(String frase) {
		// Si la frase es nula o vacia, retorna 0
		if (frase == null || frase.trim().isEmpty()) {
			return 0;
		}
		
		// Variable para contar palabras
		// Variable para saber si estamos dentro de una palabra
		int contadorPalabras = 0;
		boolean enPalabra = false;
		
		// Recorremos cada caracter de la frase
		for(int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i); // Obtengo el caracter actual
			boolean esLetra = Character.isLetter(caracterActual); // Verifico si el caracter es una letra.
			
			// Si encuentro una letra y no estamos en una palabra
			if (esLetra && !enPalabra) {
				// Comenienzo una palabra
				contadorPalabras = contadorPalabras + 1;
				enPalabra = true;
			}
			
			// Si encuentro un espacio, salgo de la palabra
			if (caracterActual == ' ') {
				enPalabra = false;
			}
		}
		
		// Devuelvo el numero de palabras
		return contadorPalabras;
	}
}
