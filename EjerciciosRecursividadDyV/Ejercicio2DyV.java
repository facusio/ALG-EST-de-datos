public class Ejercicio2DyV {
    public static int sumBinaryDigits(String binary) {
        // Caso base: si la cadena binaria está vacía, devuelve 0
        if (binary.isEmpty()) {
            return 0;
        }
        
        // Caso recursivo: divide la cadena binaria en dos mitades
        int mid = binary.length() / 2;
        String leftHalf = binary.substring(0, mid);
        String rightHalf = binary.substring(mid);
        
        // Calcula la suma de los dígitos binarios en la mitad izquierda y derecha
        int sumLeft = sumBinaryDigits(leftHalf);
        int sumRight = sumBinaryDigits(rightHalf);
        
        // Retorna la suma de los dígitos binarios en ambas mitades
        return sumLeft + sumRight;
    }
}
