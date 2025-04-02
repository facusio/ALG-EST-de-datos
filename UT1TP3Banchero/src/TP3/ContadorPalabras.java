package TP3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContadorPalabras {

	/**
	 * Metodo para contar palabras en una frase.
	 * Caracteristicas: No usar split(), Una palabra debe contener al menos un caracter alfabetico.
	 * @param frase texto a analizar
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
	
	/**
	 * Metodo para contar la cantidad de vocales en una frase.
	 * @param frase texto a analizar
	 * @return Numero de vocales encontradas
	 */
	
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
	
	/**
	 * Metodo que cuenta la cantidad de consonantes en una frase.
	 * @param frase texto a analizar
	 * @return Numero de consonantes encontradas
	 */
	
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
	
	/**
	 * Metodo que cuenta palabras que superan un largo minimo especificado
	 * @param frase texto a analizar
	 * @param largoMinimo Longitud minima que deben superar las palabras
	 * @return Numero de palabras que superan el largo minimo
	 */
	
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
	
	/**
	 * Retorna un array de strings con las lineas de texto contenidas en un archivo dado e indica la cantidad de lineas leidas.
	 * @param archivo Ruta del archivo a leer
	 * @return Un arreglo de strings donde cada elemento es una linea del archivo
	 */
	
	public String[] obtenerLineas(String archivo) {
		
		// Lista para almacenar las lineas
		ArrayList<String> frases = new ArrayList<>();
		
		// FileReader(archivo) abre el archivo como texto
		// BufferedReader para leer el archivo linea por linea
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String frase;
			
			// Leer el archivo linea por linea
			while ((frase = br.readLine()) != null) {
				frases.add(frase);
			}
			
			System.out.println("Cantidad de lineas leidas: " + frases.size());
			br.close(); // cierra el archivo
		
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
		
		// Convertir el ArrayList a un array de string y retornarlo
		return frases.toArray(new String [0]);
	}
	
	/**
	 * Dado un array de strings que contiene las lineas de texto, retorna la cantidad de palabras contenidas.
	 * @param lineasArchivo array de lineas de texto
	 * @return Cantidad total de palabras
	 */
	
	public int cantPalabras(String[] lineasArchivo) {
		// Variable para contar el total de palabras
		int totalPalabras = 0;
		
		// Recorre cada linea del archivo
		for (String frase : lineasArchivo) {
			
			// Contar las palabras en la linea actual y sumar al total
			totalPalabras = totalPalabras + contarPalabras(frase);
		}
		
		return totalPalabras;
	}
	
}
