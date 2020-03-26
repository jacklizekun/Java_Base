package list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * String Date Calendar之间的转换
 * @author 李泽坤
 *
 */
public class StringToDateToCalendar {
	public static void main(String[] args) throws ParseException {
		
		String dateStr = "2019-08-25";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(dateStr);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, 45);
		date = calendar.getTime();
		System.out.println(date);
		dateStr = format.format(date);
		System.out.println(dateStr);
		
	}
}
