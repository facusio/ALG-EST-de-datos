package UT3TA2;

import java.util.ArrayList;

public class Ejercicio5ArrayList {

	public static void main(String[] args) {
		Ejercicio5ArrayList ejercicio = new Ejercicio5ArrayList();
        ejercicio.sumarFlotantes();
	}

	public void sumarFlotantes() {
		ArrayList<Float> numeros = new ArrayList<>();
		
		numeros.add(1.5f);
		numeros.add(2.7f);
		numeros.add(3.2f);
		numeros.add(4.9f);
		numeros.add(5.1f);
		
		System.out.println("Numeros flotantes: " + numeros);
		
		float suma = 0;
		
		for (Float num : numeros) {
			suma += num;
		}
		
		System.out.println("La suma de todos los elementos es: " + suma);
	}
}