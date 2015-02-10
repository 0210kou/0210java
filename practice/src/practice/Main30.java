package practice;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

public class Main30 {
	public static void main(String[]args){
		//２つの引数の差を求める処理の実体を生み出し、代入する
		IntBinaryOperator func = (int a, int b) -> {return a-b;};
		int a = func.applyAsInt(5,3);
		System.out.println("5-3は" + a );


	}
	double b = 1.41;
	IntToDoubleFunction funcfunc = (x) -> {
		return x * x * b;
	};
}
