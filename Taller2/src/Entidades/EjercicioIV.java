package Entidades;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioIV {
	
	public void alquiler(){
		
		String[] peliculas ={"1.venon", "2.Spiderman", "3.It", "4.Saw" };
		Scanner input = new Scanner(System.in);
		
	
		System.out.println();
		System.out.println("    Bienvenido a La video Tienda ");
		System.out.println("Seleccione la opcion a realizar: ");
		System.out.println("1. Alquilar pelicula ");
		System.out.println("2. Consultar pelicula ");
		System.out.println("3. Recepción pelicula ");
		
		int opcion=input.nextInt();
		
		if (opcion == 1){
			System.out.println("Peliculas disponibles");
			System.out.println(Arrays.toString(peliculas));
			System.out.println("Escriba el número de pelicula a alquiler");
			int opcionPelicula = input.nextInt();
			System.out.println("La pelicula " + peliculas[opcionPelicula-1] + ", fue alquilada con exito");
			peliculas[opcionPelicula-1] = "";
		}
		
		if (opcion == 2){
			
			System.out.println("  Peliculas Disponibles ");
			System.out.println();
			System.out.println(Arrays.toString(peliculas));
			
		}

		if (opcion == 3){
			
			System.out.println("Quiere recibir la pelicula en la tienda (1.si/2.no)");
			int respuesta = input.nextInt();
			
			if (respuesta == 1){
				System.out.println();
				System.out.println("Realice las anotaciones o novedades pertinentes");
			}else {
				System.out.println("La pelicula llegara a su casa");
			}
				
		}
		}
	
	}	


