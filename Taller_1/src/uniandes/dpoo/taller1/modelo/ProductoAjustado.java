package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;
import java.util.List;

public class ProductoAjustado implements Producto 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private static List<Ingrediente> agregados;
	
	private static List<Ingrediente> eliminados;
	
	private String nombre;
	
	private int precio;

	public ProductoAjustado(ProductoMenu base)
	{

		nombre = base.getNombre();
		precio = base.getPrecio();
		agregados = new ArrayList<>();
		eliminados = new ArrayList<>();
		
	// ************************************************************************
	// Metodos
	// ************************************************************************

	}
	
	public String generarTextoFactura()
	{
		String añade = "";
		String elimina = "";
		String Factura = "";
		for (Ingrediente pingrediente : agregados)
		{	
			añade += "con adicion de" + pingrediente.getNombre();
		}
		
		for (Ingrediente pingrediente : eliminados)
		{	
			elimina += "sin" + pingrediente.getNombre();
		}
		Factura = nombre + añade + elimina;
		return Factura;
	}
	
	public String getNombre()
	{
		for (Ingrediente pingrediente : agregados)
		{	
				nombre += "con adicion de" + pingrediente.getNombre();
		}
		
		for (Ingrediente pingrediente : eliminados)
		{	
				nombre += "sin" + pingrediente.getNombre();
		}
		return nombre;
	}
	
	public int getPrecio()
	{
		
		
		for (Ingrediente pingrediente : agregados)
		{	
				precio += pingrediente.getCostoAdicional();
		}
		return precio;
	}
	
	public  void agregarIngrediente(Ingrediente nuevoIngrediente)
	{
		agregados.add(nuevoIngrediente);
	}
	
	public  void quitarIngrediente(Ingrediente nuevoIngrediente)
	{
		eliminados.add(nuevoIngrediente);
	}
}
