package Main;

import java.util.Scanner;

import Entidades.EjercicioIX;

public class MainEjercicioIX {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EjercicioIX m = new EjercicioIX();
		
		
		
		System.out.println("    --------- Calculadora de Areas -------------");
		System.out.println(" Por favor, seleccione la figura geometrica a calcular el area");
		System.out.println( " 1. Rectangulo");
		System.out.println( " 2. Triangulo");
		System.out.println( " 3. Trapecio");
		
		int opcion = input.nextInt(); input.nextLine();
		
		if(opcion==1){
			System.out.println(" Escriba las medidas: ");
			System.out.println(" Largo (cm) ");
			m.setLargo(input.nextDouble());
			System.out.println (" Ancho (cm)");
			m.setAncho(input.nextDouble());
			
			double area = m.getLargo() * m.getAncho();
			
			System.out.println("El area del rectangulo es "+ area + "cm"); 
		}
		
		if(opcion==2){
			System.out.println(" Escriba las medidas: ");
			System.out.println(" Base (cm) ");
			m.setBase(input.nextDouble());
			System.out.println (" Altura (cm)");
			m.setAltura(input.nextDouble());
			
			double area = (m.getBase() * m.getAltura())/2;
			
			System.out.println("El area del triangulo es "+ area + "cm"); 
		}
		
		if(opcion==3){
			System.out.println(" Escriba las medidas: ");
			System.out.println(" Base mayor (cm) ");
			m.setBaseMayor(input.nextDouble());
			System.out.println(" Base menor (cm) ");
			m.setBaseMenor(input.nextDouble());
			System.out.println (" Altura (cm)");
			m.setAltura(input.nextDouble());
			
			double area = ((m.getBaseMayor()+ m.getBaseMenor()) * m.getAltura())/2;
			
			System.out.println("El area del trapecio es "+ area + "cm"); 
		}

	}

}
