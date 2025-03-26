package UCU.uy;

import java.util.Date;

public class Prestamo {
	
	// Atributos

	private Usuario usuario;
	private Libro libro;
	private Date fechaPrestamo;
	private Date fechaDevolucionEsperada;
	
	// Constructor
	
	public Prestamo(Usuario usuario, Libro libro, Date fechaPrestamo, Date fechaDevolucionEsperada) {
		this.usuario = usuario;
		this.libro = libro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucionEsperada = fechaDevolucionEsperada;
	}
	
	// Getters y Setters
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Libro getLibro() {
		return libro;
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	
	public Date getFechaDevolucionEsperada() {
		return fechaDevolucionEsperada;
	}
	
	public void setFechaPrestamo(Date fecha) {
		this.fechaDevolucionEsperada = fecha;
	}
	
	public void setFechaDevolucionEsperada(Date fecha) {
		this.fechaDevolucionEsperada = fecha;
	}
}
