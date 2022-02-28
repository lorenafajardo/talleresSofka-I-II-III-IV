package Main;

import java.util.Scanner;

public class MainEjercicioIV {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("          Tabla de Multiplicar ");
		System.out.println();
		System.out.println("Por favor, esciba el numero de la tabla que quiere ver");

		int nro = input.nextInt(); 
		
		for (int i = 0; i <= 10; i++) {
			int producto = nro*i;
			System.out.println(nro + " x " + i+ " = " + producto);
			
		}
	}

}
