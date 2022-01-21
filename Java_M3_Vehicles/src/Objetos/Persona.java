package Objetos;

/**
 * @author Adrián Rodriguez
 */

abstract public class Persona {
	
	//Atributos
	
	protected String nombre;
	protected String apellidos;
	protected String fecha_nacimiento;
	protected String licencia;
	
	//Constructor
	
	public Persona(String nombre, String apellidos, String fecha_nacimiento, String licencia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.licencia = licencia;
	}

	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	//Método toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", licencia=" + licencia + "]";
	}
}
