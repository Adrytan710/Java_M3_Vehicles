package Objetos;

/**
 * @author Adrián Rodriguez
 */

public class Titular extends Conductor {
	
			//Atributos
	
			private boolean seguro;
			private boolean garaje;
			
			//Constructores
			
			public Titular(String nombre, String apellidos, String fecha_nacimiento, String licencia, int id, String tipo_licencia, String nombre_completo, String fecha_caducidad) {
				super(nombre, apellidos, fecha_nacimiento, licencia, id, tipo_licencia, nombre_completo, fecha_caducidad);
			}
			
			public Titular(String nombre, String apellidos, String fecha_nacimiento, String licencia, int id, String tipo_licencia, String nombre_completo, String fecha_caducidad, boolean seguro, boolean garaje) {
				super(nombre, apellidos, fecha_nacimiento, licencia, id, tipo_licencia, nombre_completo, fecha_caducidad);
				this.seguro = seguro;
				this.garaje = garaje;
			}

			//Getters y Setters
			
			public boolean isSeguro() {
				return seguro;
			}

			public void setSeguro(boolean seguro) {
				this.seguro = seguro;
			}

			public boolean isGaraje() {
				return garaje;
			}

			public void setGaraje(boolean garaje) {
				this.garaje = garaje;
			}

			//Método toString
			
			@Override
			public String toString() {
				return "Titular [seguro=" + seguro + ", garaje=" + garaje + "]";
			}
			
}
