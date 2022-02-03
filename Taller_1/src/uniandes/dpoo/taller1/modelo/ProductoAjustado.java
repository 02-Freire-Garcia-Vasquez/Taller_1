package uniandes.dpoo.taller1.modelo;

public class ProductoAjustado 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private Ingrediente agregado;
	
	private String nombre;
	
	private int precio;

	public ProductoAjustado(ProductoMenu base)
	{

		nombre = base.getNombre() + "con" + agregado.getNombre();
		precio = base.getPrecio() + agregado.getCostoAdicional();
		
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
