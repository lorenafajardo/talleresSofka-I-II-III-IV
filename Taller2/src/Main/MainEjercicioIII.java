package Main;

import Entidades.EjercicioIII;

public class MainEjercicioIII {

	public static void main(String[] args) {
		
		EjercicioIII datos = new EjercicioIII();
		
		datos.capturaDatos();
		
		if (datos.getEdad()>=18){
			System.out.println(datos.getNombre()+ " "+ datos.getApellido()+ " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
		}else{
			System.out.println(datos.getNombre()+ " "+ datos.getApellido()+ " usted es menor de edad, por lo tanto no puede entrar a la fiesta");
		}

	}

}
