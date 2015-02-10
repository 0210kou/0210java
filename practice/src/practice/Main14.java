package practice;
import java.util.HashSet;
import java.util.Set;

public class Main14 {
	public static void main(String[]args){
		Set<String> color = new HashSet<String>()
;
		color.add("赤");
		color.add("青");
		color.add("黄");
		color.add("赤");
		color.add("緑");
		color.add("青");
		System.out.println
		("色は" + color.size() + "種類");
		for(String s : color){
			System.out.println(s + "->");
		}
	}
}
