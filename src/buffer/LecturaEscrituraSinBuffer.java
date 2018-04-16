package buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LecturaEscrituraSinBuffer {

	public static void main(String[] args) throws IOException {
		
		long inicio = System.currentTimeMillis();
		
		InputStream is = new FileInputStream("baudelaire.pdf");
		OutputStream os = new FileOutputStream("baudelaire_copia1.pdf");
		int c;
		while ((c= is.read()) != -1 ){
			os.write(c);
		}
		is.close();
		os.close();
		
		long milis = System.currentTimeMillis() - inicio;
		System.out.format("Copiado en %.4f segundos", ((double)milis) / 1000);
			
	}
}
