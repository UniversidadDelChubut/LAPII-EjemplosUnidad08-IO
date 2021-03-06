package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Código provisto por la cátedra de redes.
 * 
 * @author Redes y Seguridad Informática
 *
 */
public class ClienteTCP {

	public static void main(String args[]) {

		// args proporciona el Nombre/IP de Server Destino y el mensaje
		if (args.length != 2) {
			System.out.println("2 argumentos: servidor y mensaje");
			System.exit(1);
		}

		try {
			int puertoServicio = 12345;
			Socket s = new Socket(args[0], puertoServicio);
			DataInputStream entrada = new DataInputStream(s.getInputStream());
			DataOutputStream salida = new DataOutputStream(s.getOutputStream());
			salida.writeUTF(args[1]);
			String datos = entrada.readUTF();
			System.out.println("Recibido: " + datos);
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}