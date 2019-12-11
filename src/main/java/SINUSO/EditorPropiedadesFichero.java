package SINUSO;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class EditorPropiedadesFichero {
	
	public boolean setPermisosFicheroPropietario(File fichero, boolean r, boolean w, boolean x) {
		if (validarFichero(fichero)) {
			try {
				fichero.setReadable(r);
				fichero.setWritable(w);
				fichero.setExecutable(x);
				return true;
			} catch (SecurityException e) {
				System.out.println("No tienes permiso para cambiar permisos");
				return false;
			}
		} else
			return false;
	}

	public boolean setPermisosFicheroTodos(File fichero, boolean r, boolean w, boolean x) {
		if (validarFichero(fichero)) {
			try {
				fichero.setReadable(r, false);
				fichero.setWritable(w, false);
				fichero.setExecutable(x, false);
				return true;
			} catch (SecurityException e) {
				System.out.println("No tienes permiso para cambiar permisos");
				return false;
			}
		}
		return false;
	}

	private boolean validarFichero(File fichero) {
		if (fichero != null)
			if (fichero.exists())
				return true;
			else {
				System.out.println("El fichero no existe");
				return false;
			}
		else {
			System.out.println("El fichero no está inicializado");
			return false;
		}
	}

	public boolean setUbicacion(File fichero, String newPath) {
		if (validarFichero(fichero)) {
			try {
				fichero.renameTo(new File(newPath));
				return true;
			} catch (SecurityException e) {
				System.out.println("No tienes permiso para mover el fichero" + fichero.getName());
				return false;
			}
		} else
			return false;
	}

	public boolean setOwner(File fichero, String newOwner) {
		if (validarFichero(fichero)) {
			UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
			try {
				UserPrincipal user = lookupService.lookupPrincipalByName(newOwner);
				Files.setOwner(fichero.toPath(), user);
				return true;
			} catch (UserPrincipalNotFoundException e) {
				System.out.println("El usuario " + newOwner + " no existe");
				return false;
			} catch (IOException e) {
				System.out.println("Error de E/S");
				return false;
			}
		} else
			return false;
	}

}
