package Methods;
/**
 * 阶乘
 * @author 李泽坤
 *
 */
public class Recurrence {
	public static void main(String[] args) {
		int result = jC(5);
		System.out.println(result);//120
	}
	
	
	//求一个数的阶乘
	public static int jC(int n) {
		//必须要有出口
		if(n == 1) {
			return 1;
		}
		else {
			return n * jC(n - 1);
		}
	}
	
}