
// 2. Crear un arreglo de n�meros enteros de 20 posiciones, el cual, debe ser llenado con n�meros aleatorios entre 1 y 100; 
// despu�s de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se us� para llenarse
// e imprimir los n�meros pares e impares

package Main;

import java.util.Random;
import java.util.Scanner;

public class MainEjercicioII {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Random numero = new Random();
		int arreglo[];
		arreglo = new int[20];
		
		System.out.println("                     ARREGLO");
		int i = 0;
		while (i<=19) {
			int n = numero.nextInt(100);
			arreglo[i] = n;
			System.out.print(n+ " - ");
			i= i+1;
		}
		
		System.out.println();
		
		System.out.println("    N�meros Pares");
		for (int j = 0; j <= 19; j++) {
			if (arreglo[j]%2==0){
				System.out.print(arreglo[j]+" - ");
			}
			
		}
		
		System.out.println();
		System.out.println("    N�meros Impares");
		for (int j = 0; j <= 19; j++) {
			if ((arreglo[j]+1)%2 == 0){
				System.out.print(arreglo[j]+" - ");
			}
		}
	}
}
