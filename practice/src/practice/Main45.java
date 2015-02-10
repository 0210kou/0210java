package practice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main45 {
	public static void main(String[]args)throws IOException{
		Reader fr = new FileReader
				("C:\\pleiades\\workspace\\practice\\src\\practice\\hero.properties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("heroname");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.print("勇者の名前" + name);
		System.out.print("勇者のHP" + hp);
		fr.close();

	}
}
