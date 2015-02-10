package practice;
import java.util.HashMap;
import java.util.Map;


class Hhero{
	private String name;
	private int teki;

	//ObjectクラスのtoStringをオーバーロードさせる
	public String toString(){
		return "勇者(名前=" + this.name + "/TEKI=" + this.teki + ")";
	}

	public Hhero(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public Hhero(int teki){
		this.teki = teki;
	}
	public int getTeki(){
		return this.teki;
	}
}

public class Main20 {
	public static void main(String[] args){
		Hhero h = new Hhero("Hero11");
		Hhero h1 = new Hhero("Hero22");
		System.out.println(h);

		Map<String, Integer> heroes = new HashMap<String, Integer> ();

		heroes.put("saitou",3);
		heroes.put("suzuki",7);

			for(String key: heroes.keySet()){
				int value =  heroes.get(key);
				System.out.println(key + "が倒した敵" + value);



			}

	}
}
