package practice;
import java.util.Set;
import java.util.TreeSet;

public class Main15 {
	public static void main(String[]args){
		Set<String> word = new TreeSet<String>();

		word.add("dog");
		word.add("cat");
		word.add("wolf");
		word.add("panda");
		word.add("animal");
		for(String s : word){
			System.out.println(s + "->");
		}
	}
}