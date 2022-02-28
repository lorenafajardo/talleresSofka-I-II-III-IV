package Main;

import Entidades.EjercicioII;

public class MainEjercicioII {

	public static void main(String[] args) {
EjercicioII ejecutar = new EjercicioII();
		
		if (ejecutar.capturaEdad()<=18){
			System.out.println("Usted aun es un niño(a)");
		}else{
			System.out.println("Usted ya no pertenece a la categoria niño ");
		}


	}

}
