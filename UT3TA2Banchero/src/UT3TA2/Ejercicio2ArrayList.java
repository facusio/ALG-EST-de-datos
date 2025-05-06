package UT3TA2;

import java.util.ArrayList;

public class Ejercicio2ArrayList {

	public static void main(String[] args) {
		System.out.println("Ejercicio 2: Nombres en orden inverso");
        Ejercicio2ArrayList ejercicio = new Ejercicio2ArrayList();
        ejercicio.nombresInversos();
	}
	
	public void nombresInversos() {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Facundo");
		nombres.add("Gaston");
		nombres.add("Candela");
		nombres.add("Mora");
		nombres.add("Macarena");
		nombres.add("Sebastian");
		
		System.out.println("Nombres en orden original: " + nombres);
		
		// Nombres en inverso
		for (int i = nombres.size() - 1; i >= 0; i--) {
			System.out.print(nombres.get(i));
			if (i > 0) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
	}
}
