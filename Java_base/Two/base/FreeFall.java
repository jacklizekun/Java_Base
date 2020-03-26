package base;

import java.util.Scanner;
/**
 * Scanner.nextDouble
 * @author 李泽坤
 *
 */
public class FreeFall {
	public static void main(String[] args) {
		//输入流
		Scanner scanner = new Scanner(System.in);
		double g = 9.80;
		System.out.println("请输入自由下落的时间：");
		//获取输入的Double类型
		double t = scanner.nextDouble();
		double s = 0.5*g*t*t;
		//s = Math.round(10*s)/10.0;
		System.out.println(t + "秒后，物体自由下落了" + s + "米");
	}
}
