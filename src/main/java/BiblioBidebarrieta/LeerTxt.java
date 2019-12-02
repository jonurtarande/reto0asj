package BiblioBidebarrieta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class LeerTxt extends LectorFicheros{
		@Override
		protected void abrirFichero(String nombre) {
			String ruta ="C:\\Workspace\\archivos\\"+nombre+".txt";
			if (ruta!=null)
				archivo = new File(ruta);
				try {
					LectorTxt(ruta);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	    public String LectorTxt(String ruta) throws FileNotFoundException, IOException {
	        String cadena;
	        String texto="";
	        BufferedReader b = new BufferedReader(new FileReader(ruta));
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	            texto+=cadena+"\n";
	        }
	        b.close();
			return texto;
	    }   
}
