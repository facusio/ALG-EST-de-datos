public class Ejercicio3DyV {
    public static void main(String[] args) {
        String cadena = "abc";
        generarPermutaciones(cadena, "");
    }
    
    public static void generarPermutaciones(String cadena, String permutacionParcial) {
        // Caso base: si la cadena parcial tiene la misma longitud que la cadena original, imprimir la permutación
        if (permutacionParcial.length() == cadena.length()) {
            System.out.println(permutacionParcial);
        } else {
            // Recorrer los caracteres de la cadena original
            for (int i = 0; i < cadena.length(); i++) {
                // Si el caracter no está en la cadena parcial, agregarlo y generar las permutaciones restantes
                if (!permutacionParcial.contains(String.valueOf(cadena.charAt(i)))) {
                    generarPermutaciones(cadena, permutacionParcial + cadena.charAt(i));
                }
            }
        }
    }
}
