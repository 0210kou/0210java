package practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main49 {
	public static void main(String[]args)throws IOException{


		final String s2 = ("C:\\pleiades\\workspace\\practice\\src\\practice\\dj.ico");

		URL ur1 = new URL("http://dokojava.jp/favicon.ico");

		InputStream is = ur1.openStream();

		OutputStream os = new FileOutputStream(s2);

		int i = is.read();
		while(i != -1){
			os.write((byte) i);
			i = is.read();

		}
			is.close();
			os.flush();
			os.close();

	}
}
