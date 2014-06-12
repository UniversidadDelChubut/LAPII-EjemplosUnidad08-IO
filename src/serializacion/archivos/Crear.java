package serializacion.archivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import serializacion.Submarino;

public class Crear {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Submarino submarino = new Submarino();
		submarino.setNombre("Nautilus");
		submarino.setProfundidad(120);
		
		FileOutputStream os = new FileOutputStream("submarino.data");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(submarino);
		
		oos.close();
	}
	

}
