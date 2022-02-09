package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import uniandes.dpoo.taller1.modelo.ProductoMenu;
import uniandes.dpoo.taller1.procesamiento.Restaurante;

public class Aplicacion 

{
	
	
	public void ejecutarAplicacion()
	{
		
		try {
			ejecutarCargarInformacion();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Estad铆sticas sobre los Juegos Ol铆mpicos\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opci贸n"));
				if (opcion_seleccionada == 1)
					try {
						ejecutarMostarMenu();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				else if (opcion_seleccionada == 2)
					System.out.println("hola");
				else if (opcion_seleccionada == 3)
					System.out.println("hola");
				else if (opcion_seleccionada == 4)
					System.out.println("hola");
				else if (opcion_seleccionada == 5)
					System.out.println("hola");
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicaci贸n ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opci贸n v谩lida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los n煤meros de las opciones.");
			}
		}
	}
	
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicaci贸n\n");
		System.out.println("1. Mostrar menu");
		System.out.println("2. Iniciar pedido");
		System.out.println("3. Agregar elemento al pedido");
		System.out.println("4. Cerrar  un  pedido  y  guardar  la  factura");
		System.out.println("5. Consultar  la  informaci髇  de  un  pedido  dado  su  id");
		System.out.println("6. Cerra programa");

	}
	
	private void ejecutarCargarInformacion() throws FileNotFoundException, IOException
	{
		
		System.out.println("\n" + "Cargar un archivo" + "\n");
		Restaurante.cargarInformacionRestaurante();
	}
	
	private void ejecutarMostarMenu() throws FileNotFoundException, IOException
	{
		System.out.println("\n" + "El menu es el siguiente:" + "\n");
		List<ProductoMenu> menu = Restaurante.getMenuBase();
		System.out.println(menu);
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