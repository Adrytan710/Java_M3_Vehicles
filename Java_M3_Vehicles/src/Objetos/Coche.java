package Objetos;

import java.util.Arrays;

/**
 * @author Adri�n Rodriguez
 */

public class Coche extends Vehiculo {

	//Atributos
	
	private Rueda[] ruedasDelanteras;
	private Rueda[] ruedasTraseras;
	
	//Constructor
	
	public Coche(String matricula, String marca, String color) {
		super(matricula, marca, color);
	}
	
	public Coche(String matricula, String marca, String color, Rueda[] ruedasDelanteras, Rueda[] ruedasTraseras) {
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

	//M�todo toString


	@Override
	public String toString() {
		return "Coche [ruedasDelanteras=" + Arrays.toString(ruedasDelanteras) + ", ruedasTraseras="
				+ Arrays.toString(ruedasTraseras) + ", matricula=" + matricula + ", marca=" + marca + ", color=" + color
				+ ", titular=" + titular + ", conductor=" + conductor + "]";
	}
	
}
