package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto

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
		itemsCombo = new ArrayList<>();

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
		precio = 0;
				
		for (ProductoMenu pitemCombo : itemsCombo)
		{
			precio += (int)(pitemCombo.getPrecio()*((100-descuento)/100));
		}

		return precio;
	}
	
	public String generarTextoFactura()
	{
		String Factura = nombreCombo + " " +String.valueOf(precio);
		return Factura;
	}
	
	public String toString()
	{
		return nombreCombo + " (" + precio + ")";
	}


}
