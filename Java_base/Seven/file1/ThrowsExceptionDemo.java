package file1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 异常种类
 * 
 * @author 李泽坤
 * 
 */
public class ThrowsExceptionDemo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		/*
		 * 注意，永远不要将throws定义在main方法上！
		 * 将异常抛至虚拟机会导致程序中断。
		 */
		try {
			stringToDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}

	public static void stringToDate(String str) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(str);
		System.out.println(date.getTime());
	}
}
