package uniandes.dpoo.taller1.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.taller1.consola.Aplicacion;

public class Pedido 

{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private static int numeroPedidos;
	
	private  int idPedido;
	
	private  String NombreCliente;
	
	private  String DireccionCliente;
	
	private List<Producto> itemsPedido;
	
	// ************************************************************************
	// Metodos
	// ************************************************************************
	
	public Pedido(String pnombreCliente, String pdireccionCliente)
	
	{
		NombreCliente = pnombreCliente;
		DireccionCliente = pdireccionCliente;
		itemsPedido = new ArrayList<>();
		idPedido = (int)(Math. random()*100+1); 
	}
	
	public int getIdPedido()
	{
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem)
	{
		itemsPedido.add(nuevoItem);
	}
	
	public int getPrecioNetoPedido()
	{
		int PrecioNeto = 0;
		for (Producto item : itemsPedido)
		{
			int precio = item.getPrecio();
			PrecioNeto += precio;
		}
		
		return PrecioNeto;
	}
	
	public int getPrecioIvaPedido()
	{
		int PrecioNeto = 0;
		for (Producto item : itemsPedido)
		{
			int precio = item.getPrecio();
			PrecioNeto += precio;
		}

		int PrecioIva = PrecioNeto*(19/100);
		
		return PrecioIva;
	}
	
	public int getPrecioTotalPedido()
	{
		int PrecioTotal = 0;
		int PrecioNeto = 0;
		for (Producto item : itemsPedido)
		{
			int precio = item.getPrecio();
			PrecioNeto += precio;
		}

		int PrecioIva = PrecioNeto*(19/100);
		PrecioTotal = PrecioNeto+PrecioIva;
		
		return PrecioTotal;
	}
	
	public String generarTextoFactura()
	{
		String Factura = "hola esto todavia es una prueba";
		return Factura;
	}
	
	public static void guardarFactura() throws IOException
	{
		
		String message = "hola como estan quisiera decirle qeu vamos bien";

		File file = new File("./data/factura.txt"); 
		if(file.createNewFile()) System.out.println("File created: " + file.getName()); 
		else System.out.println("File already exists."); 
		BufferedWriter writer = new BufferedWriter(new FileWriter("./data/factura.txt"));
		writer.write(message); 
		writer.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		guardarFactura();
	}
	
	
	
}
