package numberbase1;

import java.util.Random;

/**
 * 短路的或运算
 * @author 李泽坤
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		Random random = new Random();
		int age = random.nextInt(100);
		char sex = '女';
		if (sex=='女' || age++ >= 60) {
			System.out.println("欢迎！");
		}
		System.out.println(age);//25
		
		if (sex=='女' | age++ >= 60) {
			System.out.println("欢迎！");
		}
		System.out.println(age);//26
		
		
		
		
		
		
		
		
		
	}

}
