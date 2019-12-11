package main.java.Biblio1;

import java.util.Calendar;
import java.util.Date;

public class Libro {
	private String nombre;
	private String autor;
	private Calendar fechaPubli;
	private int numPaginas;
	public Libro() {
		
	}
	public Libro(String nombre, String autor, Calendar fechaPubli, int numPaginas) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.fechaPubli = fechaPubli;
		this.numPaginas = numPaginas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Calendar getFechaPubli() {
		return fechaPubli;
	}
	public void setFechaPubli(Calendar fechaPubli) {
		this.fechaPubli = fechaPubli;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro \n");
		builder.append(nombre);
		builder.append("\nautor :");
		builder.append(autor);
		builder.append("\nfechaPublicacion :");
		builder.append(fechaPubli.get(fechaPubli.DAY_OF_MONTH)+" "+fechaPubli.get(fechaPubli.MONTH)+" "+fechaPubli.get(fechaPubli.YEAR));
		builder.append("\nnum Paginas :");
		builder.append(numPaginas);
		builder.append("\n");
		return builder.toString();
	}

}
