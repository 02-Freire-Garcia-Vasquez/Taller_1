package uniandes.dpoo.taller1.modelo;

import java.util.List;

public class ProductoAjustado 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private List<Ingrediente> agregados;
	
	private String nombre;
	
	private int precio;

	public ProductoAjustado(ProductoMenu base)
	{

		nombre = base.getNombre();
		precio = base.getPrecio();
		
		for (int i = 0; i < agregados.size(); i++)
		{	
				nombre += agregados.get(i).getNombre();
				precio += agregados.get(i).getCostoAdicional();
		}
		
	// ************************************************************************
	// Metodos
	// ************************************************************************

	}
	
	public String generarTextoFactura()
	{
		String Factura = "hola esto todavia es una prueba";
		return Factura;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getPrecio()
	{
		return precio;
	}
}
