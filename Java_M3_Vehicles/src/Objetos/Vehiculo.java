package Objetos;

import java.util.ArrayList;

/**
 * @author Adrián Rodriguez
 */

abstract public class Vehiculo {
	
	//Atributos
	
	protected String matricula;
	protected String marca;
	protected String color;
	protected Titular titular;
	protected ArrayList<Persona> conductor = new ArrayList<Persona>();
	
	//Constructor
	
	public Vehiculo(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	//Getters y Setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public ArrayList<Persona> getConductor() {
		return conductor;
	}

	public void setConductor(ArrayList<Persona> conductor) {
		this.conductor = conductor;
	}

	//Método toString

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]";
	}
	
}
