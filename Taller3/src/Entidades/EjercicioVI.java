
// 6. Se está creando una aplicación que va a estar conectada con un prototipo que permita 
// almacenar contactos telefónicos en el dispositivo. Para ello cada contacto debe contener 
// nombre completo, teléfono y organización. Se requiere que la aplicación permita añadir 3 
// contactos verificando que el número no esté almacenado, buscar contactos almacenados y 
// eliminar contactos si el usuario lo requiere. Recuerde que el sistema debe terminar cuando 
// el usuario así lo indique.


package Entidades;

public class EjercicioVI {
	
	private String nombre;
	private String telefono;
	private String organizacion;
	
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
	public String getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}
	public EjercicioVI(String nombre, String telefono, String organizacion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.organizacion = organizacion;
	}

}
