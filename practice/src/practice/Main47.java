package practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main47 {
	public static void main(String[]args)throws IOException{


		final String s2 = ("C:\\pleiades\\workspace\\practice\\src\\practice\\dj.ico");
		//ホスト名、ポート指定しインスタンスを生成
		//Socket sock = new Socket("http://dokojava.jp/favicon.ico",80);
		URL ur1 = new URL("http://dokojava.jp/favicon.ico");
		//Socketから入力、出力ストリームを受け取る
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









/*
		os.write("GET/favicon.ico/1.0\r\n".getBytes());
		os.write("\r\n".getBytes());
		os.flush();


		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();

		//fileの最後が-1で返ってくるので最後になるまで繰り返し
		while(i != -1){
			System.out.println((char) i);

		//読込んだデータを出力



		}
		isr.close();

		final String s2 = ("C:\\pleiades\\workspace\\practice\\src\\practice\\dj.ico");




		osr.write(is);
		osr.flush();
		osr.close();

		sock.close();
	}
}

		*/