package Main;

import javax.swing.JOptionPane;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {

		//Pedimos al usuario datos del vehiculo
		String matricula = JOptionPane.showInputDialog("Intoduce la matricula del vehiculo.");
		String marca = JOptionPane.showInputDialog("Intoduce la marca del vehiculo.");
		String color = JOptionPane.showInputDialog("Intoduce el color del vehiculo.");
		
		Rueda[] ruedasDelanteras = new Rueda[2];
		Rueda[] ruedasTraseras = new Rueda[2];
		
		Coche coche = new Coche(matricula, marca, color);
		
		//Pedimos al usuario datos de las ruedas
		for (int i = 0; i < ruedasDelanteras.length; i++) 
		{
			String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda " + (i + 1) + ".");
			double diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda " + (i + 1) + "."));
			
			ruedasDelanteras[i] = new Rueda(diametroRueda, marcaRueda);
		}
		
		for (int i = 0; i < ruedasTraseras.length; i++) 
		{
			String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda " + (i + 1) + ".");
			double diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda " + (i + 1) + "."));
			
			ruedasTraseras[i] = new Rueda(diametroRueda, marcaRueda);
		}

		//Insertamos ruedas
		coche.setRuedasDelanteras(ruedasDelanteras);
		coche.setRuedasTraseras(ruedasTraseras);
		
		System.out.println(coche);

	}

}
