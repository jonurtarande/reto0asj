package BiblioBidebarrieta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

	public class LectorTxt{
		File archivo;
		protected String abrirFichero(String nombre) {
			String ruta ="archivos\\" + nombre +".txt";
			if (ruta!=null)
				archivo = new File(ruta);
				return ruta;
		}
	    public ArrayList<String> Lector(String ruta) throws FileNotFoundException, IOException {
	        String cadena;
	        ArrayList<String> texto=new ArrayList<String>();
	        BufferedReader b = new BufferedReader(new FileReader(ruta));
	        while((cadena = b.readLine())!=null) {
	            texto.add(cadena);
	        }
	        b.close();
			return texto;
	    }   
}
