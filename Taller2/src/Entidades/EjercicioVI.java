
// 6. El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones 
// y requiere una aplicación que le permita registrar los servicios generados a sus clientes. 
// Para cada motocicleta se debe tener registro del ingreso al taller y las observaciones por parte del cliente. 
// También debe existir registro de salida del taller con las novedades y otra de arreglos hechos por el mecánico
// en caso de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.


package Entidades;

import java.util.Scanner;

public class EjercicioVI {
	
	private String placa;
	private String fecha;
	private String observaciones;
	private String novedades;
	private String arreglos;
	
	
	
	public EjercicioVI(String placa, String fecha, String observaciones) {
		super();
		this.placa = placa;
		this.fecha = fecha;
		this.observaciones = observaciones;
	}



	public EjercicioVI(String placa, String fecha, String novedades, String arreglos) {
		super();
		this.placa = placa;
		this.fecha = fecha;
		this.novedades = novedades;
		this.arreglos = arreglos;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public String getNovedades() {
		return novedades;
	}



	public void setNovedades(String novedades) {
		this.novedades = novedades;
	}



	public String getArreglos() {
		return arreglos;
	}



	public void setArreglos(String arreglos) {
		this.arreglos = arreglos;
	}
	
	

}
