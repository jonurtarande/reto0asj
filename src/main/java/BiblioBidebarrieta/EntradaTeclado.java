package BiblioBidebarrieta;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaTeclado {
	
	public void reader() {
	}
	
	
	public String EntradaTexto(Scanner reader, String texto) {
		String nombre;
		
		System.out.println(texto);	
		nombre = reader.next();
		
		return nombre;

	}
	
	public int EntradaInt(Scanner reader,int valorMin,int valorMax, String texto ) {
		
		
		//Declaracion e inicializaci�n de variables
		int opcion = 0;
		boolean opcionCorrecta = false; 
		//Inicio de programa
		while(!opcionCorrecta)
		{
			try
			{ 
				System.out.println(texto);
				opcion=reader.nextInt();
				while(opcion < valorMin || opcion > valorMax)
				{
					System.out.println("Introduce un valor n�merico entre "+valorMin+" y "+valorMax);
					opcion=reader.nextInt();
				}
				reader.nextLine();
				opcionCorrecta = true;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Introduce un valor n�merico entre "+valorMin+" y "+valorMax);
				reader.nextLine();
			}
			
		}

		return opcion;
	}

	/*
	 * public class LeerDatosTest {

	String resultado = null;
	@Test
	public void test() {
		LeerDatos leerDatos = new LeerDatos();
		
		String nombre = "nombre";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    Scanner reader = new Scanner(System.in);
	    
	    resultado = leerDatos.IntroducirNombre(reader);
	    assertEquals("nombre", resultado);
	  
	  */	
}	 

