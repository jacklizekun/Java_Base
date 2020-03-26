package date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * DateFormat
 * @author 李泽坤
 *
 */
public class DateFormatDemo {
	public static void main(String[] args) {
		//创建当前系统时间
		Date now = new Date();
		System.out.println(now);
		/**
		 * getDateInstance(int format,)
		 * 参数1：转换为字符串后的信息格式
		 * 参数2：对应的地区
		 * 
		 * 参数1对应的DateFormat的常量
		 * 		SHORT：信息量较少
		 * 		MEDIUM:信息量中等，通常使用这项
		 * 		LONG:信息量多
		 * 
		 * 
		 */
		
		DateFormat df1 = 
				DateFormat
				.getDateInstance(DateFormat.LONG,Locale.CHINA);
		
		String str = df1.format(now);
		System.out.println(str);
		
		
	}
}
