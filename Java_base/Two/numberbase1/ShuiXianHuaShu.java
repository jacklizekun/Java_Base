package numberbase1;

import java.util.Scanner;
/**
 * 练习：输出指定范围内的所有水仙花数！
 * @author 李泽坤
 *
 */
public class ShuiXianHuaShu {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.print("请输入查找水仙花的范围：0～～" );
		int max = scanner.nextInt();
		scanner.close();
		for (int n = 0; n <= max; n++) {
			int sum = 0;
			for (int m = n; m > 0; m /= 10) {
				
				int v = m % 10;
				sum += v * v * v;
			}
			if (n == sum) {
				System.out.print(n + "\n");
			}
			
		}
	}

}
