package practice;


public class Main31 {
	public static void main(String[]args){
		//インスタンス生成
		FuncList funcList = new FuncList();

		//Func1 f1 = FuncList::isOdd;
		//Func2 f2 = funcList::addNamePrefix;

		//System.out.println(f1.call(14));
		//System.out.println(f2.call(false,"sugawara"));


		//練習6-2ラムダ式にして、代入
		Func1 f3 = (int x) -> {
			return (x % 2 == 1);
		};

		Func2 f4 = (boolean male,String name) ->{
			if(male == true){
				return "Mr." + name;
			}else{
				return "Ms." + name;
			}
		};
		System.out.println(f3.call(13));
		System.out.println(f4.call(false, "tekitou"));
	}







}


	class FuncList{
	public static boolean isOdd(int x){
		return (x % 2 == 1);
	}

	public String addNamePrefix(boolean male, String name){
		if(male == true) {
			return "Mr." + name;
		}else {
			return "Ms." + name;
		}
	}


}


/*
//Func1の処理
  import java.util.function.IntPredicate;

		IntPredicate func1 = FuncList::isOdd;
		boolean iti = func1.test(5);
		System.out.println(iti);

		//Func2の処理
		func2 = (boolean a, String b) ->{

		}
	} */
