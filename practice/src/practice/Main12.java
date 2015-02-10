package practice;
import java.util.ArrayList;

public class Main12 {
	public static void main(String[]args){
		ArrayList<Integer> point = 
				new ArrayList<>();
		point.add(10);
		point.add(80);
		point.add(75);
		for(int i : point){
			System.out.println(i);
		}
	}
}
