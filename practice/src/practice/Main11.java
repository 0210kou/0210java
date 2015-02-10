package practice;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main11 {
	public static void main(String[]args){
		Date now = new Date();

		//System.out.println(now);

		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		//System.out.println(day);
		int day2 = day + 100;
		Date d = new Date(day2);
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = f.format(now);
		System.out.print(s);



	}
}
