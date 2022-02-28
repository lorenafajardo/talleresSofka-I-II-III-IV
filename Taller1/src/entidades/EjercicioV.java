
//Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo. 
//Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje:
//[Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a)


package entidades;

import java.util.Scanner;

public class EjercicioV {

	private String nombreMascota;
	private int edad;
	private String tipoMascota;
	private String propietario;
	private Scanner input;
	
	public void CapturaDatos(){
		System.out.println("Por favor diligencie la siguiente información: ");
		input = new Scanner(System.in);
		System.out.println("Nombre de la mascota: ");
		nombreMascota = input.nextLine();
		System.out.println("tipo de mascota: ");
		tipoMascota = input.nextLine();
		System.out.println("Nombre del propietario: ");
		propietario = input.nextLine();
		System.out.println("Edad de la mascota: ");
		edad = input.nextInt();
		System.out.println( nombreMascota + " es un(a) " + tipoMascota + " el cual, tiene " + edad + " años de edad, y " + propietario + " es actualmente su dueño(a)");
	}
}
