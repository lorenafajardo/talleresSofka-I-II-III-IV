
//8.	La escuela automovilística "El Maestro" requiere una aplicación que permita registrar 
// a sus clientes en los cursos de enseñanza automovilística y establecer quienes lo han 
// aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada 
// usuario se debe permitir registrar su ingreso al curso, consultar usuarios que hayan 
// presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). 
// Recuerde que el sistema debe terminar cuando el usuario así lo indique. 
// Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.

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
