package practice;

import java.io.FileReader;
import java.io.IOException;

public class Main41 {
	public static void main(String[]args)throws IOException{
		FileReader fw = new FileReader("C:\\Users\\Owner\\Desktop\\新しいフォルダー\\0122.txt");
		System.out.println("すべてのデータを読み込んで表示します");
		int i = fw.read();
		while(i != 1){
			char c = (char) i;
			System.out.println(c);
			i = fw.read();

		}
		System.out.println("ファイルの末尾に到達しました");
		fw.close();
	}
}
