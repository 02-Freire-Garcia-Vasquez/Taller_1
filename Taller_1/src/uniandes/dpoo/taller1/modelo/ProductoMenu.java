package uniandes.dpoo.taller1.modelo;

public class ProductoMenu 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private String nombre;

	private int precioBase;
	
	public ProductoMenu(String pnombre, int pprecioBase)
	{
		nombre = pnombre;
		precioBase = pprecioBase;

	}
	
	// ************************************************************************
	// Metodos
	// ************************************************************************
	
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
		String Factura = "hola esto todavia es una prueba";
		return Factura;
	}
	
}