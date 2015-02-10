package chapter14;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * 銀行のテストクラス
 * @author endo
 */
public class BankTest {

	@Test
	public void インスタンスの生成() {
		Bank b = new Bank();
		assertNotNull(b);
	}

	@Test
	public void 正常系() {
		final String NEW_NAME = "テスト銀行";
		Bank b = new Bank();
		b.setName(NEW_NAME);
		assertEquals(NEW_NAME, b.getName());
	}

	@Test
	public void setName_null() {
		Bank b = new Bank();
		try {
			b.setName(null);
		} catch (NullPointerException e) {
			fail("null値の考慮をすべき");
		} catch (IllegalArgumentException e) {
			return;
		}
	}

	@Test
	public void setName_2文字() {
		Bank b = new Bank();
		try {
			b.setName("12");
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("2文字(3文字未満)はIllegalArgumentExceptionがスローされるべき");
	}

	@Test
	public void setName_3文字() {
		Bank b = new Bank();
		try {
			b.setName("123");
		} catch (IllegalArgumentException e) {
			fail("3文字(3文字以上)はIllegalArgumentExceptionはスローされない");
		}
	}
}