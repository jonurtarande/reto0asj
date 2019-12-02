package BiblioBidebarrieta;

import java.io.File;

public class LectorFicheros {

	protected File archivo;
	
	public LectorFicheros() {
		
	}
	
	protected void abrirFichero(String ruta) {
		if (ruta!=null)
			archivo = new File(ruta);
	}
}
