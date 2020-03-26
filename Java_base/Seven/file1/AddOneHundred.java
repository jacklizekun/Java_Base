package file1;
/**
 * static方法
 * @author 李泽坤
 *
 */
public class AddOneHundred {
	public static int add(int n){
		int sum = 0;
		if(n == 1)
			sum = 1;
		else{
			sum = n+add(n-1);
			System.out.println(sum);
		}	
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(100));
	}
}
