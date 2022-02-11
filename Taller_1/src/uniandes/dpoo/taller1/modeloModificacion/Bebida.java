package uniandes.dpoo.taller1.modeloModificacion;

public class Bebida implements Producto

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
		
	private String nombre;

	private int precioBase;
	
	private int calorias;

	public Bebida(String pnombre, int pprecioBase)
	{
		nombre = pnombre;
		precioBase = pprecioBase;
		calorias = 5;
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public int getPrecio() 
	{
		return precioBase;
	}

	public String generarTextoFactura() 
	{
		String Factura = nombre + " " + String.valueOf(precioBase) + " " + String.valueOf(calorias);
		return Factura;
	}

	@Override
	public int getCalorias() 
	{
		return calorias;
	}

}
