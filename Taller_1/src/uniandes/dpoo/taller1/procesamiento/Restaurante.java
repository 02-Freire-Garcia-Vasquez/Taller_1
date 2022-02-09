package uniandes.dpoo.taller1.procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;
import uniandes.dpoo.taller1.modelo.Combo;

public class Restaurante 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private static List<Ingrediente> ingredientes;
	
	private static List<ProductoMenu> menuBase;
	
	private static List<Combo> combos;
	
	// ************************************************************************
		// Metodos
		// ************************************************************************

	public  static List<ProductoMenu> getMenuBase()
	{
		return menuBase;
	}
	
	public List<Ingrediente> getIngredientes()
	{
		return ingredientes;
	}
	
	public static void cargarInformacionRestaurante() throws FileNotFoundException, IOException
	{
		ingredientes = cargarIngredientes("./data/ingredientes.txt");
		menuBase = cargarMenu("./data/menu.txt");
		combos = cargarCombos("./data/combos.txt");
	}
	
	private static List<Ingrediente> cargarIngredientes(String nombreArchivo) throws FileNotFoundException, IOException
	{
		List<Ingrediente> listaIngredientes = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(";");
			String nombreIngrediente = partes[0];
			int precioadicional = Integer.parseInt(partes[1]);
			
			Ingrediente elIngrediente = new Ingrediente(nombreIngrediente,precioadicional);
			listaIngredientes.add(elIngrediente);

			linea = br.readLine(); // Leer la siguiente línea
		}
		
		
		br.close();
		
		return listaIngredientes;
	}
	
	
	private static List<ProductoMenu> cargarMenu(String nombreArchivo) throws FileNotFoundException, IOException
	{
		List<ProductoMenu> listaMenu = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(";");
			String nombreMenu = partes[0];
			int costoBase = Integer.parseInt(partes[1]);
			
			ProductoMenu elMenu = new ProductoMenu(nombreMenu,costoBase);
			listaMenu.add(elMenu);

			linea = br.readLine(); // Leer la siguiente línea
		}
		
		
		br.close();
		
		return listaMenu;
	}
	
	private static List<Combo> cargarCombos(String nombreArchivo) throws FileNotFoundException, IOException
	{
		List<Combo> listaCombos = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(";");
			String nombreCombo = partes[0];
			int descuento = Integer.parseInt(partes[1].replace("%", ""));
			
			Combo elcombo = new Combo(nombreCombo,descuento);
			listaCombos.add(elcombo);

			linea = br.readLine(); // Leer la siguiente línea
		}
		
		
		br.close();
		
		return listaCombos;
	}
	
}
