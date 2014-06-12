package buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LecturaEscrituraConBuffers {

	public static void main(String[] args) throws Exception {
		
		long inicio = System.currentTimeMillis();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("baudelaire.pdf"));
		BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("baudelaire_copia3.pdf") );
		
		
		inicio = System.currentTimeMillis();
		
		int c;
		while ((c = bis.read()) != -1 ){
			bos.write(c);
		}
		bis.close();
		bos.close();
		
		long milis = System.currentTimeMillis() - inicio;
		System.out.format("Copiado en %.4f segundos\n", ((double)milis) / 1000);
		
		
			
		
	}
}
