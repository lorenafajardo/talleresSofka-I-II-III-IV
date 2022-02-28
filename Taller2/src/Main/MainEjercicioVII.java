package Main;

import java.util.Scanner;

import Entidades.EjercicioVII;

public class MainEjercicioVII {

	public static void main(String[] args) {
		
		EjercicioVII ejecutar = new EjercicioVII();
		
		ejecutar.datos();
		
		double imc = ejecutar.getPeso() /Math.pow(ejecutar.getEstatura(),2);
		
		if(imc <= 18.5){
			System.out.println("El valor correspondiennte a su IMC es " + imc + " y se ecuentra en el rango de bajo peso");
		}
		if(18.5 < imc && imc <= 24.9){
			System.out.println("El valor correspondiennte a su IMC es " + imc + " y se ecuentra en el rango de peso normal");
		}
		if(25 <= imc && imc <= 29.9){
			System.out.println("El valor correspondiennte a su IMC es " + imc + " y se ecuentra en el rango de sobrepeso");
		}
		if(30 <= imc){
			System.out.println("El valor correspondiennte a su IMC es " + imc + " y se ecuentra en el rango de bajo obeso");
		}
	}

}
