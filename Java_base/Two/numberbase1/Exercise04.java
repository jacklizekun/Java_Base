package numberbase1;

import java.util.Random;
import java.util.Scanner;

/**
 * 练习
 * 猜数游戏
 * @author 李泽坤
 *
 */
public class Exercise04 {
	public static void main(String[] args) {
		Random random = new Random();
		int shu = random.nextInt(100);

		for (;;) {
			System.out.print("请输入你猜测的数字：");
			Scanner scanner =new Scanner(System.in);
			int guess = scanner.nextInt();
			if (shu == guess) {
				System.out.println("猜对了！！恭喜！");
				break;
			}else if (-1 == guess) {
				System.out.println("谢谢您的参与，再见！！");
				break;
				
			}else {
					if (guess > shu) {
						System.out.println("你猜的数太大了，试试小一点的数！！"+"\n");
					} else {
						System.out.println("猜的数太小，请重新猜！！"+"\n");
					}
					continue;
				}
		}	
	}

}
