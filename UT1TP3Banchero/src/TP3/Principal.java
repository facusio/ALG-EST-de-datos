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
			System.out.println(frase);
			System.out.println(palabras);
			System.out.println();
			
		}
	}

}
