package Objetos;

/**
 * @author Adrián Rodriguez
 */

public class Conductor extends Persona {
	
		//Atributos
	
		protected int id;
		protected String tipo_licencia;
		protected String nombre_completo;
		protected String fecha_caducidad;
		
		//Constructores
		
		public Conductor(String nombre, String apellidos, String fecha_nacimiento, String licencia) {
			super(nombre, apellidos, fecha_nacimiento, licencia);
		}
		
		public Conductor(String nombre, String apellidos, String fecha_nacimiento, String licencia, int id, String tipo_licencia, String nombre_completo, String fecha_caducidad) {
			super(nombre, apellidos, fecha_nacimiento, licencia);
			this.id = id;
			this.tipo_licencia = tipo_licencia;
			this.nombre_completo = nombre_completo;
			this.fecha_caducidad = fecha_caducidad;
		}

		//Getters y Setters
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTipo_licencia() {
			return tipo_licencia;
		}

		public void setTipo_licencia(String tipo_licencia) {
			this.tipo_licencia = tipo_licencia;
		}

		public String getNombre_completo() {
			return nombre_completo;
		}

		public void setNombre_completo(String nombre_completo) {
			this.nombre_completo = nombre_completo;
		}

		public String getFecha_caducidad() {
			return fecha_caducidad;
		}

		public void setFecha_caducidad(String fecha_caducidad) {
			this.fecha_caducidad = fecha_caducidad;
		}

		//Método toString
		
		@Override
		public String toString() {
			return "Conductor [id=" + id + ", tipo_licencia=" + tipo_licencia + ", nombre_completo=" + nombre_completo
					+ ", fecha_caducidad=" + fecha_caducidad + "]";
		}
}
