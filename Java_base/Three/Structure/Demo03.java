package Structure;

import java.util.Random;
import java.util.Scanner;
/**
 * 练习：猜数字游戏
 * @author 李泽坤
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int num;
		int answer;
		int count = 0;
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		num = random.nextInt(100)+1;
		System.out.println("亲，欢迎使用猜数字游戏！");
		for (;;) {
			System.out.println("猜吧：");
			answer = in.nextInt();
			count++;
			if (num == answer) {
				System.out.println("(@_@)大神阿！对了！次数："+count);
				break;
			}else if(-1 ==answer){
				System.out.println("谢谢你的参与！再见!");
				break;
			}else {
				if (answer > num) {
					System.out.println("猜大了！次数："+count);
				}else if(answer < num){
					System.out.println("猜小了！次数："+count);
				}
			}
		}		
	}

}
