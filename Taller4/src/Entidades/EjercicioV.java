package Entidades;

import java.util.Scanner;

public class EjercicioV {
	
	private int numFila;
	private int numColumna;
	

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumColumna() {
		return numColumna;
	}

	public void setNumColumna(int numColumna) {
		this.numColumna = numColumna;
	}

	
	Scanner input= new Scanner(System.in);
	public void multiplicacion(){
		System.out.println();
		System.out.println("Para conocer el resultado por favor digite el numero del multiplicando ( Primer factor) y despues el multiplicador (Segundo factor) ");
		System.out.println("Multiplicando: ");
		setNumColumna(input.nextInt());
		System.out.println("Multiplicador: ");	
		setNumFila(input.nextInt());
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int producto = j*i;
				if((i==getNumFila()) && (j==getNumColumna())){
					System.out.println("El resultado de la multiplicación "+ getNumColumna()+ " x "+ getNumFila()+ " = "+ producto);
				}
				
			}
		} 
		
		
		
		
	}
	
}
