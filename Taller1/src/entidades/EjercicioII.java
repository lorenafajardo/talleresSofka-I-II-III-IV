
// 2. Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.

package entidades;

import java.util.Scanner;

public class EjercicioII {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int estatura;
	private Scanner input;
	
	
	
	public void CapturaDatos(){
		System.out.println("Por favor diligencie la siguiente información: ");
		input = new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre = input.nextLine();
		System.out.println("Apellidos: ");
		apellidos = input.nextLine();
		System.out.println("Edad: ");
		edad = input.nextInt();
		System.out.println("Estatura: ");
		estatura = input.nextInt();
		
		System.out.println( " Usted se ha idenificado como: " + nombre + " "+ apellidos + ", con "+ edad + " años de edad y estatura "+estatura +" metros");
	
}
}