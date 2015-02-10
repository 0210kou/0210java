package practice;
import java.util.ArrayList;
import java.util.Iterator;
public class Main13 {
	public static void main(String[]args){
		ArrayList<String> name = new ArrayList<>();
		name.add("湊");
		name.add("朝霞");
		name.add("菅原");
		Iterator<String>it = name.iterator();
		//System.out.println(name);

		while(it.hasNext()){
			String e = it.next();
			System.out.println(e);
		}
	}
}
