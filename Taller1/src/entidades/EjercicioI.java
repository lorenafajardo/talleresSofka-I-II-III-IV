
//TALLER DE VARIABLES E IMPRESIÓN
// Elaborado por: Lorena Fajardo Díaz

// 1. Realizar un programa el cual solicite su nombre y apellidos.


package entidades;

import java.util.Scanner;

public class EjercicioI {
	private String nombre;
	private String apellidos;
	private Scanner input;
	
	
	
	public void CapturaDatos(){
		System.out.println("Por favor diligencie la siguiente información: ");
		input = new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre = input.nextLine();
		System.out.println("Apellidos: ");
		apellidos = input.nextLine();
		
		System.out.println( " Usted se ha idenificado como: " + nombre + " "+ apellidos);
	}
	
}
