package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main44 {
	public static void main(String[]args)throws IOException{

		//定数宣言
		final String s1 = "C:\\Users\\Owner\\Desktop\\新しいフォルダー\\0120.txt";
		final String s2 = "C:\\Users\\Owner\\Desktop\\新しいフォルダー\\0123.txt";


		//FileInputStreamメソッド
		FileInputStream aa = new FileInputStream(s1);
		int i = aa.read();

			//fileの最後が-1で返ってくるので最後になるまで繰り返し
			while(i != -1){
			char c = (char) i;

			//読込んだデータを出力
			System.out.print(c);
			i = aa.read();

			//FileOutputStreamメソッド
			FileOutputStream bb = new FileOutputStream(s2,false);

			//メソッドの引数で指定したfileに書き込み
			bb.write(c);
			bb.flush();
			bb.close();

		}
	}

 }

