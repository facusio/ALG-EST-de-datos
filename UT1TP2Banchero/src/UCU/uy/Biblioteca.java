package UCU.uy;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	// Atributos

	private List<Libro> librosDisponibles;
	
	// Constructor
	
	public Biblioteca() {
		this.librosDisponibles = new ArrayList<>();
	}
	
	// Getter
	
	public List<Libro> getLibrosDisponibles() {
		return librosDisponibles;
	}
	
	// Prestar libro
	
	public void prestarLibro(Libro libro) {
		librosDisponibles.add(libro);
	}
	
	// Devolver libro
	
	public void devolverLibro(Libro libro) {
		librosDisponibles.remove(libro);
	}
	
	// Validar que el libro exista por el titulo
	// Usar .equalIgnoreCase()
	// Verificar si esta disponible
	
	public boolean validacionDisponibilidad(String titulo) {
		
		// Recorrer la lista de libros disponibles
		
		for (int i = 0; i < librosDisponibles.size(); i++) {
			
			// Verificar si el titulo del libro coincide y esta disponible
			
			if (librosDisponibles.get(i).getTitulo().equalsIgnoreCase(titulo) && librosDisponibles.get(i).isDisponible()) {
				
				// Marcar el libro como no disponible
				
				librosDisponibles.get(i).setDisponibilidad(false);
				
				return true; // Indicar que el libro puede ser prestado
			}
		}
		
		return false; // Indica false si el libro no existe o no esta disponible para ser prestado
	}
}
