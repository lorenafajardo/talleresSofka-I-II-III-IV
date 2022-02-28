package Main;

import java.util.Scanner;

import Entidades.EjercicioX;

public class MainEjercicioX {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EjercicioX u = new EjercicioX();
		int opcion = 0;
		int saldo =0;
		
		do{
			System.out.println();
		System.out.println("             ---------- Bienvenido a Su Banco Fiel -----------");
		
		System.out.println("Por favor, selecione la opcion a realizar");
		System.out.println(" 1. Ingreso de dinero");
		System.out.println(" 2. Retiro de dinero");
		System.out.println(" 3. Consulta de saldo");
		System.out.println(" 3. Salir");
		
		 opcion = input.nextInt(); input.nextLine();

		 if (opcion==1){
			 System.out.println( "Diligencie la información");
			 System.out.println("Nombre del titular:");
			u.setUsuario(input.nextLine());
				System.out.println("Cantidad de dinero a ingresar:  ");
				u.setDineroIngreso(input.nextInt());
				
				if (u.getDineroIngreso() > 0){
					saldo = saldo + u.getDineroIngreso();
					System.out.println(" Dinero ingresado correctamente");
					}
				else{
					System.out.println("Cantidad de dinero incorrecta ");
					}
					
	}
		 
		 if (opcion==2){
			 System.out.println( "Digite la cantidad de dineo a retirar");
			 u.setDineroRetiro(input.nextInt());
				
				if (u.getDineroRetiro() <= saldo){
					saldo = saldo - u.getDineroRetiro();
					System.out.println(" Dinero listo para retirar");
					}
				else{
					System.out.println("Saldo insuficiente");
					}
					
		 }
		 
		 

		 if (opcion==3){
			 System.out.println( "Su saldo es $" + saldo);
		 }

		
		}while(opcion!= 4);
	}
}
