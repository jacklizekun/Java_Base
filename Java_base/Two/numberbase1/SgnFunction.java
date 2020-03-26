package numberbase1;

import java.util.Scanner;
/**
 * 练习
 * @author 李泽坤
 *
 */
public class SgnFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("符号函数sgn(x)");
		System.out.println("请输入x的值(double)");
		double x = scanner.nextDouble();
		
		int sgn = x > 0 ? 1 :(x < 0 ? -1 : 0);
		System.out.println("sgn(" + x + ")=" + sgn);		
	}

}
