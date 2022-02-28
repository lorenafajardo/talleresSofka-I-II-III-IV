
// 3. Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. 
//Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].

package entidades;

import java.util.Scanner;

public class EjercicioIII {

	private String nombre;
	private String apellidos;
	private String nombreMama;
	private String apellidosMama;
	private String nombrePapa;
	private String apellidosPapa;
	private Scanner input;
	
	public void CapturaDatos(){
	System.out.println("Por favor diligencie la siguiente información: ");
	input = new Scanner(System.in);
	System.out.println("Nombre: ");
	nombre = input.nextLine();
	System.out.println("Apellidos: ");
	apellidos = input.nextLine();
	System.out.println("Nombre de su mamá: ");
	nombreMama = input.nextLine();
	System.out.println("Apellidos de su mamá: ");
	apellidosMama = input.nextLine();
	System.out.println("Nombre de su papá: ");
	nombrePapa = input.nextLine();
	System.out.println("Apellidos de su papá: ");
	apellidosPapa = input.nextLine();
	
	System.out.println("Yo "+ nombre+" "+ apellidos + ", soy hijo de " + nombreMama + " "+ apellidosMama + " y "+ nombrePapa+ " " +apellidosPapa);
	
	}
}
