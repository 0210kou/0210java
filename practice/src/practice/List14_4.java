package chapter14;

/**
 * リスト 14-4 アサーションを用いたコードの例
 * @author endo
 */
public class List14_4 {

	public static void main(String[] args) {
		List14_4 acount = new List14_4();
		acount.transfer(new Account("テスト", 1000), 10000);
	}

	/** 口座残高 */
	int balance;

	/**
	 * 送金する
	 * @param dest 口座
	 * @param amount 金額
	 */
	public void transfer(Account dest, int amount) {
		// ・・・送金処理の記述・・・（残高不足の場合は例外を送出）
		this.balance = -10000;
		System.out.println("正常に送金完了しました。"+balance);
		assert this.balance >= 0;
	}

}