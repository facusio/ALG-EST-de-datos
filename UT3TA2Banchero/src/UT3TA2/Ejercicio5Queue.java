package UT3TA2;

import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio5Queue {

	public static void main(String[] args) {
		Ejercicio5Queue ejercicio = new Ejercicio5Queue();
        ejercicio.calcularPromedioCola();

	}

	public void calcularPromedioCola() {
		Queue<Integer> cola = new LinkedList<>();
		
		cola.offer(10);
		cola.offer(20);
		cola.offer(30);
		cola.offer(40);
		cola.offer(50);
		
		System.out.println("Cola original: " + cola);
		
		// Variables para calcular el promedio
		int suma = 0;
		int contador = 0;
		
		Queue<Integer> aux = new LinkedList<>();
		
		while (!cola.isEmpty()) {
			int valor = cola.poll();
			
			// Acumular suma y contador
			suma += valor;
			contador++;
			
			// Guardo el valor en la auxiliar para no perder el dato
			aux.offer(valor);
		}
		
		double promedio = 0;
		if (contador > 0) {
			promedio = (double) suma / contador;
		}
		
		System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de elementos: " + contador);
        System.out.println("Promedio: " + promedio);
        
        // Restaurar la cola original
        while (!aux.isEmpty()) {
        	int valor = aux.poll();
            cola.offer(valor);
        }
	}
}
