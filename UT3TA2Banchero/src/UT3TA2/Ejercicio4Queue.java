package UT3TA2;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4Queue {

	public static void main(String[] args) {
		Ejercicio4Queue ejercicio = new Ejercicio4Queue();
        ejercicio.sistemasTurnos();
	}

	public void sistemasTurnos() {
		Queue<String> colaPacientes = new LinkedList<>();
		
		System.out.println("Registrando llegada de pacientes:");
		
		// Paciente 1
		boolean registrado = colaPacientes.offer("Paciente 1: Facundo Banchero - Consulta General");
		if (registrado) {
			System.out.println("Registrado: Paciente 1: Facundo Banchero - Consulta General");
		} else {
			System.out.println("No se pudo registrar: Paciente 1: Facundo Banchero - Consulta General");
		}
		
		// Paciente 2
		registrado = colaPacientes.offer("Paciente 2: Gaston Puyares - Traumatologia");
		if (registrado) {
			System.out.println("Registrado: Paciente 2: Gaston Puyares - Traumatologia");
		} else {
			System.out.println("No se pudo registrar: Paciente 2: Gaston Puyares - Traumatologia");
		}
		
		// Paciente 3
        registrado = colaPacientes.offer("Paciente 3: Carmen Ruiz - Oftalmologia");
        if (registrado) {
            System.out.println("Registrado: Paciente 3: Carmen Ruiz - Oftalmologia");
        } else {
            System.out.println("No se pudo registrar: Paciente 3: Carmen Ruiz - Oftalmologia");
        }
        
        // Paciente 4
        registrado = colaPacientes.offer("Paciente 4: Mario Lopez - Dermatologia");
        if (registrado) {
            System.out.println("Registrado: Paciente 4: Mario Lopez - Dermatologia");
        } else {
            System.out.println("No se pudo registrar: Paciente 4: Mario Lopez - Dermatologia");
        }
        
        // Paciente 5
        registrado = colaPacientes.offer("Paciente 5: Elena Sanchez - Consulta General");
        if (registrado) {
            System.out.println("Registrado: Paciente 5: Elena Sanchez - Consulta General");
        } else {
            System.out.println("No se pudo registrar: Paciente 5: Elena Sanchez - Consulta General");
        }
        
        // Mostrar estado de la cola de espera
        System.out.println("Total de pacientes en espera: " + colaPacientes.size());
        System.out.println("Proximo paciente a ser atendido: " + colaPacientes.peek());
        
        // Atender pacientes
        System.out.println("Atendiendo pacientes:");
        while (!colaPacientes.isEmpty()) {
        	String paciente = colaPacientes.poll();
        	System.out.println("Atendiendo a: " + paciente);
        }
        
        // Verificar estado final
        System.out.println("Fin de la atencion del dia");
        System.out.println("Pacientes en espera: " + colaPacientes.size());
        
        
	}
}
