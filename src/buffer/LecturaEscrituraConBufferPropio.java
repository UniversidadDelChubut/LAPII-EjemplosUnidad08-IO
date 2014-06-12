package buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LecturaEscrituraConBufferPropio {

	public static void main(String[] args) throws Exception {
		
		long inicio = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("baudelaire.pdf");
		FileOutputStream fos = new FileOutputStream("baudelaire_copia2.pdf");
		
		byte[] buffer = new byte [1024];
		
		int leidos;
		while ((leidos = fis.read(buffer)) != -1 ){
			fos.write(buffer, 0, leidos);
		}
		fis.close();
		fos.close();
		
		long milis = System.currentTimeMillis() - inicio;
		System.out.format("Copiado en %.4f segundos", ((double)milis) / 1000);
		
		
		
			
		
	}
}
