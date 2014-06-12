package file;

import java.io.File;

public class EjemploFile {

	public static void main(String[] args) {
			File f = new File("baudelaire.pdf");
			System.out.println( "existe? " + f.exists() );
			System.out.println( "Path absoluto: " + f.getAbsolutePath());
			System.out.println( "Nombre: " + f.getName());
			
			System.out.print( "Permisos: ");
			System.out.print( f.canExecute() ? "x" : "-");
			System.out.print( f.canWrite()   ? "w" : "-");
			System.out.print( f.canRead()    ? "r" : "-");
			System.out.println();
			
			
			
			File dir = new File("subdir");
			dir.mkdir();
			System.out.println( dir.getAbsolutePath() );
			
	}
}
