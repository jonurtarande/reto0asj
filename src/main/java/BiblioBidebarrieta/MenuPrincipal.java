package BiblioBidebarrieta;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
	ArrayList<String> texto;
	String ruta;
	public int MostrarMenu(Scanner reader) {
		int opcion;
		
		EntradaTeclado teclado=new EntradaTeclado();
		
		System.out.println("********* MENU ************");
		System.out.println("Selecciona el tipo de archivo que quieres que lea el programa");
		System.out.println("1- Archivo .txt");
		System.out.println("0- Salir"+"\n");
		opcion = teclado.EntradaInt(reader,0, 1, "Opcion :");
		
		return opcion;
		
	}
	public String ElegirArchivo(Scanner reader,int opcion) {
		
		String nombreFichero = "";
		EntradaTeclado teclado=new EntradaTeclado();
		
		switch(opcion) {
		
		case 1:
			texto = new ArrayList<String>();
			LectorTxt leerTxt = new LectorTxt();
			ruta = leerTxt.abrirFichero(nombreFichero= teclado.EntradaTexto(reader,"Indica el Nombre del Archivo txt :"));
			try {
				texto = leerTxt.Lector(ruta);
				for (int i=0;i<texto.size();i++)
				{
					System.out.println(texto.get(i).toString());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
			
		case 0:
			//cerrar el programa
			break;
	}
		
		return nombreFichero;
	}
}
