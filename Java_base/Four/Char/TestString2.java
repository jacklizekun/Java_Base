package Char;

/**
 * String缓存字面量
 * @author 李泽坤
 *
 */
public class TestString2 {
	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str2 = "HelloWorld";
		
		
		String str3 = new String("HelloWorld");
		String str4 = "Hello"+"World";
		String str5 = "Hello";
		String str6 = "World";
		String str7 = str5 + str6;
		
		
		System.out.println(str1 == str2);
		//引用同一对象
		System.out.println(str1 == str3);
		//不是同一个对象
		System.out.println(str1.equals(str3));
			
		System.out.println(str1 == str4);
		//true
		System.out.println(str1 == str7);
		//false
		
		String str8 = "helloworld";
		System.out.println(str1 == str8);
		//false不是同一对象
		
		//false内容不同，区分大小写
		System.out.println(str1.equals(str8));
		//忽略大小写
		System.out.println(str1.equalsIgnoreCase(str8));
		
		
		
		
		
		
		
		
		
	}
}
