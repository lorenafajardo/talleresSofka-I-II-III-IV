package Main;

import Entidades.EjercicioV;

public class MainEjercicioV {

	public static void main(String[] args) {
	
		EjercicioV multiplicar = new EjercicioV();
		
		System.out.println("              Tabla de muliplicar");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + " x "+ i +"   ");
			}
			System.out.println();
		} 
		
		multiplicar.multiplicacion();
	
	}
}
