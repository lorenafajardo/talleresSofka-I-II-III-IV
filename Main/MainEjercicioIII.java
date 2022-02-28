package Main;

import java.util.Iterator;

public class MainEjercicioIII {

	public static void main(String[] args) {
		
int variablei=1;
		
		while (variablei<=11) {
			
			int espacios=1;
			int asteriscos =1;
			
			while (espacios <= 13-variablei){
				System.out.print(" ");
				espacios = espacios+1;
			}
			
			while(asteriscos < variablei+ variablei){
				System.out.print("*");
				asteriscos = asteriscos +1;
			}
			System.out.println();
			variablei = variablei +1;
		}
		
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 12; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	for (int i = 1; i < 3; i++) {
		for (int j = 1; j < 12-i; j++) {
			System.out.print(" ");			
		}
		
		for (int j = 1; j < 4+(2*i); j++) {
			System.out.print("*");		
		}
		System.out.println();
	}	
	}

}
