package numberbase;

import java.util.Scanner;
/**
 * 数学类
 * @author 李泽坤
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double s;
		double t;
		double g = 9.8;
		System.out.println("输入下落距离：");
		s = console.nextDouble();
		t = Math.sqrt((2*s)/g);
		System.out.println("下落时间："+t);
	}

}
