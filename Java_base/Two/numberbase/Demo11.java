package numberbase;
/**
 * 自动类型转换
 * @author 李泽坤
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		int i = -1;//i是32位数
		long l = i;//l是64位数，发生符号位扩展现象，精度发生变化
		System.out.println(l);//-1
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		//自动转型
		System.out.println(Long.toBinaryString(i));
		
		byte b = -1;
		System.out.println(Long.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b));
		
		b = 5;
		System.out.println(Long.toBinaryString(b));
		
		//强制类型转换：大类型到小类型的转换
		l = 5;
		i = (int)l;
		System.out.println(i);//5
		
		l = 0xff00000005L;
		System.out.println(l);
		i = (int)l;//超过整数范围，发生高位溢出现象
		System.out.println(i);
		//强制类型转换也会发生精度损失
		double pi = 3.1415926535897932384 * 10000;
		float f = (float)pi;
		l = (long)pi;//强制类型转换，无法实现4舍5入
		
		System.out.println("pi="+pi);
		System.out.println("f="+f);
		System.out.println("l="+l);
		
		l = (long)(pi+0.5);//利用强制类型转换实现4舍5入
		System.out.println("l="+l);//4舍5入	
	}
}
