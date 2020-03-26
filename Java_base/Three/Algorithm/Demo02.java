package Algorithm;
/**
 * 递归
 * @author 李泽坤
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int n = 6;
		//int n = 100000;//内存被撑爆了！
		int y = f(n);
		System.out.println(y);
	}
	public static int f(int n){
		if (1 == n) {
			return 1;
		}		
		return n+f(n-1);
	}
}
