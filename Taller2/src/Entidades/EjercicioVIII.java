
// 8. El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que le permita 
// registrar los pedidos de los clientes en cuanto a las tortas que realiza. Cada torta tiene unas características 
// propias como sabor, cantidad (porciones) y decoraciones). Se requiere que la aplicación permita registrar los pedidos, 
// las tortas disponibles y las ventas que se registren diariamente.


package Entidades;

import java.util.ArrayList;

public class EjercicioVIII {

	private String sabor;
	private int cantidad;
	private String decoracion;
	private int valorPagar;
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getDecoracion() {
		return decoracion;
	}
	public void setDecoracion(String decoracion) {
		this.decoracion = decoracion;
	}
	public int getValorPagar() {
		return valorPagar;
	}
	public void setValorPagar(int valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	
	
	
}
