package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 * @author 李泽坤
 *
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * 创建SimpleDateFormat实例时，我们需要传入一个 字符串，这个字符串是用来描述转换的格式的。
		 */
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 E HH:mm:ss");
		//java.util.Date
		Date nowDate = new Date();
		//当前系统时间
		System.out.println(nowDate);
		
		//将Date转换成字符串
		String nowString = format2.format(nowDate);
		System.out.println(nowString);
		
		//定义一个日期字符串
		String dateString = "09-20-1999 13:29:30";
		SimpleDateFormat format3 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		/*
		 * 将字符串以日期格式字符串的要求进行解析，
		 * 转换为对应的Date对象
		 */
		Date date = format3.parse(dateString);
		System.out.println(date);
		
	}
}
