package practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main48 {
	public static void main(String[]args)throws IOException{
	try{
		Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	Connection con = null;
	try{
		//step1:データベースの接続
		con = DriverManager.getConnection("jbdc:h2:~/test/mytable");
		//step2:SQL送信処理
		/*
		 *
		 * メインのDB操作処理後述します。
		 */
		//step2-1-1 送信すべきSQLの雛形準備
				PreparedStatement pstmt = con.prepareStatement
						("DELETE FROM MONSTERS WHERE HP <= OR NAME =?");
				//step2-1-2 雛形に値を流し込みSQL文を組み立て送信する
				pstmt.setInt(1,10);
				pstmt.setString(2,"ゾンビ");
				int r = pstmt.executeUpdate();

				//step2-1-3処理結果を判定する
				if(r !=0){
					System.out.println(r +"件のモンスターを削除しました");

				}else {
					System.out.println(r +"該当するモンスターはいませんでした");
				}
				pstmt.close();
				//step2-2-1 送信すべきSQL文の雛形を準備
				PreparedStatement pstmt = con.prepareStatement
						("SELECT * FROM MONSTERS WHERE HP >= ?");


				//step2-2-2 雛形に値を流し込みSQL文を組み立てて送信する
				pstmt.setInt(1,10);       //１番目の？に１０を流し込む
				ResultSet rs =pstmt.executeQuery();

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



				if(rs.next()){
					System.out.println("ゴブリンのHPは" + rs.getInt("HP"));

				}else {
					System.out.println("ゴブリンのHPはDBに存在しません");
				}

	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		//step3データベース接続の切断
		if(con != null){
			try{
				con.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
 }
}
