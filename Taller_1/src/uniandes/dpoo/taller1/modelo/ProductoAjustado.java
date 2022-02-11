package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;
import java.util.List;

public class ProductoAjustado implements Producto 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private  List<Ingrediente> agregados;
	
	private  List<Ingrediente> eliminados;
	
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
			añade += " con adicion de " + pingrediente.getNombre();
		}
		
		for (Ingrediente qingrediente : eliminados)
		{	
			elimina += " sin " + qingrediente.getNombre();
		}
		Factura = nombre + añade + elimina + " $ " + String.valueOf(precio);
		return Factura;
	}
	
	public String getNombre()
	{
		for (Ingrediente pingrediente : agregados)
		{	
				nombre += " con adicion de " + pingrediente.getNombre();
		}
		
		for (Ingrediente qingrediente : eliminados)
		{	
				nombre += " sin " + qingrediente.getNombre();
		}
		return nombre;
	}
	
	public int getPrecio()
	{
		return precio;
	}
	
	public  void agregarIngrediente(Ingrediente nuevoIngrediente)
	{
		/**
		 * Esta función permite agregar ingredientes, previamente previstos, 
		 * a la lista de agregados que trae por defecto la clase de producto 
		 * ajustado
		 */
		
		agregados.add(nuevoIngrediente);
		precio += nuevoIngrediente.getCostoAdicional();
	}
	
	public  void quitarIngrediente(Ingrediente ingredientequitrar)
	
	/**
	 * Esta función lo que hace es “quitar” ingredientes del producto. 
	 * En realidad solo se hace esto de manera teórica. 
	 */
	{
		eliminados.add(ingredientequitrar);
	}
}
