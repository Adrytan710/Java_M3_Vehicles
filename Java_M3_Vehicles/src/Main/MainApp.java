package Main;
/**
 * @author JOAN
 */
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {
		
		//Pedimos al usuario si quiere crear coche o moto
		String opcion = JOptionPane.showInputDialog("Escoge que vehiculo quieres introducir: \n\n- Coche \n- Moto \n- Camion");

		//Pedimos al usuario datos del vehiculo
		String matricula;
		
		do 
		{
			matricula = JOptionPane.showInputDialog("Intoduce la matricula del vehiculo.");
			if(!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula))
			{
				JOptionPane.showMessageDialog(null, "La matricula deba contener 4 numeros y 2/3 letras");
			}
		}
		while (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula));
		String marca = JOptionPane.showInputDialog("Intoduce la marca del vehiculo.");
		String color = JOptionPane.showInputDialog("Intoduce el color del vehiculo.");
		
		switch (opcion) 
		{
			case "Coche":					
					Coche coche = new Coche(matricula, marca, color);
					
					//Pedimos al usuario datos de las ruedas
					
					//Insertamos ruedas
					coche.setRuedasDelanteras(rellenarRuedasDelanteras());
					coche.setRuedasTraseras(rellenarRuedasTraseras());
					
					System.out.println(coche);
				break;
				
			case "Moto":
					Moto moto = new Moto(matricula, marca, color);
					
					moto.setRuedasDelantera(ruedaDelanteraMoto());
					moto.setRuedasTrasera(ruedaTraseraMoto());
					
					System.out.println(moto);
				break;
				
			case "Camion":					
					Camion camion = new Camion(matricula, marca, color);

					camion.setRuedasDelanteras(rellenarRuedasDelanteras());
					camion.setRuedasTraseras(rellenarRuedasTraseras());
					
					System.out.println(camion);
				break;
	
			default:
				JOptionPane.showMessageDialog(null, "La opcion no es valida");
				break;
		}

	}
	
	/**
	 * Funcion para rellenar ruedas delanteras de un coche o camion
	 * @param ruedasDelanteras
	 */
	public static Rueda[] rellenarRuedasDelanteras()
	{
		Rueda[] ruedasDelanteras = new Rueda[2];
		for (int i = 0; i < ruedasDelanteras.length; i++) 
		{
			String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda " + (i + 1) + ".");
			double diametroRueda;
			do 
			{
				diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda " + (i + 1) + "."));
				if(diametroRueda < 0.4 || diametroRueda > 4) 
				{
					JOptionPane.showMessageDialog(null, "Tiene que ser inferior a 4 o superior a 0.4");
				}
			} 
			while (diametroRueda < 0.4 || diametroRueda > 4);
			
			ruedasDelanteras[i] = new Rueda(diametroRueda, marcaRueda);
		}
		return ruedasDelanteras;
	}

	
	/**
	 * Funcion para rellenar ruedas traseras de un coche o camion
	 * @param ruedasDelanteras
	 */
	public static Rueda[] rellenarRuedasTraseras()
	{
		Rueda[] ruedasTraseras = new Rueda[2];
		for (int i = 0; i < ruedasTraseras.length; i++) 
		{
			String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda " + (i + 1) + ".");
			double diametroRueda;
			do 
			{
				diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda " + (i + 1) + "."));
				if(diametroRueda < 0.4 || diametroRueda > 4) 
				{
					JOptionPane.showMessageDialog(null, "Tiene que ser inferior a 4 o superior a 0.4");
				}
			} 
			while (diametroRueda < 0.4 || diametroRueda > 4);
			
			ruedasTraseras[i] = new Rueda(diametroRueda, marcaRueda);
		}
		return ruedasTraseras;
	}

	
	/**
	 * Funcion para declarar rueda delantera de una moto
	 * @param ruedasDelanteras
	 */
	public static Rueda ruedaDelanteraMoto()
	{
		String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda delantera.");
		double diametroRueda;
		do 
		{
			diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda delantera."));
			if(diametroRueda < 0.4 || diametroRueda > 4) 
			{
				JOptionPane.showMessageDialog(null, "Tiene que ser inferior a 4 o superior a 0.4");
			}
		} 
		while (diametroRueda < 0.4 || diametroRueda > 4);
		
		return new Rueda(diametroRueda, marcaRueda);
	}

	
	/**
	 * Funcion para declarar rueda trasera de una moto
	 * @param ruedasDelanteras
	 */
	public static Rueda ruedaTraseraMoto()
	{
		String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda trasera.");
		double diametroRueda;
		do 
		{
			diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda trasera."));
			if(diametroRueda < 0.4 || diametroRueda > 4) 
			{
				JOptionPane.showMessageDialog(null, "Tiene que ser inferior a 4 o superior a 0.4");
			}
		} 
		while (diametroRueda < 0.4 || diametroRueda > 4);
		
		return new Rueda(diametroRueda, marcaRueda);
	}

}
