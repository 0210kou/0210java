package chapter14;

/**
 * リスト 14-5 必ずAssertionErrorが起こるはずのコード
 * @author endo
 */
public class List14_5 {

	public static void main(String[] args) {
		System.out.println("アサートにわざと失敗します。");
		assert 1 == 0;
		System.out.println("正常修了します。");
	}
}