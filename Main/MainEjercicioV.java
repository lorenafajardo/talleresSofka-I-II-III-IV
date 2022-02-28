package Main;

import java.util.Scanner;

public class MainEjercicioV {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int opcion = 0;
		
		do{
			System.out.println();
			System.out.println("                  Menu de usuario"   );
			System.out.println();
			System.out.println("1. Captura nombre");
			System.out.println("2. Saludar persona");
			System.out.println("3. Salir del sistema ");
			System.out.println();
			
			opcion = input.nextInt();input.nextLine();
			
			if (opcion==1){
				System.out.println(" Por favor, escriba su nombre: ");
			}
			String nombre = input.nextLine();
			
			if (opcion==2){
				System.out.println("Cordial saludo " + nombre+ ", bienvenido al sistema");
			}
			
		}while(opcion!=3);
		
		if (opcion == 3){
		System.out.println("       Vuelva pronto");
		}
	}

}
