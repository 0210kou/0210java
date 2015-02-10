package practice;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

	public class Main23{
		public static void main(String[]args){

			Set<Book> list = new HashSet<Book>();
			Book a1 = new Book();
			Book b1 = new Book();

			System.out.println(a1);
			System.out.println(b1);


			a1.title = "入門";
			list.add(a1);

			b1.title = "実践";
			list.add(b1);

			System.out.println(list.size());
			System.out.println(list.size());
			System.out.println(b1.title);
		}
	}





class Book {
	String title;
	Date publishDate;
	String comment;

	//コンストラクタ作成
	public Book(String title,Date publishDate,String comment){
	this.title = title;
	this.publishDate = publishDate;
	this.comment = comment;
	}



	public String setTitle(){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}

	public Date setPublishDate(){
		this.publishDate = publishDate;
	}
	public Date getPublishDate(){
		return this.publishDate;
	}

	public String setComment(){
		this.comment = comment;
	}
	public String getComment(){
		return this.comment;
	}


	public boolean equals(Object o){
		if(o == this){
			return true;
		}

		if(o == null){
			return false;
		}

		if(!(o instanceof Book)){
			return false;
		}
		Book b = (Book) o;



	}
}

