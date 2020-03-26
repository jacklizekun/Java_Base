package Constructor;

/**
 * 重载
 * 方法名相同，参数不同
 * @author 李泽坤
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Qoo q = new Qoo();
		q.test(1);
		q.test(1L);
	}
}	

class Qoo{
	public void test(int a) {
		System.out.println("test(int)");
	}
	public void test(long a) {
		System.out.println("test(long)");
	}
}