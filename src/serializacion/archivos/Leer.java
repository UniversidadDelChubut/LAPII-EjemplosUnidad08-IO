package serializacion.archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import serializacion.Submarino;

public class Leer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		InputStream is = new FileInputStream("submarino.data");
		ObjectInputStream ois = new ObjectInputStream (is);
		Submarino submarino = (Submarino) ois.readObject();
		
		System.out.println(submarino.getNombre() + " esta a " + submarino.getProfundidad() + " pies de profundidad");
		
	}
}
