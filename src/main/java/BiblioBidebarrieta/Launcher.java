package BiblioBidebarrieta;
import java.io.IOException;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		// Variables
		
		Scanner reader = new Scanner(System.in);
		MenuPrincipal menuPrincipal= new MenuPrincipal();
		
		int opcion;String nombreArchivo;

		// programa
		
		opcion = menuPrincipal.MostrarMenu(reader);
		nombreArchivo = menuPrincipal.ElegirArchivo(reader, opcion);
		reader.close();
	}
}
