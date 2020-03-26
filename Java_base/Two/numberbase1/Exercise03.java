package numberbase1;

import java.util.Scanner;

/**
 * 练习
 * 水仙花数
 * @author 李泽坤
 *
 */
public class Exercise03 {
	public static void main(String[] args) {
		System.out.println("请输入要查找的范围：");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		for (int n = 0; n < max; n++) {
			int temn = n;
			int last = temn % 10;
			temn /= 10;
			int s = 0;
			for (int i = 0; i < 10; i++) {
				s = (int) (s + Math.pow(last, 3));
				last = temn % 10;
				temn /= 10;
			}
			if (n == s) {
				System.out.println(n + "是水仙花数！！");
			}
		}	
	}
}
