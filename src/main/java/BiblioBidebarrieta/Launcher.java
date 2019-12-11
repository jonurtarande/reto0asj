package BiblioBidebarrieta;


import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		// Variables
		
		Scanner reader = new Scanner(System.in);
		MenuPrincipal menuPrincipal= new MenuPrincipal();
		
		int opcion;String nombreArchivo;

		// programa
		do {
			opcion = menuPrincipal.MostrarMenu(reader);
			menuPrincipal.ProcesarOpcion(reader, opcion);
		}while (opcion!=0);
		reader.close();
	}
}
