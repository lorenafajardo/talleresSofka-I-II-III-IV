
// TALLER DE CONDICIONALES
// Elaborado por: Lorena Fajardo Díaz

// 1. Realizar un programa en el cual se solicite la edad de una persona. 
// si la persona es mayor o igual a 18 años, deberá mostrar en pantalla: Usted es mayor de edad.

package Entidades;

import java.util.Scanner;

public class EjercicioI {
	private int edad;
	private Scanner input;
	
	public int capturaEdad(){
	input = new Scanner(System.in);
	System.out.println("Por favor, escriba su edad: ");
	edad = input.nextInt();
	return edad;
	}	
}
