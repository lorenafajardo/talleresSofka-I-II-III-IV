package Main;

import java.util.Scanner;

import Entidades.EjercicioVII;

public class MainEjercicioVII {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in); 
		int opcion = 0;
		EjercicioVII vehiculos[];
		
		vehiculos = new EjercicioVII[5];
		
		do{
			System.out.println();
			System.out.println("                     Bienvenido al parqueadero El Guardian   ");
			System.out.println("  Por favor, seleccione una opción: ");
			System.out.println(" 1. Ingresar vehiculo");
			System.out.println(" 2. Retirar vehiculo");
			System.out.println(" 3. Consultar vehiculo");
			System.out.println(" 4. Salir");
			
			opcion = input.nextInt();input.nextLine();
			
			
			if (opcion==1){
				
				for (int i = 0; i <=4; i++) {	
					
					System.out.println("     Ingresar Vehiculo ");
					System.out.println("Placa: ");
					String placa = input.nextLine();
					System.out.println("Marca: ");
					String marca =input.nextLine();
					System.out.println("Nombre del propietario: ");
					String nombre = input.nextLine();
					System.out.println("Telefono: ");
					String telefono = input.nextLine();
					
					
					EjercicioVII v = new EjercicioVII(placa, marca, nombre, telefono);
					vehiculos[i]=v;
				}
			}
			
			
			if (opcion == 2){
				System.out.println("        Retirar vehiculo    ");
				System.out.println(" Escriba la placa del vehiculo a retirar: ");
				String placaRetirar = input.nextLine();
			
				for(int i = 0; i <= vehiculos.length; i++){
		            if(vehiculos[i].getPlaca().equals(placaRetirar)){
		            	System.out.println("Informacion del vehiculo a retirar");
		                System.out.println(" Placa: "+vehiculos[i].getPlaca());
		                System.out.println(" Marca: "+vehiculos[i].getMarca());   
			            System.out.println(" Nombre: "+vehiculos[i].getNombre());
			            System.out.println(" Telefono: "+vehiculos[i].getTelefono());
			                  
			            vehiculos[i].setPlaca("");
			            vehiculos[i].setMarca("");
			            vehiculos[i].setNombre("");
			            vehiculos[i].setTelefono("");
			            
			            System.out.println(" El vehiculo fue retirado del parqueadero");
			            break;
		        }
				}
			}
	
			if (opcion == 3){
				System.out.println("        Buscar vehiculo    ");
				System.out.println(" Escriba la placa del vehiculo ");
				String placaBuscar = input.nextLine();
				
				for(int i = 0; i <= vehiculos.length; i++){
					
		            if(vehiculos[i].getPlaca().equals(placaBuscar)){
			            	System.out.println("El vehiculo se encuetra en el parqueadero, sus datos a continuacion");
			            	System.out.println(" Placa:  "+vehiculos[i].getPlaca()); 	
			            	System.out.println(" Marca:  "+vehiculos[i].getMarca());
			            	System.out.println(" Nombre del propietario:  "+vehiculos[i].getNombre());
				            System.out.println(" Telefono de cotacto:  "+vehiculos[i].getTelefono());
				            break;
		            }
		         
		        }
								
			}
		}while(opcion!=4);
		
		if (opcion==4){
			System.out.println(" Hasta Luego");
		}
		

	}

}
