package UT3TA1package;

/**
 * Clase Lista que contiene nodos enlazados
 */

public class Lista {
	private Nodo inicio;
	
	public Lista() {
		this.inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}
	
	/**
     * Método que cuenta cuántos nodos contienen valores pares
     * @param nodo nodo inicial desde donde comenzar a contar
     * @return número de nodos con valores pares
     */
	
	public int contarPares(Nodo nodo) {
		int contador = 0;
		Nodo aux = nodo;
		
		while (aux != null) {
			// Verifico si el valor es par
			if(aux.getValor() % 2 == 0) {
				contador++;
			}
			// Avanza al siguiente nodo
			aux = aux.getSiguiente();
		}
		
		return contador;
	}
	
	/**
	 * Método que crea y devuelve una nueva lista con los mismos elementos 
	 * que la lista original, en el mismo orden.
	 * @param nodo nodo inicial de la lista a clonar
	 * @return una nueva lista clonada
	 */
	
	public Nodo clonarLista(Nodo nodo) {
		
		// Si la lista original esta vacia, devolver null
		if (nodo == null) {
			return null;
		}
		
		// Crear el primer nodo de la lista clonada
		Nodo primerNodo= new Nodo();
		primerNodo.setValor(nodo.getValor());
		
		// Crear el resto de nodos
		Nodo actualOriginal = nodo.getSiguiente();
		Nodo actualClonado = primerNodo;
		
		while (actualOriginal != null) {
			
			// Crear un nuevo nodo y copio el valor
			Nodo nuevoNodo = new Nodo();
			nuevoNodo.setValor(actualOriginal.getValor());
			
			// Conectar el nuevo nodo a la lista clonada
			actualClonado.setSiguiente(nuevoNodo);
			
			// Avanzar en ambas listas
			actualOriginal = actualOriginal.getSiguiente();
			actualClonado = actualClonado.getSiguiente();
		}
		
		return primerNodo;
	}
	
	/**
	 * Metodo que crea una nueva lista con los mismos valores pero en orden inverso.
	 * @return una nueva lista con los elementos en orden inverso
	 */
	
	public Lista invertir() {
		// Creao la nueva lista vacia
		Lista listaInvertida = new Lista();
		
		// Si la lista original esta vacia, devolver una lista vacia
		if (inicio == null) {
			return listaInvertida;
		}
		
		// Recorro la lista original, inserto cada valor al inicio de la nueva lista
		Nodo actual = inicio;
		
		while (actual != null) {
			// Creo un nuevo nodo
			Nodo nuevo = new Nodo();
			nuevo.setValor(actual.getValor());
			
			// Inserto el nuevo nodo al inicio de la lista invertida
			nuevo.setSiguiente(listaInvertida.getInicio());
			listaInvertida.setInicio(nuevo);
			
			// Avanzar al siguiente nodo de la lista original
			actual = actual.getSiguiente();
		}
		
		return listaInvertida;
		
	}
	
	/**
	 * Metodo que suma los valores de los nodos ubicados en posiciones pares (0, 2, 4, ...)
	 * @return la suma de los valores en posiciones pares
	 */
	
	public int sumaPosicionesPares() {
		// Inicializo la suma
		int suma = 0;
		
		// Si la lista esta vacia, retorno 0
		if (inicio == null) {
			return suma;
		}
		
		// Recorro la lista
		Nodo actual = inicio;
		int posicion = 0;
		
		while (actual != null) {
			
			// Si la posicion es par, sumo el valor
			if(posicion % 2 == 0) {
				suma += actual.getValor();			
			}
			
			// Avanzo al siguiente nodo
			actual = actual.getSiguiente();
			posicion++;
		}
		
		return suma;
	}
}