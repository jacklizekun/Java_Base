package base;
/**
 * Integer
 * Integer是Java API提供的包装类，提供整数处理的工具方法<BR>
 * Integer.toBinaryString(n)将整数转换成二进制字符串
 * @author 李泽坤
 *
 */
public class Number {

	public static void main(String[] args) {
		int n1 = 222;
		int n2 = 195;
		int n3 = 1024;
		//转成二进制
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));
		System.out.println(Integer.toBinaryString(n3));
		
		
		System.out.println(~-4);
		System.out.println(~4);
		System.out.println(~100);
		
		
		
		System.out.println(Integer.toBinaryString(-129));
		System.out.println(Integer.toBinaryString(-128));
		System.out.println(Integer.toBinaryString(-3));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(3));
		System.out.println(Integer.toBinaryString(128));
		System.out.println(Integer.toBinaryString(129));
		
		//0x是16进制的前缀
		//16进制的最大值
		int max = 0x7fffffff;
		System.out.println(max);
		System.out.println(Integer.toBinaryString(max));
		
		//16进制的－1
		int fu1 = 0xffffffff;
		System.out.println(fu1);
		System.out.println(Integer.toBinaryString(fu1));
		
		//16进制的－2
		int fu2 = 0xfffffffe;
		System.out.println(fu2);
		System.out.println(Integer.toBinaryString(fu2));
		
		//16进制的最小值
		int min = 0x80000000;
		System.out.println(min);
		System.out.println(Integer.toBinaryString(min));		
	}
}
