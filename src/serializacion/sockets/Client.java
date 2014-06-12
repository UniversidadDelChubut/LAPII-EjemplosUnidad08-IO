package serializacion.sockets;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import serializacion.Submarino;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Submarino submarino = new Submarino();
		submarino.setNombre("U47");
		submarino.setProfundidad(100);		
		
		Socket s = new Socket("localhost", 9999);
		OutputStream os = s.getOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(submarino);		
		
		s.close();
		
		System.out.println("Escribí y me fuí");
		
	}
}
