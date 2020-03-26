package numberbase1;

import java.util.Scanner;

/**
 * 条件运算符
 * @author 李泽坤
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner =new Scanner(System.in);
			
		while (true) {
			System.out.print("输入a b c（空格分隔）：");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			int max = a > b ? a : b;
			max = max > c ? max : c;
			System.out.println("最大值：" + max);
		}	
	}

}
