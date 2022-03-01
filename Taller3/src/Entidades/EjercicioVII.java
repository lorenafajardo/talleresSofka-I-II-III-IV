
//8.	La escuela automovil�stica "El Maestro" requiere una aplicaci�n que permita registrar 
// a sus clientes en los cursos de ense�anza automovil�stica y establecer quienes lo han 
// aprobado para continuar con el tr�mite de adquirir la licencia de conducci�n. Para cada 
// usuario se debe permitir registrar su ingreso al curso, consultar usuarios que hayan 
// presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). 
// Recuerde que el sistema debe terminar cuando el usuario as� lo indique. 
// Tenga presente que la escuela tiene capacidad m�xima de gestionar 8 usuarios en su totalidad.

package Entidades;

public class EjercicioVII {
	
	private String nombre;
	private String telefono;
	private String resultadoPrueba;
	
	public String getNombre() {
		return nombre;
	}
	public EjercicioVII(String nombre, String telefono, String resultadoPrueba) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.resultadoPrueba = resultadoPrueba;
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
	public String getResultadoPrueba() {
		return resultadoPrueba;
	}
	public void setResultadoPrueba(String resultadoPrueba) {
		this.resultadoPrueba = resultadoPrueba;
	}
	
	

}
