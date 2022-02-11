package uniandes.dpoo.taller1.modeloModificacion;

public class Ingrediente

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private String nombre;

	private int CostoAdicional;
	
	private int calorias;
	
	public Ingrediente(String pnombre, int pCostoAdicional)
	{
		this.nombre = pnombre;
		this.CostoAdicional = pCostoAdicional;
		calorias = 5;
		
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
	
	public int getCalorias()
	{
		return calorias;
	}
	
}
