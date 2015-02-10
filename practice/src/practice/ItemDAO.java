package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDAO {
	public static ArrayList<Item01> findByMinimumPrice(int i) {


		ArrayList<Item01> items = new ArrayList<Item01>();



	try{
		Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	Connection con = null;


	try{
		//データベース接続
		con = DriverManager.getConnection("jbdc:h2:~/test");


		//SQL処理内容

		//送信すべきSQL文の雛形を準備
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE > 1");

		//SQL文を送信する
		pstmt.setInt(i,1);
		ResultSet rs = pstmt.executeQuery();

		//結果表を処理する(priceの値が1以上なので複数行検索をかける)
		while(rs.next()){
			//System.out.printf(rs.getString(name),rs.getInt("PRICE"),rs.getInt("WEIGHT"));
			Item01 item = new Item01();      //Item01クラスのインスタンスを生成
			item.setName(rs.getString("NAME"));    //
			item.setPrice(rs.getInt("PRICE"));
			item.setWeight(rs.getInt("WEIGHT"));
			items.add(item);



		rs.close();
		pstmt.close();
		return items;
		}

	}catch(SQLException e){
		e.printStackTrace();

	}finally {
		//データベース接続の切断
		if(con != null) {
			try{
				con.close();
			}catch (SQLException e2){
				e2.printStackTrace();
			}
		}
	}
	return items;




	}

}
