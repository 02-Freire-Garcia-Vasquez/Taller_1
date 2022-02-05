package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import uniandes.dpoo.taller1.modelo.ProductoMenu;
import uniandes.dpoo.taller1.procesamiento.Restaurante;

public class Aplicacion 

{
	
	public void ejecutarAplicacion()
	{
		ejecutarCargarInformacion();
		System.out.println("Estadísticas sobre los Juegos Olímpicos\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					ejecutarMostarMenu();
				else if (opcion_seleccionada == 2)
					ejecutarMostarMenu();
				else if (opcion_seleccionada == 3)
					ejecutarMostarMenu();
				else if (opcion_seleccionada == 4)
					ejecutarMostarMenu();
				else if (opcion_seleccionada == 5)
					ejecutarMostarMenu();
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
	
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Mostrar menu");
		System.out.println("2. Iniciar pedido");
		System.out.println("3. Agregar elemento al pedido");
		System.out.println("4. Cerrar  un  pedido  y  guardar  la  factura");
		System.out.println("5. Consultar  la  informaci�n  de  un  pedido  dado  su  id");
		System.out.println("6. Cerra programa");

	}
	
	private void ejecutarMostarMenu()
	{
		System.out.println("\n" + "El menu es el siguiente:" + "\n");
		List<ProductoMenu> Menu = Restaurante.getMenuBase();
		System.out.println(Menu);
	}
	
	private void ejecutarCargarInformacion()
	{
		
		System.out.println("\n" + "Cargar un archivo" + "\n");
		try {
			Restaurante.cargarInformacionRestaurante("./data/ingredientes.txt","./data/menu.txt","./data/combos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}
	
}