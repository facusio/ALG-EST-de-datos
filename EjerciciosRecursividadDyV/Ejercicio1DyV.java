public class Ejercicio1DyV {
    public static void main(String[] args) {
        // Cadena de entrada que se desea invertir
        String input = "hola";
        
        // Llamada al método recursivo para invertir la cadena
        String reversed = reverseString(input);
        
        // Imprime la cadena invertida en la consola
        System.out.println(reversed);
    }

    // Método recursivo para invertir una cadena
    public static String reverseString(String str) {
        // Caso base: si la longitud de la cadena es 1 o menor, se devuelve la cadena tal cual
        if (str.length() <= 1) {
            return str;
        } else {
            // Encuentra el punto medio de la cadena
            int mid = str.length() / 2;
            
            // Divide la cadena en dos mitades: izquierda y derecha
            String left = str.substring(0, mid); // Subcadena desde el inicio hasta el medio
            String right = str.substring(mid);  // Subcadena desde el medio hasta el final
            
            // Llama recursivamente al método para invertir ambas mitades
            // y las concatena en orden inverso (derecha primero, luego izquierda)
            return reverseString(right) + reverseString(left);
        }
    }
}
