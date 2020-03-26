package Char;

/**
 * String测试类
 * 不可变对象
 * @author 李泽坤
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = str1;
		String str3 = "World";
		str1 += str3;
		//只要对字符串进行修改，就一定会创建新对象
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}








