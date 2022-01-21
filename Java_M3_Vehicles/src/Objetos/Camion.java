package Objetos;

/**
 * @author Adrián Rodriguez
 */

import java.util.Arrays;

public class Camion extends Vehiculo {
	
		//Atributos
	
		private Rueda[] ruedasDelanteras;
		private Rueda[] ruedasTraseras;
		
		//Constructores
		
		public Camion(String matricula, String marca, String color) {
			super(matricula, marca, color);
		}
		
		public Camion(String matricula, String marca, String color, Rueda[] ruedasDelanteras, Rueda[] ruedasTraseras) {
			super(matricula, marca, color);
			this.ruedasDelanteras = ruedasDelanteras;
			this.ruedasTraseras = ruedasTraseras;
		}

		//Getters y Setters
		
		public Rueda[] getRuedasDelanteras() {
			return ruedasDelanteras;
		}

		public void setRuedasDelanteras(Rueda[] ruedasDelanteras) {
			this.ruedasDelanteras = ruedasDelanteras;
		}

		public Rueda[] getRuedasTraseras() {
			return ruedasTraseras;
		}

		public void setRuedasTraseras(Rueda[] ruedasTraseras) {
			this.ruedasTraseras = ruedasTraseras;
		}
		//Método toString


		@Override
		public String toString() {
			return "Camion \n ruedasDelanteras:" + Arrays.toString(ruedasDelanteras) + ", ruedasTraseras: " + Arrays.toString(ruedasTraseras) + " \n matricula=" + matricula + ", marca=" + marca + ", color=" + color + 
					"\ntitular=" + titular + "\nconductor=" + conductor;
		}
		
		
}
