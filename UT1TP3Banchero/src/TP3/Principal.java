package TP3;

public class Principal {

	public static void main(String[] args) {
		// Creo un objeto para contar palabras
		ContadorPalabras contador = new ContadorPalabras();
		
		// Frases para probar
		String[] frases = {
				"Hola Mundo Java",
				"Programar es divertido",
				"123 456 abc def",
				"  espacios  extras  ",
				"" // Frase vacia
		};
		
		for (String frase : frases) {
			// Cuento las palabras de la frase
			int palabras = contador.contarPalabras(frase);
			
			// Muestro resultados de la frase y las palabras
			System.out.println("Frase: " + frase);
			System.out.println("Numero de palabras: " + palabras);
			
			// Cuento vocales, consonantes y palabras largas
			int vocales = contador.contarVocales(frase);
			int consonantes = contador.contarConsonantes(frase);
			int palabrasLargas = contador.contarPalabrasMayoresA(frase, 4);
			
			System.out.println("Numero de vocales: " + vocales);
			System.out.println("Numero de consonantes: " + consonantes);
			System.out.println("Palabras con mas de 4 caracteres: " + palabrasLargas);
		}
	}

}
