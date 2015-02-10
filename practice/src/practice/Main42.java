package practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main42 {
	public static void main(String[]args)throws IOException{
		FileOutputStream fos = new FileOutputStream
				("C:\\Users\\Owner\\Desktop\\新しいフォルダー\\0120.txt",true);
		fos.write(65);
		fos.flush();
		fos.close();
	}
}
