package inputstreamvsinputstreamreader;
import java.io.FileInputStream;
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
		if (args.length == 1) {
			r = new InputStreamReader (new FileInputStream(args[0]));
		} else {
			r = new InputStreamReader (new FileInputStream(args[0]), args[1]);
		}
		int c;
		while ((c = r.read()) != -1 ){ 
			System.out.format("%c.", c);
		}
		
	}

}
