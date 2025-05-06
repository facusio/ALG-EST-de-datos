package UT3TA2;

import java.util.Stack;

public class Ejercicio2Stack {

	public static void main(String[] args) {
		Ejercicio2Stack ejercicio = new Ejercicio2Stack();
        
        // Ejemplos de expresiones para validar
        String[] expresiones = {
            "(a + b)",
            "[(a + b) * (c - d)]",
            "{[(a + b) * (c - d)] / e}",
            "(a + b",
            "[(a + b) * (c - d)]}",
            "({[]})",
            ")a + b("
        };
        
        for (String exp : expresiones) {
            boolean esBalanceada = ejercicio.validarExpresion(exp);
            System.out.println("Expresión: " + exp);

            String mensaje;
            if (esBalanceada) {
            	mensaje = "Si";
            } else {
            	mensaje = "No";
            }
            
            System.out.println("¿Esta balanceada? " + mensaje);
        }
	}

	public boolean validarExpresion(String expresion) {
		Stack<Character> pila = new Stack<>();
		
		for (int i = 0; i < expresion.length(); i++) {
			char caracter = expresion.charAt(i);
			
			// Si es un parentesis que abre, lo agrego a la pila con un push
			if (caracter == '(') {
				pila.push(caracter);
				
				// Si es un parentesis de cierre
			} else if (caracter == ')') {
				// Si la pila esta vacia, no existe correspondencia
				if (pila.isEmpty()) {
					return false;
				}
				
				// Desapilar con pop para verificar si existe correspondencia
				char maximo = pila.pop();
			
				// Verificar si el parentesis de cierre corresponde con el de apertura
				if ((caracter == ')' && maximo != '(')) {
					return false;
				}
			}
			// Si es cualquier otro caracter, lo ignoramos
		}
		
		// La expresión está balanceada solo si la pila está vacía al final
		return pila.isEmpty();
	}
}