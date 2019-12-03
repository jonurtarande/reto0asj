package BiblioBidebarrieta;

import java.util.Date;

public class Libro {
	private String nombre;
	private String autor;
	private Date fechaPubli;
	private int numPaginas;
	public Libro() {
		
	}
	public Libro(String nombre, String autor, Date fechaPubli, int numPaginas) {
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
	public Date getFechaPubli() {
		return fechaPubli;
	}
	public void setFechaPubli(Date fechaPubli) {
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
		return super.toString();
	}
	
}
