package numberbase1;

import java.util.Random;
//import java.util.Scanner;

/**
 * 闰年算法
 * @author 李泽坤
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		while (true) {
			//Scanner scanner = new Scanner(System.in);
			//System.out.print("请输入年份：");
			Random random = new Random();
			boolean isLeapYear;
			int year = random.nextInt(222) + 1970;//2000
			//int year = scanner.nextInt();
			isLeapYear = (year % 4 == 0 && year % 100 != 0)
					|| (year % 400 == 0);
			//isLeapYear =(year%4==0 && !(year%100=0)||(year%400==0);
			if (isLeapYear) {
				System.out.println(year);
				System.out.println("是闰年！");
			} else {
				System.out.println(year);
				System.out.println("不是闰年！");
			}
		}		
	}

}
