package TP3;

public class Principal {

	public static void main(String[] args) {
		
		// Verificamos si se proporcionó un archivo como argumento
        if (args.length == 0) {
            System.out.println("Por favor, proporcione la ruta del archivo como parámetro.");
            return;
        }
		
		// Ruta del archivo para procesar
		String rutaArchivo = args[0];
				
		// Creo un objeto para contar palabras
		ContadorPalabras contador = new ContadorPalabras();
		
		System.out.println("Procesando archivo: " + rutaArchivo);
		
		String[] frases = contador.obtenerLineas(rutaArchivo);
		
		// Si no se pudo leer el archivo o no tiene líneas
        if (frases.length == 0) {
            System.out.println("No se pudieron obtener líneas del archivo o el archivo está vacío.");
            return;
        }
        
        int totalPalabras = contador.cantPalabras(frases);
        
        System.out.println("El archivo contiene " + totalPalabras + " palabras.");
        
        int totalVocales = 0;
        int totalConsonantes = 0;
        int totalPalabrasLargas = 0;
        
        for (String frase : frases) {
        	totalVocales += contador.contarVocales(frase);
        	totalConsonantes += contador.contarConsonantes(frase);
        	totalPalabrasLargas += contador.contarPalabrasMayoresA(frase, 4);
        }
        
        System.out.println("Total de vocales: " + totalVocales);
        System.out.println("Total de consonantes: " + totalConsonantes);
        System.out.println("Total de palabras con mas de 4 caracteres: " + totalPalabrasLargas);
		
	}

}
