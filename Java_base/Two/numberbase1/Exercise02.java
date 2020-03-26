package numberbase1;
import java.util.Random;
/**
 * 练习
 * 循环
 * @author 李泽坤
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		while (true) {
			long a = 9;
			Random random = new Random();
			int n = random.nextInt(6);
			System.out.println("a="+n);
			long s = 0;
			for (int i = 0; i < n; i++) {
				s = s + a;
				a = 9 + 10 * a;
			}
			System.out.println(s);
		}	
		
	}

}
