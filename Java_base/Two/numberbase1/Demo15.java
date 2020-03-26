package numberbase1;

import java.util.Scanner;
/**
 * if else比较法
 * @author 李泽坤
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		int a,b,c,max;
			while (true) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("请输入3个数：");
				a = scanner.nextInt();
				b = scanner.nextInt();
				c = scanner.nextInt();
				max = a;
				if (b > max) {
					max = b;
				}
				if (c > max) {
					max = c;
				}
				System.out.println("MAX：" + max);
			}
	
		
	}

}
