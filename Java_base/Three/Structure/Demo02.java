package Structure;

/**
 * 练习：找到100~999之间的全部水仙花数（3位自幂数）
 * @author 李泽坤
 *
 */
public class Demo02 {
	public static void main(String[] args) {

		for (int n=100;n<=999;n++) {
			//int n= 153;
			int num = n;
			int sum = 0;
			do {
				int last = num % 10;
				sum += last * last * last;
				num /= 10;
				//System.out.println(last+","+num+","+sum);
			} while (num != 0);
			if (sum == n) {
				System.out.println(n + "是水仙花数！");
			}
		}
	}		
}
