package UCU.uy;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		 
		// Crear una Biblioteca
		Biblioteca biblioteca = new Biblioteca();
		
		// Crear libros
		Libro libro1 = new Libro("Habitos Atomicos", "James Clear", 2018);
		Libro libro2 = new Libro("Sapiens: De animales a dioses", "Yuval Noah Harani", 2011);
		Libro libro3 = new Libro("El sutil arte de que (casi todo) te importe una mierda", "Mark Manson", 2016);
		
		// Agregar libros a la biblioteca
		biblioteca.prestarLibro(libro1);
		biblioteca.prestarLibro(libro2);
		biblioteca.prestarLibro(libro3);
		
		// Crear usuario
		Usuario usuario1 = new Usuario ("Facundo", "Banchero", "55660146");
		Usuario usuario2 = new Usuario ("Juan Martin", "Rico", "56282632");
		
		// Intentar solicitar un libro
		if (biblioteca.validacionDisponibilidad("Habitos Atomicos")) {
			usuario1.solicitarLibro(biblioteca, libro1);
		}
		
		// Intentar prestar un libro que no esta disponible
		if(!biblioteca.validacionDisponibilidad("Sapiens: De animales a dioses")) {
			System.out.println("El libro 'Sapiens: De animales a dioses' no esta disponible para prestamo.");
		}
		
		// Devolver un libro
		usuario1.devolverLibro(biblioteca, libro1);
		biblioteca.devolverLibro(libro1);
		System.out.println("El libro 'Habitos Atomicos' ha sido devuleto a la biblioteca.");
		
		// Validar prestamo de usuario con mas de 3 libros
		usuario1.solicitarLibro(biblioteca, libro1);
		usuario1.solicitarLibro(biblioteca, libro2);
		usuario1.solicitarLibro(biblioteca, libro3);
		
		if(!usuario1.prestamoLibro(biblioteca, new Libro("Nuevo Libro", "Autor", 2025))) {
			System.out.println("El usuario no puede solicitar mas libros.");
		}
		
		// Crear un prestamo
		Date fechaPrestamo = new Date();
		Date fechaDevolucion = new Date(fechaPrestamo.getTime() + (7L * 24 * 60 * 60 * 1000)); // 7 dias despues
		Prestamo prestamo1 = new Prestamo(usuario1, libro1, fechaPrestamo, fechaDevolucion);
		
		System.out.println("Prestamo realizado: " + prestamo1.getLibro().getTitulo() + " por " + prestamo1.getUsuario().getNombre());
	}

}
