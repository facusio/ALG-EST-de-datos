package UCU.uy;

public class Libro {
	
	// Atributos 
	
	private String titulo;
	private String autor;
	private int añoPublicacion;
	private boolean disponibilidad;
	
	// Constructor
	
	public Libro (String titulo, String autor, int añoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.disponibilidad = true;
	}
	
	// Getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	
	public boolean isDisponible() {
		return disponibilidad;
	}
	
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
