package Main;

import java.util.Scanner;

import Entidades.EjercicioVI;

public class MainEjercicioVI {

	public static void main(String[] args) {

		
		Scanner input= new Scanner(System.in); 
		int opcion = 0;
		EjercicioVI datos[];
		
		datos = new EjercicioVI[3];
		
		do{
			System.out.println();
			System.out.println("                     Bienvenido   ");
			System.out.println("  Por favor, seleccione una opción: ");
			System.out.println(" 1. Almacenar contacto");
			System.out.println(" 2. Buscar contacto");
			System.out.println(" 3. Eliminar contacto");
			System.out.println(" 4. Salir");
			
			opcion = input.nextInt();input.nextLine();
			
			
			if (opcion==1){
				
				for (int i = 0; i <=2; i++) {	
					
					System.out.println("     Almacenar contacto  ");
					System.out.println("Nombre: ");
					String nombre = input.nextLine();
					System.out.println("telefono: ");
					String telefono =input.nextLine();
					System.out.println("organizacion: ");
					String organizacion = input.nextLine();
					
					
					EjercicioVI	p = new EjercicioVI(nombre, telefono, organizacion);
					datos[i]=p;
				}
			}
			
			if (opcion == 2){
				System.out.println("        Buscar Contacto    ");
				System.out.println(" Escriba el nombre del contacto a buscar: ");
				String nombreBuscar = input.nextLine();
				
				for(int i = 0; i <= datos.length-1; i++){
		            if(datos[i].getNombre() == nombreBuscar)
		                System.out.println(datos[i].getNombre());
			            System.out.println(datos[i].getTelefono());
			            System.out.println(datos[i].getOrganizacion());
			            break;
		        }
								
			}
			
			if (opcion == 3){
				System.out.println("        Eliminar Contacto    ");
				System.out.println(" Escriba el nombre del contacto a eliminar: ");
				String nombreEliminar = input.nextLine();
			
				for(int i = 0; i <= datos.length; i++){
		            if(datos[i].getNombre() == nombreEliminar)
		            	System.out.println("Informacion del contacto a eliminar");
		                System.out.println(datos[i].getNombre());
			            System.out.println(datos[i].getTelefono());
			            System.out.println(datos[i].getOrganizacion());         
			   
			            datos[i].setNombre("");
			            datos[i].setTelefono("");
			            datos[i].setOrganizacion("");
			            
			            System.out.println(" Contacto eliminado");
			            break;
		        }
				
			}
			
		}while(opcion!=4);
		
		if (opcion==4){
			System.out.println(" Hasta Luego");
		}
		
}
}
		
	