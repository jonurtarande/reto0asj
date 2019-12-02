package BiblioBidebarrieta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeerCsv {

	String rutaCsv = "C:\\Workspace\\archivos\\";
	
	
	
	public void leer_csv(String nombre){
		
		

		
		
		//int contador = 0;
		//int contador_while = 0;
		String csv = rutaCsv + nombre + ".csv";
		String montar_linea = "";
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        // PARA CONTAR LAS LINEAS QUE CONTIENE EL CSV
       /* try {
        	br = new BufferedReader(new FileReader(csv));
            while ((line = br.readLine()) != null) {
            	contador++;
            }
            br.close();
        }catch (IOException e) {
        	System.out.println("Archivo no encontrado");
            e.printStackTrace();  
        } */
        //String [][] paises = new String[contador][];   
        try {
            br = new BufferedReader(new FileReader(csv));
            // carga el archivo csv y va leyendo su contenido
            while ((line = br.readLine()) != null) {
            	//ArrayList<String> country = new ArrayList<String>();
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                
                for(int i = 0; i < 5; i++) {
                	
                	//paises[contador_while][i] = country[i];
                	
                	montar_linea = montar_linea + "  |  " + country[i];
                	
                }
                
                System.out.println(montar_linea);
                montar_linea = "";
                //contador_while++;

            }
            
            //System.out.println(paises[0][5]);
            //System.out.println(paises.get(1));
            
        } catch (FileNotFoundException e) {
        	System.out.println("Archivo no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
        	System.out.println("Se ha producido un FATAL error");
            e.printStackTrace();
        } finally {
        	
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                	System.out.println("Se ha producido un error");
                    e.printStackTrace();          
                }
            }
        }
		
	}
	
}

