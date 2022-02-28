


package Entidades;

import java.util.Scanner;

public class EjercicioII {

		private int edad;
		private Scanner input;
		
		public int capturaEdad(){
		input = new Scanner(System.in);
		System.out.println("Por favor, escriba su edad: ");
		edad = input.nextInt();
		return edad;
		}		
	}

