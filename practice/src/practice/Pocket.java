package practice;


/*
public class Pocket {
	public Object data;
	public void put(Object d){
		this.data = d;
	}
	public Object get(){
		return this.data;
	}
}


*/


/*
public class Pocket<e>{
	private e data;
	public void put(e d){
		this.data = d;
	}
	public e get(){
		return this.data;
	}
}
*/

public class Pocket<String>{
	private String data;
	public void put(String d){
		this.data = d;
	}
	public String get(){
		return this.data;
	}
}


/*
class Main26{
	public static void main(String[]args){
		Pocket p = new Pocket();
		p.put("1192");
		String s = (String) p.get();
		System.out.println(s);
	}
}

*/




class Main27{
	public static void main(String[]args){
		Pocket<String> p = new Pocket();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}
}
