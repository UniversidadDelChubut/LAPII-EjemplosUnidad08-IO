package inputstreamvsinputstreamreader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class ConInputStreamReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		
		System.out.println(Charset.defaultCharset());
		
		for ( String nombre :Charset.availableCharsets().keySet() ){
			System.out.println("  -> " + nombre);
		}
		
		
		InputStreamReader r = null;
		if (args.length == 0) {
			r = new InputStreamReader (System.in);
		} else {
			r = new InputStreamReader (System.in, args[0]);
		}
		int c;
		while ((c = r.read()) != -1 ){ 
			System.out.format("%c %x  - ", c , c);
		}
		
	}

}
