public class UT2TABanchero {
    // 1. Determine recursivamente si un numero dado es paro o impar, usando solo la operacion resta.

    public static boolean esPar(int n) {
        if (n == 0) {
            return true; // Caso base: 0 es par
        }
        if (n == 1) {
            return false; // Caso base: 1 es impar
        }
        return esPar(n - 2); // Paso recursivo: restar 2
    }

    // 2. Construir un algoritmo recursivo que permita determinar si los dígitos de un número dado son todos pares. 

    public static boolean todosPares(int n) {
        if (n == 0) {
            return true;
        }
        int digit = n % 10;
        if (digit % 2 != 0) {
            return false;
        }
        return todosPares(n / 10);
    }

    // 3. Suma de los dígitos de un número: Escribe un método recursivo que calcule la suma de los dígitos de un número 
    // entero. El método debe aceptar un solo parámetro: el número entero del cual se calculará la suma de los dígitos. 
    // Por ejemplo, sumDigits(123) debería devolver 6 (1 + 2 + 3).

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    // 4. Impresion de una cadena en orden inverso: El metodo debe aceptar una solo parametro: la cadena que se imprimira en orden inverso.
    // Por ejemplo, si la cadena es "Hola" la salida deberia salir "aloH".

    public static String imprimirInverso(String cadena) {
        if(cadena.isEmpty() || cadena == null) {
            return "";
        }
        return cadena.substring(cadena.length() - 1) + imprimirInverso(cadena.substring(0, cadena.length() - 1));
    }

    // 5. Cálculo del factorial de un número: Escribe un método recursivo que calcule el factorial de un número entero.
    // El factorial de un número n se denota como n! y se define como el producto de todos jlos enteros positivos desde 
    // 1 hasta n. Por ejemplo, factorial(5) debería devolver 120 (5!).

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
    }
    return n * factorial(n - 1);
}

    // 6. Cálculo de la suma de los primeros n números naturales: Escribe un método recursivo que calcule la suma 
    // de los primeros n números naturales. Por ejemplo, sumaNumeros(5) debería devolver 15 (1 + 2 + 3 + 4 + 5).

    public static int sumaNumeros(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaNumeros(n - 1);
    }

    // 7. Impresión de números naturales en orden ascendente: Escribe un método recursivo que imprima 
    // todos los números naturales desde 1 hasta n en orden ascendente. Por ejemplo, printNumbers(5)
    // debería imprimir "1 2 3 4 5".

    public static void printNumeros(int n) {
        if (n == 0) {
            return;
        }
        printNumeros(n - 1);
        System.out.print(n + " ");
    }

    // 8. Calculo de la suma de los digitos de un numero binario: Escribe un método recursivo que calcule la suma de los dígitos de un número binario. 
    // El metodo debe aceptar un solo parametro: El numero binario como una cadena de digitos (0 o 1). Por ejemplo: sumBinaryDigits("1011") deberia devolver 3 (1 + 0 + 1 + 1).

    public static int sumBinaryDigits(String binario) {
        if(binario.isEmpty() || binario == null) {
            return 0;
        }
        if (binario.length() == 1) { // Paso base: cuando solo hay un dígito
            return binario.charAt(0) - '0';
        }
        int digit = binario.charAt(binario.length() - 1) - '0'; // Último dígito
        String subBinario = binario.substring(0, binario.length() - 1); // Subcadena sin el último dígito
        return digit + sumBinaryDigits(subBinario); // Paso recursivo: suma el dígito actual y llama recursivamente con la subcadena
    }
}