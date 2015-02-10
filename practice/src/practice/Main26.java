package practice;

enum KeyType {
	PADLOCK,BUTTON,DIAL,FINGER
	}

public class Main26 {
	public static void main(String[]args){

		/*
		StrongBox s1 = new StrongBox();
		Map<String, Integer>Ktype = new HashMap<String, Integer>();
		 Ktype.put("PADLOCK",1024);
		 Ktype.put("BUTTON",10_000);
		 Ktype.put("DIAL",30_000);
		 Ktype.put("FINGER",1_000_000);
		 */

	}
}

class StrongBox<e>{
	private e item;
	private KeyType keyType;
	private long count;
 //鍵の種類を受け取るコンストラクタ
	public StrongBox(KeyType KeyType){
		this.keyType = KeyType;
	}

	public void put(e item){
		this.item = item;
	}

	public boolean get(){
		count++;

		if(count <= 1_000_000){


	}else if(count <= 30_000){


	}else if(count <= 10_000){


	}else if(count <= 1024){

	} return false;
	}
}
