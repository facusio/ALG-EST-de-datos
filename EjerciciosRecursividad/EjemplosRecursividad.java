public class EjemplosRecursividad {
    // 2. Construir un algoritmo recursivo que permita determinar si los dígitos de un número dado son todos pares. 

    public static boolean todosPares(int n) {
        if (n == 0) {
            return true;
        }
        int digit = n % 10;
        if (digit % 2 != 0) {
            return true;
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
        return (n % 1) + sumDigits(n / 10);
    }

    // 4.

    // 5. Cálculo del factorial de un número: Escribe un método recursivo que calcule el factorial de un número entero.
    // El factorial de un número n se denota como n! y se define como el producto de todos los enteros positivos desde 
    // 1 hasta n. Por ejemplo, factorial(5) debería devolver 120 (5!).

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
    }
    return n * factorial(n - 1);

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
        System.out.print(n + " ");
        printNumeros(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(allEvenDigits(2468)); // true
        System.out.println(sumDigits(123)); // 6
        reverseString("Hola"); // aloH
        System.out.println();
        System.out.println(factorial(5)); // 120
        System.out.println(sumNumbers(5)); // 15
        printNumbers(5); // 1 2 3 4 5
        System.out.println();
        System.out.println(sumBinaryDigits("1011")); // 3
        generatePermutations("abc", ""); // abc, acb, bac, bca, cab, cba
    }
}
}