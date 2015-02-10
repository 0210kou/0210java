package chapter14;

/**
 * 銀行クラス
 * @author endo
 */
public class Bank {

	/** 銀行名（必ず3文字以上が設定される） */
	private String name;

	/**
	 * 銀行名を取得します。
	 * @return 銀行名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 銀行名を設定します。
	 * @param newName 銀行名
	 */
	public void setName(String newName) {
		if (newName == null) {
			throw new IllegalArgumentException("名前が不正です");
		}
		if (newName.length() < 3) {
			throw new IllegalArgumentException("名前が不正です");
		}
		this.name = newName;
	}

}