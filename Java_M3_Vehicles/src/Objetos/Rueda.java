package Objetos;

public class Rueda {
	
	private double diametro;
	private String marca;
	
	public Rueda(double diametro, String marca) 
	{
		this.diametro = diametro;
		this.marca = marca;
	}

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

	@Override
	public String toString() {
		return "Rueda [diametro=" + diametro + ", marca=" + marca + "]";
	}
	
	
}
