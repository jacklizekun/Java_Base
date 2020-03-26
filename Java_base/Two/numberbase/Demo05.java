package numberbase;

import java.util.Scanner;
/**
 * 数学类
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("输入下落时间：");
		double t = console.nextDouble();//从控制台读取double数据
		double g = 9.8;
		double s;
		s = (g*g*t)/2;
		System.out.println("位移："+s);
		
		Scanner console2 = new Scanner(System.in);
		System.out.println("输入下落距离：");
		double s2 = console2.nextDouble();
		double t2;
		t2 = Math.sqrt((2*s2)/g);
		System.out.println("下落时间："+t2);		
	}
}
