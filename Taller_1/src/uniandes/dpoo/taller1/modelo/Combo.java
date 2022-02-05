package uniandes.dpoo.taller1.modelo;

import java.util.List;

public class Combo 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
		
	
	private String nombreCombo;

	private double descuento;
	
	private List<ProductoMenu> itemsCombo;
	
	private int precio;
	
	public Combo(String pnombre, double pdescuento)
	{
		
		nombreCombo = pnombre;
		descuento = pdescuento;

	}
	
	public void agregarItemACombo(ProductoMenu itemCombo)
	{
		
		itemsCombo.add(itemCombo);

	}
	
	public String getNombre()
	{
		return nombreCombo;
	}
	
	public int getPrecio()
	{
		for (ProductoMenu pitemCombo : itemsCombo)
		{
			precio += (int)(pitemCombo.getPrecio()*((100-descuento)/100));
		}

		return precio;
	}
	
	public String generarTextoFactura()
	{
		String Factura = "hola esto todavia es una prueba";
		return Factura;
	}


}
