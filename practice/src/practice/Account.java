package chapter14;

/**
 * リスト 14-1 湊くんが作成したAccountクラス
 * @author endo
 */
public class Account {

	/** 口座名義人 */
	String owner;
	/** 口座残高 */
	int balance;

	/**
	 * コンストラクタ
	 * @param owner 口座名義人
	 * @param balance 口座残高
	 */
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}

	/**
	 * 送金する
	 * @param dest 口座
	 * @param amount 金額
	 */
	public void transfer(Account dest, int amount) {
		dest.balance += amount;
		balance -= amount;
	}

}