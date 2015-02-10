package practice;

public class Main29 {
	public static int sub(int a, int b){
		return a-b;
	}
	public static void main(String[]args){
		MyFunction func = Main29::sub;
		int a = func.call(5, 3);
		System.out.println("5-3は" + a);
	}
}
