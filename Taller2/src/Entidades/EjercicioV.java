
//5. La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar 
// los productos que vende a sus clientes y para ello, los productos tienen unas características que deben indicársele 
// al cliente para que pueda escoger el producto a comprar. para cada cliente, se tienen las opciones de compra de producto, 
// consulta de precios por producto y devoluciones en caso de que se presenten.


package Entidades;


import java.util.Scanner;

public class EjercicioV {
	
public void alquiler(){
		
		String[] medicamentos ={"1. Alcohol", "2. Gel atibacterial", "3. Antigripal" };
		Scanner input = new Scanner(System.in);
		
	
		System.out.println();
		System.out.println("   Bienvenido a Drogueria Mi Salud  ");
		System.out.println("Seleccione la opcion a realizar: ");
		System.out.println("1. Comprar producto ");
		System.out.println("2. Consultar precios ");
		System.out.println("3. Devoluciones ");
		
		int opcion=input.nextInt();
		
		if (opcion == 1){
			System.out.println("  Caracteristicas de los medicamentos ");
			
			System.out.println(medicamentos[0] + ": Frasco Con 700 ml    -    Vía de administración: Topico - Externo");
			System.out.println(medicamentos[1] + ": Frasco Con 1000 mL  -   Antiséptico y desinfectante de uso externo.");
			System.out.println(medicamentos[2] + ": Comprimidos para aliviar los síntomas de la gripe que combina paracetamol, cafeína, butetamato y frenilefrina.");
			
			System.out.println("Seleccione el número del medicamento a comprar");
			int opcionMedicamento=input.nextInt();
			System.out.println("Compra Exitosa");
		}
		
		if (opcion == 2){
			
			System.out.println("  Precios ");
			System.out.println(" 1. Alcohol  -   $3.600" );
			System.out.println(" 2. Gel antibacterial -  $8.000");
			System.out.println(" 3. Antigripal  -  $11.000");
		}

		if (opcion == 3){
			
			System.out.println("Proceso de Devolución");
			System.out.println("Por favor, diligencie la siguiente infomacion para realizar la devolución del producto ");
			
			System.out.println("Numero de referecia");
			int referecia =input.nextInt();
			System.out.println();
			System.out.println("Devolución del producto con referecia "+ referecia + " exitosa");
				
		}
		}

}
