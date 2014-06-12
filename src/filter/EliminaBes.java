package filter;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class EliminaBes extends FilterReader {
	
	public EliminaBes(Reader in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int c;
		
		while ((c = super.read()) != -1 && Character.toUpperCase((char)c) == 'B' )
			;
		
		return c;
	}
	
	public static void main(String[] args) throws IOException {
		Reader r = new EliminaBes( new StringReader(args[0]) );
		
		int c;
		while ((c = r.read()) != -1 )
			System.out.print((char)c);
		System.out.println();
	}
	
}
