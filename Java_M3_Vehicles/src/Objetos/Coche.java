package Objetos;

import java.util.Arrays;

/**
 * @author Adrián Rodriguez
 */

public class Coche extends Vehiculo {

	//Atributos
	
	protected int ruedasDelanteras[];
	protected int ruedasTraseras[];
	
	//Constructor
	
	public Coche(String matricula, String marca, String color, int ruedasDelanteras[], int ruedasTraseras[]) {
		super(matricula, marca, color);
		this.ruedasDelanteras = ruedasDelanteras;
		this.ruedasTraseras = ruedasTraseras;
	}

	//Getters y Setters
	
	public int[] getRuedasDelanteras() {
		return ruedasDelanteras;
	}

	public void setRuedasDelanteras(int[] ruedasDelanteras) {
		this.ruedasDelanteras = ruedasDelanteras;
	}

	public int[] getRuedasTraseras() {
		return ruedasTraseras;
	}

	public void setRuedasTraseras(int[] ruedasTraseras) {
		this.ruedasTraseras = ruedasTraseras;
	}

	//Método toString
	
	@Override
	public String toString() {
		return "Coche [ruedasDelanteras=" + Arrays.toString(ruedasDelanteras) + ", ruedasTraseras="
				+ Arrays.toString(ruedasTraseras) + "]";
	}
}
