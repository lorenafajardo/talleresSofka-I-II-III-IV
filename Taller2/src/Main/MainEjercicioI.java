package Main;

import Entidades.EjercicioI;

public class MainEjercicioI {
	

	public static void main(String[] args) {
		EjercicioI ejecutar = new EjercicioI();
		
		if (ejecutar.capturaEdad()>=18){
			System.out.println(" Usted es mayor de edad ");
		}else{
			System.out.println(" Usted es menor de edad ");
		}

	}

}
