package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class Main46 {
	public static void main(String[]args)throws IOException{
		String path = "C:\\pleiades\\workspace\\practice\\src\\practice\\hero.properties";

		Writer fw = new FileWriter
				(path,true);
		Properties p = new Properties();
		p.setProperty("heroname" , "アサカ");
		p.setProperty("heroHp" , "62");
		p.setProperty("heroMp" , "45");
		p.store(fw,"勇者の情報");
		fw.close();





		Reader fr = new FileReader
				(path);
		Properties p1 = new Properties();
		p.load(fr);
		String name = p.getProperty("heroname");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.print("勇者の名前" + name);
		System.out.print("勇者のHP" + hp);
		fr.close();
	}
}
