
// 7.	El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los 
// usuarios del barrio y requiere una aplicación que permita registrar los vehículos que se 
// cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del 
// vehículo como son, placa y marca, y los datos del cliente como son nombre completo y número 
// de teléfono. Para cada vehículo se debe permitir la opción de ingresar al parqueadero, 
// retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. 
// Recuerde que el sistema debe terminar cuando el usuario así lo indique. 
// Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.

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
