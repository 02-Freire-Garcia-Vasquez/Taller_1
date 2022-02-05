package uniandes.dpoo.taller1.procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;

import uniandes.dpoo.taller1.modelo.Combo;

public class Restaurante 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private List<Ingrediente> ingredientes;
	
	private static List<ProductoMenu> menuBase;
	
	private List<Combo> combos;
	
	// ************************************************************************
		// Metodos
		// ************************************************************************

	public static List<ProductoMenu> getMenuBase()
	{
		return menuBase;
	}
	
	public List<Ingrediente> getIngredientes()
	{
		return ingredientes;
	}
	
	public static void cargarInformacionRestaurante(String nombreArchivoIngredientes,String nombreArchivoMenu,String nombreArchivoCombos) throws FileNotFoundException, IOException
	{
		cargarIngredientes(nombreArchivoIngredientes);
		cargarMenu(nombreArchivoMenu);
		cargarCombos(nombreArchivoCombos);
	}
	
	private static void cargarIngredientes(String nombreArchivo) throws FileNotFoundException, IOException
	{
		Map<String, Ingrediente> Mapaingredientes = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(";");
			String nombreIngrediente = partes[0];
			int precioadicional = Integer.parseInt(partes[1]);
			
			Ingrediente elIngrediente = new Ingrediente(nombreIngrediente,precioadicional);
			Mapaingredientes.put(nombreIngrediente, elIngrediente);

			linea = br.readLine(); // Leer la siguiente línea
		}
		
		
		br.close();
	}
	
	
	private static void cargarMenu(String nombreArchivo) throws FileNotFoundException, IOException
	{
		Map<String, ProductoMenu> MapaMenu = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(";");
			String nombreMenu = partes[0];
			int costoBase = Integer.parseInt(partes[1]);
			
			ProductoMenu elMenu = new ProductoMenu(nombreMenu,costoBase);
			MapaMenu.put(nombreMenu, elMenu);

			linea = br.readLine(); // Leer la siguiente línea
		}
		
		
		br.close();
	}
	
	private static void cargarCombos(String nombreArchivo) throws FileNotFoundException, IOException
	{
		Map<String, Combo> MapaCombos = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(";");
			String nombreCombo = partes[0];
			int descuento = Integer.parseInt(partes[1].replace("%", ""));
			
			Combo elcombo = new Combo(nombreCombo,descuento);
			MapaCombos.put(nombreCombo, elcombo);

			linea = br.readLine(); // Leer la siguiente línea
		}
		
		
		br.close();
	}
	
}
