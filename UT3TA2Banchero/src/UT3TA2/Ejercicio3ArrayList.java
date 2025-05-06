package UT3TA2;

import java.util.ArrayList;

public class Ejercicio3ArrayList {

	public static void main(String[] args) {
		Ejercicio3ArrayList ejercicio = new Ejercicio3ArrayList();
		ejercicio.eliminarMayoresA50();

	}

	public void eliminarMayoresA50() {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// Agregar numeros
		numeros.add(25);
		numeros.add(72);
		numeros.add(43);
		numeros.add(91);
		numeros.add(12);
		numeros.add(55);
		numeros.add(30);
		numeros.add(67);
		
		System.out.println("Lista original: " + numeros);
		
		ArrayList<Integer> resultado = new ArrayList<>();
		for (Integer num : numeros) {
			if (num <= 50) {
				resultado.add(num);
			}
		}
		
		System.out.println("Lista despues de eliminar numeros mayores a 50 " + resultado);
	}
}
