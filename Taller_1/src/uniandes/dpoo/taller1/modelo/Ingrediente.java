package uniandes.dpoo.taller1.modelo;

public class Ingrediente 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private String nombre;

	private int CostoAdicional;
	
	public Ingrediente(String pnombre, int pCostoAdicional)
	{
		nombre = pnombre;
		CostoAdicional = pCostoAdicional;
		
	// ************************************************************************
	// Metodos
	// ************************************************************************

	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCostoAdicional()
	{
		return CostoAdicional;
	}
	
}
