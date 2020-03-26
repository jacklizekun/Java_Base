package numberbase;

import java.util.Random;
/**
 * 随机数
 * @author 李泽坤
 *
 */
public class AddRandom {	
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(10);
		System.out.println(a);
		int b = random.nextInt(10);
		System.out.println(b);
		int c = a+b;
		System.out.println(c);
	}
}
