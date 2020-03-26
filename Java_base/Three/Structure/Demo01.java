package Structure;

/**
 * do while循环
 * @author 李泽坤
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		int num = 52833;
		int sum = 0;
		do {
			int last = num%10;
			sum = sum*10 + last;
			num /= 10;
			System.out.println(last+","+sum+","+num);
		} while (num !=0);//如果num!=0返回true就再次执行循环！
		System.out.println(sum);	
	}
}
