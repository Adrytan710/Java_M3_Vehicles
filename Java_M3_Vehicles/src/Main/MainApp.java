package Main;
import java.util.ArrayList;
/**
 * @author JOAN
 */
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import Objetos.*;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Persona> usuarios = new ArrayList<Persona>();
		ArrayList<Persona> usuariosAux = new ArrayList<Persona>();
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		int op;
		//Menu general
		do 
		{
			try 
			{
				op = Integer.parseInt(JOptionPane.showInputDialog("Menu (1/2/3): \n\n1. Crear Usuario  \n2. Crear Vehiculo \n3. Salir"));
			} 
			catch (Exception e) 
			{
				op = 0;
			}
			
			switch (op) 
			{
				case 1:
						menuCrearUsuario(usuarios, usuariosAux);
					break;
					
				case 2:
						menuCrearVehicles(vehiculos, usuariosAux);
					break;
					
				case 3:
						JOptionPane.showMessageDialog(null, "Hasta la proxima.");
					break;
	
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
					break;
			}
		} 
		while (op != 3);
		
		System.out.println(vehiculos);

	}

	/************************************************************** FUNCIONES  **************************************************************************/
	
	
	/**
	 * Menu crear usuario
	 * @param usuarios
	 * @param usuariosAux
	 */
	public static void menuCrearUsuario(ArrayList<Persona> usuarios, ArrayList<Persona> usuariosAux) 
	{
		if(usuarios.size() < 1)
		{
			Titular titular = crearTitular();
			
			usuarios.add(titular);
			usuariosAux.add(titular);
		}
		else
		{
			Conductor conductor = crearConductor();
			
			usuarios.add(conductor);
			usuariosAux.add(conductor);
		}
	}

	/**
	 * Menu crear vehiculo
	 * @param usuarios
	 * @param usuariosAux
	 */
	public static void menuCrearVehicles(ArrayList<Vehiculo> vehiculos, ArrayList<Persona> usuariosAux) 
	{
		
		//Pedimos al usuario si quiere crear coche o moto
		String opcion;
		
		do 
		{
			opcion = JOptionPane.showInputDialog("Escoge que vehiculo quieres introducir: \n\n- Coche \n- Moto \n- Camion");
			if(!comprobarLicencia(opcion, (Titular)usuariosAux.get(0)))
			{
				JOptionPane.showMessageDialog(null, "La licencia no permite conducir este vehiculo");
			}
		} 
		while (!comprobarLicencia(opcion, (Titular)usuariosAux.get(0)));

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
		ArrayList<Persona> conductores = new ArrayList<Persona>();
		
		switch (opcion) 
		{
			case "Coche":					
					Coche coche = new Coche(matricula, marca, color);
					
					//Insertamos ruedas
					coche.setRuedasDelanteras(rellenarRuedasDelanteras());
					coche.setRuedasTraseras(rellenarRuedasTraseras());
					
					coche.setTitular((Titular)usuariosAux.get(0));

					comprobarConductor(usuariosAux, opcion);
					
					conductores.addAll(usuariosAux);
					
					coche.setConductor(conductores);
					vehiculos.add(coche);

				break;
				
			case "Moto":
					Moto moto = new Moto(matricula, marca, color);
					
					moto.setRuedasDelantera(ruedaDelanteraMoto());
					moto.setRuedasTrasera(ruedaTraseraMoto());
					
					moto.setTitular((Titular)usuariosAux.get(0));
					
					comprobarConductor(usuariosAux, opcion);
					
					conductores.addAll(usuariosAux);
					
					moto.setConductor(conductores);
					vehiculos.add(moto);
					
				break;
				
			case "Camion":					
					Camion camion = new Camion(matricula, marca, color);

					camion.setRuedasDelanteras(rellenarRuedasDelanteras());
					camion.setRuedasTraseras(rellenarRuedasTraseras());
					
					camion.setTitular((Titular)usuariosAux.get(0));

					comprobarConductor(usuariosAux, opcion);
					
					conductores.addAll(usuariosAux);
					
					camion.setConductor(conductores);
					vehiculos.add(camion);

				break;
	
			default:
				JOptionPane.showMessageDialog(null, "La opcion no es valida");
				break;
		}
		
		usuariosAux.clear();
	}
	
	
	/**
	 * Funcion que comprueba si el titular es conductor
	 * @param usuariosAux
	 * @param opcion
	 */
	public static void comprobarConductor(ArrayList<Persona> usuariosAux, String opcion)
	{
		if(JOptionPane.showInputDialog("El titular sera el conductor? Si/No").equalsIgnoreCase("no"))
		{
			if(usuariosAux.size() < 2)
			{
				usuariosAux.clear();
				Conductor conductor;
				do 
				{
					conductor = crearConductor();
					if(!comprobarLicencia(opcion, conductor))
					{
						JOptionPane.showMessageDialog(null, "La licencia no permite conducir este vehiculo");
					}
				} 
				while (!comprobarLicencia(opcion, conductor));
				usuariosAux.add(conductor);
			}
			else
			{
				usuariosAux.remove(0);
			}
		}
	}
	
	/**
	 * Funcion para comprobar la licencia
	 * @param opcion
	 * @param conductor
	 * @return
	 */
	public static boolean comprobarLicencia(String opcion, Conductor conductor) 
	{
		if(opcion.equalsIgnoreCase("camion") && conductor.getLicencia().equalsIgnoreCase("C"))
		{
			return true;
		}
		else if(opcion.equalsIgnoreCase("coche") && conductor.getLicencia().equalsIgnoreCase("B"))
		{
			return true;
		}
		else if(opcion.equalsIgnoreCase("moto") && conductor.getLicencia().equalsIgnoreCase("A"))
		{
			return true;
		}
		return false;
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
			String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda delantera " + (i + 1) + ".");
			double diametroRueda;
			do 
			{
				diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda delantera " + (i + 1) + "."));
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
			String marcaRueda = JOptionPane.showInputDialog("Intoduce la marca de la rueda trasera " + (i + 1) + ".");
			double diametroRueda;
			do 
			{
				diametroRueda = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de la rueda trasera " + (i + 1) + "."));
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
	
	/**
	 * Funcion para crear titular
	 * @return
	 */
	public static Titular crearTitular()
	{
		String nombre = JOptionPane.showInputDialog("Introduzca nombre de Usuario.");
		String apellidos = JOptionPane.showInputDialog("Introduzca apellidos del Usuario.");
		String fecha_nacimiento = JOptionPane.showInputDialog("Introduzca fecha de nacimiento del Usuario.");
		String licencia = JOptionPane.showInputDialog("Indique cual de las 3 licencias tiene(A,B o C): \n\nA. Moto\nB. Coche\nC. Camion");
		int id_licencia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ID de la licencia."));
		String fecha_caducidad = JOptionPane.showInputDialog("Introduzca fecha de caducidad de la licencia.");
		boolean seguro = false;
		boolean garagePropio = false;
		
		if(JOptionPane.showInputDialog("Tiene seguro de coche? (Si/No)").equalsIgnoreCase("Si"))
		{
			seguro = true;
		}
		
		if(JOptionPane.showInputDialog("Tiene garage propio? (Si/No)").equalsIgnoreCase("Si"))
		{
			garagePropio = true;
		}
		
		return new Titular(nombre, apellidos, fecha_nacimiento, licencia, id_licencia, licencia, nombre+" "+apellidos, fecha_caducidad, seguro, garagePropio);
	}
	
	/**
	 * Funcion para crear conductor
	 * @return
	 */
	public static Conductor crearConductor()
	{
		String nombre = JOptionPane.showInputDialog("Introduzca nombre de Usuario.");
		String apellidos = JOptionPane.showInputDialog("Introduzca apellidos del Usuario.");
		String fecha_nacimiento = JOptionPane.showInputDialog("Introduzca fecha de nacimiento del Usuario.");
		String licencia = JOptionPane.showInputDialog("Indique cual de las 3 licencias tiene(A,B o C): \n\nA. Moto\nB. Coche\nC. Camion");
		int id_licencia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ID de la licencia."));
		String fecha_caducidad = JOptionPane.showInputDialog("Introduzca fecha de caducidad de la licencia.");

		
		return new Conductor(nombre, apellidos, fecha_nacimiento, licencia, id_licencia, licencia, nombre+" "+apellidos, fecha_caducidad);
	}
}
