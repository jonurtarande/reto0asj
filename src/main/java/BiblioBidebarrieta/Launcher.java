package BiblioBidebarrieta;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		

		Scanner reader = new Scanner(System.in);
		MenuPrincipal menuPrincipal= new MenuPrincipal();
		int opcion;String nombreArchivo;
		do {
		opcion = menuPrincipal.MostrarMenu(reader);
		menuPrincipal.ElegirArchivo(reader, opcion);
		}while (opcion!=0);
		reader.close();
	}
}