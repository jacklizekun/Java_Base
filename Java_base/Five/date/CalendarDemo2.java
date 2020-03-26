package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar类计算时间
 * @author 李泽坤
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar);
		//将月份加一个月
		calendar.add(Calendar.MONTH, 1);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		//对日加1
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		//减两年
		calendar.add(Calendar.YEAR, -2);
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		
		
		
	}
	
}
