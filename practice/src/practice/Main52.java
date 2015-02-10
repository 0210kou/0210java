package practice;

import java.util.ArrayList;

public class Main52 {
	public static void main(String[]args){
		System.out.println("1円以上のアイテム一覧表示します");
		ArrayList<Item01> items = ItemDAO.findByMinimumPrice(1);
		for(Item01 item : items){
			System.out.printf("%10s%4d%4d",item.getName(),item.getPrice(),item.getWeight());
		}
	}
}
