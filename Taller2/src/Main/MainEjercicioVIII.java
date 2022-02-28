package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import Entidades.EjercicioVIII;

public class MainEjercicioVIII {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EjercicioVIII p = new EjercicioVIII();
		
		int opcion = 0;
		
		do{
		System.out.println();
		System.out.println("                ----------- Bienvenido ------------");
		System.out.println("Por favor, seleccione la opción a realizar") ;
		System.out.println(" 1. Registrar pedido ");
		System.out.println(" 2. Tortas disponibles ");
		System.out.println(" 3. Registro de ventas diarias ");
		System.out.println(" 4. Salir ");
		
		 opcion =input.nextInt();
		
		if (opcion==1){
			System.out.println("Elija las caracteisticas del pedido");
			System.out.println("Sabor: ");
			p.setSabor(input.nextLine());
			System.out.println("Decoración: ");
			p.setDecoracion(input.nextLine());
			System.out.println("Cantidad (porciones) : ");
			p.setCantidad(input.nextInt());
			System.out.println("Valor a pagar: ");
			p.setValorPagar(input.nextInt());
			
		System.out.println("Pedido registrado con exito");
		}
		
		if (opcion ==2){
			System.out.println("    Tortas disponibles");
			String[] tortas = {"1.Tres leches", "  2.chocolate", "  3.cafe", "  4.vaiilla", "  5.Arequipe"}; 
			System.out.println(Arrays.toString(tortas));
		}
		
		if(opcion==3){
			System.out.println("Registrar venta 1. si/ 2. no");
			int venta = input.nextInt();
			int ventas=0;
			while (venta == 1) {
				ventas = ventas +1;
				System.out.println("venta registada");
				break;
			} 
				
		} 
		
		}while (opcion !=4);
		
		System.out.println("   Vuelva pronto");
		}
	}

