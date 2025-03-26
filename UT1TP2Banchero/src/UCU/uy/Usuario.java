package UCU.uy;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	// Atributos
	
	private String nombre;
	private String apellido;
	private String numeroIdentificacion;
	private List<Libro> librosPrestados;
	
	// Constructor
	
	public Usuario(String nombre, String apellido, String numeroIdentificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroIdentificacion = numeroIdentificacion;
		this.librosPrestados = new ArrayList<>();
	}
	
	// Getters y setters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	
	public List<Libro> getLibrosPrestados() {
		return librosPrestados;
	}

	// Metodos para solicitar y devolver libros
	
	public void solicitarLibro(Biblioteca biblioteca, Libro libro) {
		librosPrestados.add(libro);
	}
	
	public void devolverLibro(Biblioteca biblioteca, Libro libro) {
		librosPrestados.remove(libro);
	}
	
	// Metodo para validar que el usuario no tenga mas de 3 libros prestados al mismo tiempo
	
	public boolean prestamoLibro(Biblioteca biblioteca, Libro libro) {
		if (librosPrestados.size() < 3) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
}