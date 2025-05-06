package UT3TA2;

import java.util.Stack;

public class Ejercicio4Stack {

	public static void main(String[] args) {
		Ejercicio4Stack ejercicio = new Ejercicio4Stack();
		
		Stack<Integer> pilaOriginal = new Stack<>();
		
		pilaOriginal.push(10);
        pilaOriginal.push(20);
        pilaOriginal.push(30);
        pilaOriginal.push(40);
        pilaOriginal.push(50);

        System.out.println("Pila original: " + pilaOriginal);

        // Hacer una copia de la pila
        Stack<Integer> pilaCopia = ejercicio.copiarPila(pilaOriginal);
        
        // Verificar que ambas pilas sean independientes
        System.out.println("Pila original después de copiar: " + pilaOriginal);
        System.out.println("Pila copiada: " + pilaCopia);
        
        // Modificar la pila original para demostrar que es independiente
        pilaOriginal.push(60);
        System.out.println("Pila original modificada: " + pilaOriginal);
        System.out.println("Pila copiada (sin cambios): " + pilaCopia);
	}

	public Stack<Integer> copiarPila(Stack<Integer> pilaOriginal) {
		Stack<Integer> pilaAuxiliar = new Stack<>();
		Stack<Integer> pilaCopia = new Stack<>();
		
		while (!pilaOriginal.isEmpty()) {
			pilaAuxiliar.push(pilaOriginal.pop());
		}
		
		while (!pilaAuxiliar.isEmpty()) {
			int elemento = pilaAuxiliar.pop();
			pilaOriginal.push(elemento);
			pilaCopia.push(elemento);
		}
		
		Stack<Integer> pilaCopiaNueva = new Stack<>();
		while (!pilaCopia.isEmpty()) {
			pilaCopiaNueva.push(pilaCopia.pop());
		}
		
		return pilaCopiaNueva;
	}
}
