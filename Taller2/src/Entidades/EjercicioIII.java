package Entidades;

import java.util.Scanner;

public class EjercicioIII {
	
	private String nombre;
	private String apellido;
	private int edad;
	private Scanner input;
	
	
	public EjercicioIII() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public void capturaDatos(){
	input = new Scanner(System.in);
	System.out.println("Por favor, diligencie la siguiente información ");
	System.out.println("Nombre: ");
	setNombre(input.nextLine());
	System.out.println("Apellido: ");
	setApellido(input.nextLine());
	System.out.println("Edad: ");
	setEdad(input.nextInt());
	}
}
