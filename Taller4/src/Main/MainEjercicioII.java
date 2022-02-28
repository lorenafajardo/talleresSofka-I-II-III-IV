
// 2. Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100; 
// después de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse
// e imprimir los números pares e impares

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
		
		System.out.println("    Números Pares");
		for (int j = 0; j <= 19; j++) {
			if (arreglo[j]%2==0){
				System.out.print(arreglo[j]+" - ");
			}
			
		}
		
		System.out.println();
		System.out.println("    Números Impares");
		for (int j = 0; j <= 19; j++) {
			if ((arreglo[j]+1)%2 == 0){
				System.out.print(arreglo[j]+" - ");
			}
		}
	}
}
