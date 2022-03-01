
// 7.	El parqueadero "El guardi�n" presta sus servicios de parqueadero nocturno para los 
// usuarios del barrio y requiere una aplicaci�n que permita registrar los veh�culos que se 
// cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del 
// veh�culo como son, placa y marca, y los datos del cliente como son nombre completo y n�mero 
// de tel�fono. Para cada veh�culo se debe permitir la opci�n de ingresar al parqueadero, 
// retirar del parqueadero y consultar si un veh�culo se encuentra en el parqueadero. 
// Recuerde que el sistema debe terminar cuando el usuario as� lo indique. 
// Tenga en presente que el parqueadero solo puede almacenar m�ximo 5 veh�culos.

package Entidades;

public class EjercicioVII {

	private String placa;
	private String marca;
	private String nombre;
	private String telefono;
	
	
	
	public EjercicioVII(String placa, String marca, String nombre, String telefono) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
