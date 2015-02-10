package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Main43 {
	public static void main(String[]args){
		FileWriter fw = null;

		try {
			fw = new FileWriter("C:\\Users\\Owner\\Desktop\\新しいフォルダー\\0122.txt",true);
			fw.write('g');
			fw.flush();

		} catch (IOException e) {
			System.out.println("書き込みエラーです");
			// TODO: handle exception

		}finally {
			if(fw != null){
				try {
					if (fw != null) {
						fw.close();
					}
				} catch (IOException e2) {
					// TODO: handle exception
				}
			}
		}



	}
}