package UT3TA2;

import java.util.Stack;

public class Ejercicio5Stack {

	public static void main(String[] args) {
        Ejercicio5Stack ejercicio = new Ejercicio5Stack();
        
        Stack<Object> pila = new Stack<>(); // Pila con 3 elementos
        
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");
        pila.push("Elemento 4");
        pila.push("Elemento 5");
        
        // Mostrar la pila original
        System.out.println("Pila original: " + pila);
        
        int cantidadElementos = ejercicio.contarElementosPila(pila);
        
        System.out.println("Número de elementos: " + cantidadElementos);
        System.out.println("Pila después de contar: " + pila);
	}

	public int contarElementosPila(Stack<Object> pila) {
		Stack<Object> pilaAuxiliar = new Stack<>();
		int contador = 0;
		
		// Desapilar todos los elementos, los cuento y los guardo en la pila auxiliar
		while (!pila.isEmpty()) {
			pilaAuxiliar.push(pila.pop());
			contador++;
		}
		
		// Restaurar la pila original
		while (!pilaAuxiliar.isEmpty()) {
			pila.push(pilaAuxiliar.pop());
		}
		
		return contador;
	}
}
