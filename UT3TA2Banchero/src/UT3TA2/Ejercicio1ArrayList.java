package UT3TA2;

import java.util.ArrayList;

// 1. Agregar 10 números enteros a una ArrayList y mostrar solo los pares.

public class Ejercicio1ArrayList {

	public static void main(String[] args) {
		System.out.println("Ejercicio 1: Mostrar solo los números pares");
		Ejercicio1ArrayList ejercicio = new Ejercicio1ArrayList();
		ejercicio.soloPares();
	}

	public void soloPares() {
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);

		System.out.println("Lista original: " + numeros);

		// Mostrar solo los numeros pares
		for (Integer num : numeros) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
}