package UT3TA2;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2Queue {

	public static void main(String[] args) {
		Ejercicio2Queue ejercicio = new Ejercicio2Queue();
        ejercicio.eliminarMultiplosDe3();
	}

	public void eliminarMultiplosDe3() {
		Queue<Integer> cola = new LinkedList<>();
		
		for (int i = 1; i <= 20; i++) {
			cola.offer(i);
		}
		
		System.out.println("Cola original: " + cola);
		
		Queue<Integer> colaFiltrada = new LinkedList<>();
		int tamanioOriginal = cola.size();
		
		for (int i = 0; i < tamanioOriginal; i++) {
            int numero = cola.poll(); // Sacar el número de la cola original
            
            // Si no es múltiplo de 3, añadirlo a la cola filtrada
            if (numero % 3 != 0) {
                colaFiltrada.offer(numero);
            }
		}
        System.out.println("Cola después de eliminar múltiplos de 3: " + colaFiltrada);
	}
}
