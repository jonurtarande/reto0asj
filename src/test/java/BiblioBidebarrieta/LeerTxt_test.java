package BiblioBidebarrieta;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class LeerTxt_test {

	@Test
	public void LectorTxt_test() throws FileNotFoundException, IOException {
		
		LeerTxt leerTxt = new LeerTxt();
		leerTxt.abrirFichero("Texto");
		String textoLeido = leerTxt.LectorTxt("C:\\Workspace\\archivos\\Texto.txt");
		String Texto = leerTxt.LectorTxt("C:\\Workspace\\archivos\\Texto_test.txt");
		
		assertEquals("Son Iguales", Texto, textoLeido);
		
	}

}
