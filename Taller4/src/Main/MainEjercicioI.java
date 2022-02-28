package Main;

import java.util.Scanner;

public class MainEjercicioI {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int vector[];
		vector = new int[5];
		
		System.out.println("Por favor, esciba 5 números");
		System.out.println();
		
		for (int i = 0; i <=4; i++) {
			System.out.println("Número "+(i+1));
			int numero = input.nextInt();
			vector[i]= numero;
		} 

		for (int i = 0; i <=4; i++) {
			System.out.println("[ "+ i + " ] = "+ vector[i] );
		}
		
	}

}
