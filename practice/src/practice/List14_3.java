package chapter14;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * リスト 14-3 JUnit(バージョン4系)のためのテストケース
 * @author endo
 */
public class List14_3 {

	/**
	 * 実際にAccountをnewして使ってみるテスト
	 */
	@Test
	public void instantiate() {
		Account a = new Account("ミナト", 30000);
		assertEquals(30000, a.balance);
	}

	@Test
	public void transfer() {
		// TODO 自動生成されたメソッド・スタブ
	}

}