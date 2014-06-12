package serializacion.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import serializacion.Submarino;

public class Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		ObjectInputStream ois = new ObjectInputStream (is);
		
		Submarino submarino = (Submarino) ois.readObject();
		System.out.println(submarino.getNombre() + " esta a " + submarino.getProfundidad() + " pies de profundidad");		
		
		
	}
}
