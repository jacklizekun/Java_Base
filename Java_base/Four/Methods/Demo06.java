package Methods;
/**
 * final变量
 * @author 李泽坤
 *
 */
public class Demo06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final int a;//声明/定义 局部变量
		int b;
		a = 5;//初始化
		
		
		//a = 8;//编译错误，不能再修改!
		b = 8;
		test(6, 8);
	}
	public static  void test(final int a,int b) {
		//a = 5;//编译错
		b = 6;
		System.out.println(a+","+b);
	}
}
