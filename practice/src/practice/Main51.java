package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main51 {
	public static void main(String[]args){




		//step 0 :事前準備(JAR配置を含む)
		try{
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}







		Connection con = null;
		try {
			//step1 データベースの接続
			con = DriverManager.getConnection("jbdc:h2~/MONSTERS");
			con.setAutoCommit(false);

			//step2 SQL送信処理
			/*
			 *
			 *
			 *
			 * メインDBの処理（SQL送信）
			 *
			 *
			 */
			con.commit();


		}catch(SQLException e){
			try{
				con.rollback();

			}catch(SQLException e2){
				e2.printStackTrace();

			}finally {
				//step3 データベース接続の切断
				if(con != null){
					try{
						con.close();

					}catch(SQLException e3){
						e3.printStackTrace();

					}
				}
			}
		}
	}
}
