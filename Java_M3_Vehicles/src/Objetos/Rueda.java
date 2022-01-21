package Objetos;
/**
 * 
 * @author JOAN
 *
 */

public class Rueda {
	
	//Atributos
	
	private double diametro;
	private String marca;
	
	//Constructor
	
	public Rueda(double diametro, String marca) 
	{
		this.diametro = diametro;
		this.marca = marca;
	}
	
	//Getters y Setters

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//ToStirng
	
	@Override
	public String toString() {
		return "Rueda [diametro=" + diametro + ", marca=" + marca + "]";
	}
	
	
}
