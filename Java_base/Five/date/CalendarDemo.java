package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 日历类
 * @author 李泽坤
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//java.util.Calendar
		Calendar calendar = Calendar.getInstance();
		//Calendar cal = new GregorianCalendar();
		
		System.out.println(calendar);
		/**
		 * 将Calendar转换为Date
		 * Calendar.getTime()
		 * 将Calendar描述的时间转换为一个Date对象。
		 * 
		 */
		//Date date = new Date();
		Date date = calendar.getTime();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//输出转换后的字符串
		System.out.println(format.format(date));
		calendar.set(Calendar.YEAR, 2019);
		//月份从0开始
		calendar.set(Calendar.MONTH, 13);
		calendar.set(Calendar.DATE, 21);
		calendar.set(Calendar.DAY_OF_MONTH, 21);
//		calendar.set(Calendar.HOUR, 22);
		date = calendar.getTime();
		System.out.println(format.format(date));
		
		int year = calendar.get(Calendar.YEAR);
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("现在是"+year+"年的第"+dayOfYear+"天");
		
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		int max = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(year+"年有："+max+"天");
		
		
		Calendar now = Calendar.getInstance();
		//Calendar表示的日期所处年的最大天数
		System.out.println("最大天数："+now.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println(now.get(Calendar.MONTH)+"月中最大天数："+now.getActualMaximum(Calendar.DAY_OF_MONTH));
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日");
		Date date2 = now.getTime();
		String test = format2.format(date2);
		System.out.println(test);
		//System.out.println(now);
		now.set(Calendar.MONTH, Calendar.FEBRUARY);
		System.out.println("2月中最大天数："+now.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}
		
}
