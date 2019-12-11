package BiblioBidebarrieta;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MenuPrincipal {
	ArrayList<Libro> libros = new ArrayList<Libro>();
	ArrayList<String> texto;
	String ruta;
	public int MostrarMenu(Scanner reader) {
		int opcion;
		
		EntradaTeclado teclado=new EntradaTeclado();
		
		System.out.println("********* MENU ************");
		System.out.println("Selecciona opcion :");
		System.out.println("1- Leer Archivo");
		System.out.println("2- Ver Libros");
		System.out.println("0- Salir"+"\n");
		opcion = teclado.EntradaInt(reader,0, 2, "Opcion :");
		
		return opcion;
		
	}
	public void ProcesarOpcion(Scanner reader,int opcion) {
		FormatearFechas formater = new FormatearFechas();
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
					Libro libro = new Libro();
					Calendar Fecha ;
					String[] a = texto.get(i).split("-");
					a[0].replaceAll(" {2,}", " ");
					a[1].replaceAll(" {2,}", " ");
					libro.setNombre(a[0]);
					libro.setAutor(a[1]);
					Fecha = formater.Formatear(a[2]);
					libro.setFechaPubli(Fecha);
					libro.setNumPaginas(Integer.parseInt(a[3]));
					libros.add(libro);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		case 2:
			for (int i = 0;i<libros.size();i++)
			{
				System.out.println(libros.get(i).toString());
			}
		case 0:
			//cerrar el programa
			break;
	}

	}
}
