package Objetos;

import java.util.Arrays;

/**
 * @author Adrián Rodriguez
 */

public class Moto extends Vehiculo {
	
		//Atributos
		private Rueda ruedasDelantera;
		private Rueda ruedasTrasera;
		
		//Constructores
		
		public Moto(String matricula, String marca, String color) {
			super(matricula, marca, color);
		}
		
		public Moto(String matricula, String marca, String color, Rueda ruedasDelantera, Rueda ruedasTrasera) {
			super(matricula, marca, color);
			this.ruedasDelantera = ruedasDelantera;
			this.ruedasTrasera = ruedasTrasera;
		}

		//Getters y Setters
		
		public Rueda getRuedasDelantera() {
			return ruedasDelantera;
		}

		public void setRuedasDelantera(Rueda ruedasDelantera) {
			this.ruedasDelantera = ruedasDelantera;
		}

		public Rueda getRuedasTrasera() {
			return ruedasTrasera;
		}

		public void setRuedasTrasera(Rueda ruedasTrasera) {
			this.ruedasTrasera = ruedasTrasera;
		}

		@Override
		public String toString() {
			return "Moto [ruedasDelanteras=" + ruedasDelantera + ", ruedasTraseras=" + ruedasTrasera + ", matricula="
					+ matricula + ", marca=" + marca + ", color=" + color + "]";
		}

		//Método toString
		
		
}
