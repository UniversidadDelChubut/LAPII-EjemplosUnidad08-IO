package inputstreamvsinputstreamreader;
import java.nio.charset.Charset;


public class ConInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(Charset.defaultCharset());
		
		int c;
		while ((c = System.in.read()) != -1 ){ 
			System.out.format("%c %x  - ", c , c);
		}
		
	}

}
