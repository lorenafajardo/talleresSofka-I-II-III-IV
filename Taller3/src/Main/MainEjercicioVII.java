package Main;

import java.util.Scanner;

import Entidades.EjercicioVII;

public class MainEjercicioVII {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in); 
		int opcion = 0;
		EjercicioVII datos[];
		
		datos = new EjercicioVII[8];
		
		do{
			System.out.println();
			System.out.println("                     Bienvenido   ");
			System.out.println("  Por favor, seleccione una opción: ");
			System.out.println(" 1. Registrar  usuario");
			System.out.println(" 2. Consultar usuarios");
			System.out.println(" 3. Resultados de pruebas");
			System.out.println(" 4. Salir del sistema");
			
			opcion = input.nextInt();input.nextLine();
			
			switch (opcion) {
			case 1:
				
				for (int i = 0; i <=7; i++) {	
					
					System.out.println("     Almacenar contacto  ");
					System.out.println("Nombre: ");
					String nombre = input.nextLine();
					System.out.println("telefono: ");
					String telefono =input.nextLine();
					System.out.println("Aprobo la prueba (si/no) : ");
					String resultadoPrueba = input.nextLine();
					
					
					EjercicioVII	p = new EjercicioVII(nombre, telefono, resultadoPrueba);
					datos[i]=p;
				}
				
				break;
				
			case 2:
				System.out.println("        Buscar Contacto    ");
				System.out.println(" Escriba el nombre del usuario a buscar: ");
				String nombreBuscar = input.nextLine();
				
				for(int i = 0; i <= datos.length; i++){
		            if(datos[i].getNombre().equals(nombreBuscar)){
		            System.out.println("El usuario consultado se encuentra inscrito en el curso con los siguientes datos");
		            System.out.println("   Nombre: "+ datos[i].getNombre()+ "     Telefono: "+datos[i].getTelefono());
		            
		            break;
		            }else{
		            	System.out.println("El usuario no se encuentra registrado");
		            	 break;
		            }
		        }
				 
				break;
				
			case 3:
				System.out.println("        Resultados    ");
				System.out.println(" Escriba el nombre del usuario ");
				String nombreConsultar = input.nextLine();
				
				for(int i = 0; i <= datos.length; i++){
		            if(datos[i].getNombre().equals(nombreConsultar)){
		            	System.out.println("El usuario " + datos[i].getResultadoPrueba()+" aprobo el curso");
		            	break;
		            }
				}
				break;
			default: 
				break;
			}
			
		}while(opcion!=4);

	}

}
