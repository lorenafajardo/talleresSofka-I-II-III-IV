
// 7. La Secretar�a de Salud Municipal requiere de una aplicaci�n que le permita calcular el IMC (�ndice de masa corporal) 
// y requiere los datos peso en kilogramos y estatura en metros para cada persona encuestada. Adicional a los datos suministrados, 
// debe mostrar el resultado para cada uno y establecer en qu� rango se encuentra (bajo peso, normal, sobrepeso y obeso).


package Entidades;

import java.util.Scanner;

public class EjercicioVII {

	private double estatura;
	private double peso;
	
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void datos(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("   Secretar�a de Salud Municipal ");
		System.out.println("Diligecie la siguiente informaci�n");
		System.out.println("Estatura: ");
		double e= input.nextDouble();
		setEstatura(e);
		System.out.println("Peso: ");
		double p = input.nextDouble();
		setPeso(p);	
	}
	
	
}
