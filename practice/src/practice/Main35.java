package practice;

public class Main35 {
	public static void main(String[]args){
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());      //String
		System.out.println(info1.getName());			//java.lang.String
		System.out.println(info1.getPackage().getName());		//java.lang  false

		System.out.println(info1.isArray());     //false

		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());		//java.lang.object
		//なおargsは、きちんと文字配列として判定される

		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());   //true
	}

}
