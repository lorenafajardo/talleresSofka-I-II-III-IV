
//Realizar un programa el cual solicite el nombre de una ciudad capital y el país. 
//Al finalizar debe imprimir en pantalla el siguiente mensaje "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]

package entidades;

import java.util.Scanner;

public class EjercicioIV {
	
	private String pais;
	private String capital;
	private Scanner input;
	
	public void CapturaDatos(){
		System.out.println("Por favor diligencie la siguiente información: ");
		input = new Scanner(System.in);
		System.out.println("Pais: ");
		pais = input.nextLine();
		System.out.println("Ciudad capital: ");
		capital = input.nextLine();
		
		System.out.println("La ciudad " + capital + " es la capital del país " +pais);

}
}