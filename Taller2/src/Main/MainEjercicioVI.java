package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Entidades.EjercicioVI;

public class MainEjercicioVI {

	public static void main(String[] args) {
			
			ArrayList<EjercicioVI> lista = new ArrayList<EjercicioVI>();
			Scanner input = new Scanner(System.in);
			
			int opcion =0;
			
			do{
				System.out.println();
			System.out.println("     Taller El Maquinista");
			System.out.println("Por favor, ingrese la opción a realizar:");
			System.out.println("1.Ingreso de motocicleta");
			System.out.println("2.Salida de motocicleta");
			System.out.println("3.Salir");
			
			 opcion = input.nextInt(); input.nextLine();
			
			if (opcion == 1){
				
				System.out.println("Placa de la motocicleta: ");
				String placa = input.nextLine();
				System.out.println("Dia de ingreso: "); 
				String fechaIngreso = input.nextLine();
				System.out.println( "Observaciones realizadas: ");
				String observaciones = input.nextLine();
				System.out.println(" Registro Exitoso");

				EjercicioVI a = new EjercicioVI(placa, fechaIngreso, observaciones);
				
				lista.add(a);
				
			}

				if (opcion == 2){
					
					System.out.println("Placa de la motocicleta: ");
					String placa2 = input.nextLine();
					System.out.println("Dia de salida: "); 
					String fechaSalida = input.nextLine();
					System.out.println( "Novedades: ");
					String novedades = input.nextLine();
					System.out.println( "arreglos realizados: ");
					String arreglos = input.nextLine();
					

					EjercicioVI b = new EjercicioVI(placa2, fechaSalida, novedades, arreglos);
					
					
				}
			}while (opcion!=3); 
			
	}

	}


