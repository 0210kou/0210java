package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

class Bookone implements Comparable<Bookone>{
	private String title;
	private Date publishDate;
	private String comment;

	//geter seter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}





	//コンストラクタ
	public Bookone(String title, Date publishDate) {
		this.title = title;
		this.publishDate = publishDate;
	}


	/////////////////HashCodeBuilder
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this);


	}
		/*
		int r = 1;
		r = 31 * r + publishdate.hashCode();
		r = 31 * r + title.hashCode();
		return r;		*/


	/////////////EqualsBuilder
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this,o);
	}


	///////////////CompareToBuilder
	public int compareTo(Bookone o){
		return CompareToBuilder.reflectionCompare(this,o);
	}
}
////MainClassでメソッド読み出し検証

public class Main39 {
		public static void main(String[] args) throws InterruptedException {

			// 1. 等価チェック
			Date now = new Date();
			Bookone b1 = new Bookone("Java", now);
			Bookone b2 = new Bookone("Java", now);
			System.out.println("等しいこと：" + b1.equals(b2));

			b2 = new Bookone("スッキリ", now);
			System.out.println("等しくないこと：" + b1.equals(b2));

			b2 = new Bookone("Java", new Date());
			System.out.println("等しくないこと：" + b1.equals(b2));

			// 2. 発効日の古い順
			List<Bookone> Bookoneones = new ArrayList<>();
			Bookone b3 = new Bookone("Bookone3", new Date());
			Thread.sleep(1000);
			Bookone b4 = new Bookone("Bookone4", new Date());
			Thread.sleep(1000);
			Bookone b5 = new Bookone("Bookone5", new Date());
			Thread.sleep(1000);
			Bookone b6 = new Bookone("Bookone6", new Date());
			Thread.sleep(1000);
			Bookone b7 = new Bookone("Bookone7", new Date());
			Bookoneones.add(b4);
			Bookoneones.add(b5);
			Bookoneones.add(b7);
			Bookoneones.add(b6);
			Bookoneones.add(b3);

			Collections.sort(Bookoneones);
			for (Bookone b : Bookoneones) {
				System.out.print(b.getTitle() + " ⇒ ");
			}



		}

}
