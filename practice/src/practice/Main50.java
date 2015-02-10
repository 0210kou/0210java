package practice;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main50 {
	public static void main(String[]args)throws Exception{


		con = DriverManager.getConnection("jbdc:h2:~/test/mytable");


		//step2-2-1 送信すべきSQL文の雛形を準備
		PreparedStatement pstmt = con.prepareStatement
				("SELECT * FROM MONSTERS WHERE HP >= ?");
		
		
		//step2-2-2 雛形に値を流し込みSQL文を組み立てて送信する
		pstmt.setInt(1,10);       //１番目の？に１０を流し込む
		ResultSet rd = pstmt.executeQuery();
		
		//step2-2-3 結果を処理する
		/*
		 * 結果表の処理
		 * 
		 * 
		 */
		while(rs.next()){
			System.out.println(rs.getString("NAME"));
		}
		rs.close();
		pstmt.close();
	}
}
