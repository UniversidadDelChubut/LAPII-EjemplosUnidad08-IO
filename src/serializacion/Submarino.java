package serializacion;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

public class Submarino implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String nombre;
	private int profundidad;
	
	private transient InputStream in;
	
	public Submarino(){
		this.in = System.in;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
	
	
}
