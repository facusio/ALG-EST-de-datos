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
	
	public int contarVocales(String frase) {
		if (frase == null || frase.isEmpty()) {
			return 0;
		}
		
		// Variable para contar las vocales
		int contadorVocales = 0;
		
		// Convierto a minusculas para que se me haga mas facil verificar.
		frase = frase.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);
			
			// Verificacion de si es vocal.
			if (caracterActual == 'a' || caracterActual == 'e' || caracterActual == 'i' || caracterActual == 'o' || caracterActual == 'u') {
				contadorVocales = contadorVocales + 1;
			}
		}
		
		return contadorVocales;
	}
	
	public int contarConsonantes(String frase) {
		if(frase == null || frase.isEmpty()) {
			return 0;
		}
		
		int contadorConsonantes = 0;
		
		frase = frase.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);
			
			// Necesito verificar si es una letra
			boolean esLetra = Character.isLetter(caracterActual);
			
			// Neceisto verificar si no es una vocal
			boolean noEsVocal = (caracterActual != 'a' && caracterActual != 'e' && caracterActual != 'i' && caracterActual != 'o' && caracterActual != 'u');
			
			if (esLetra && noEsVocal) {
				contadorConsonantes = contadorConsonantes + 1;
			}
		}
		
		return contadorConsonantes;
	}
	
	public int contarPalabrasMayoresA(String frase, int largoMinimo) {
		if (frase == null || frase.trim().isEmpty()) {
			return 0;
		}
		
		int contadorPalabrasLargas = 0;
		
		// Variables auxiliares
		boolean dentroDeUnaPalabra = false;
		int largoActual = 0;
		
		// Agrego un espacio al final para poder con la ultima palabra
		frase = frase + " ";
		
		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);
			
			// Si no es un espacio y estoy en una palabra
			if (caracterActual != ' ') {
				if (!dentroDeUnaPalabra) {
					dentroDeUnaPalabra = true;
					largoActual = 0;
				}
				
				// Aumento el largo de la palabra actual por 1
				largoActual = largoActual + 1;
			}
			
			// Si encuentro un espacio y estoy en una palabra
			else if (dentroDeUnaPalabra) {
				// Termino la palabra actual
				dentroDeUnaPalabra = false;
				
				// Y verifico si la palabra es mas larga que el minimo
				if (largoActual > largoMinimo) {
					contadorPalabrasLargas = contadorPalabrasLargas + 1;
				}
			}
		}
		
		return contadorPalabrasLargas;
	}
}
