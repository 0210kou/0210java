package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Main40 {
	public static void main(String[]args)throws IOException{
		FileWriter fw = new FileWriter
				("C:\\Users\\Owner\\Desktop\\新しいフォルダー\\0122.txt",true);
		fw.write('g');
		fw.flush();
		fw.close();
	}
}
