package base;

import java.util.Random;
import java.util.Scanner;
/**
 * 加法
 * @author 李泽坤
 *
 */
public class Add {
	public static void main(String[] args) {
		//获取键盘输入
		Scanner console = new Scanner(System.in);
		//随机数
		Random r = new Random();
		//在10内随机整数
		int a = r.nextInt(10);
		int b = r.nextInt(10);
		System.out.print(a+"+" + b + "=?");
		//获取输入的整数，不包括回车
		int c =console.nextInt();
		if (c!=a+b) {
			System.out.println("数字不错吗！");
		} else {
			System.out.println("恭喜你，可以上小学了！");
		}
		
	}
}
