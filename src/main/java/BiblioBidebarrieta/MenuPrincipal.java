package BiblioBidebarrieta;

import java.util.Scanner;

public class MenuPrincipal {

	public int MostrarMenu(Scanner reader) {
		int opcion;
		
		EntradaTeclado teclado=new EntradaTeclado();
		
		System.out.println("********* MENU ************");
		System.out.println("Selecciona el tipo de archivo que quieres que lea el programa");
		System.out.println("1- Archivo .txt");
		System.out.println("2- Archivo .csv");
		System.out.println("3- Archivo .xml"+"\n");
		System.out.println("0- Salir"+"\n");
		opcion = teclado.EntradaInt(reader,0, 3, "Opcion :");
		
		return opcion;
		
	}
	public String ElegirArchivo(Scanner reader,int opcion) {
		
		String nombreFichero = "";
		EntradaTeclado teclado=new EntradaTeclado();
		
		switch(opcion) {
		
		case 1:
			
			LeerTxt leerTxt = new LeerTxt();
			leerTxt.abrirFichero(nombreFichero= teclado.EntradaTexto(reader,"Indica el Nombre del Archivo txt :"));
			break;
			
		case 2:
			
			System.out.println("Mete el nombre del csv");
			LeerCsv leerCsv = new LeerCsv();
			leerCsv.leer_csv(nombreFichero= teclado.EntradaTexto(reader,"Indica el Nombre del Archivo csv :"));
			break;
			
		case 3:
			
			LectorXML lector = new LectorXML();
			lector.abrirFichero("C:\\Workspace\\archivos\\ejemplo.xml");
			lector.parsearDocumento();
			lector.cargarNodeList();
			lector.procesarNodeList();
			break;		
			
		case 0:
			//cerrar el programa
			break;
	}
		
		return nombreFichero;
	}
}
