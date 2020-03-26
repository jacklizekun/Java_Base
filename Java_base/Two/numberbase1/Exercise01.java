package numberbase1;

import java.util.Random;

/**
 * 练习
 * 判断一个数是否为质数，如果不是质数则输出其具有的约数
 * @author 李泽坤
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(10000);
		int count = 0;
		for (int i = 2; i < n/2; i++) {
			if (0 == (n%i)) {
				++count;
				System.out.println(i);
			}
		}
		if (count > 0 ) {
			System.out.println(n + "不是质数！！");
			System.out.println("一共有"+count+"个约数");
		}else {
			System.out.println(n + "是质数！！");
		}
		
	}
}