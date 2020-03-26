package numberbase;
/**
 * 数据范围
 * @author 李泽坤
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		int i = 5;
		byte b;
		b = 5;
		//b = 128;//编译错误，超过范围
		b = -128;//0xffffff80
		//b = i;//编译错误，int变量i,不能赋值给byte变量b
		b = (byte)i;//强制类型转换int->byte
		
		
		System.out.println(0xffffff80);//-128
		System.out.println(0x80);//128
		
		
		
		//b = 0x80;//128,编译错误，超范围！
		System.out.println(b);
		b = 0x79;//121
		System.out.println("?121=" + b);
		b = 0xffffff80;//-128
		System.out.println(b);
		//b = 0xffffff79;//-129 编译错误，超过范围！
		System.out.println(b);
		
		
		short s = 0xffff8000;
		System.out.println(s);
		
		//int x = 080;//8进制没有8！
		
		int max = 0x7fffffff;//2147483647+1=0
		System.out.println(max);
		int d = max + 1;
		System.out.println("d="+d);
		int fu1 = 0xffffffff;//-1
		System.out.println("fu1="+fu1);
		int a = max * 2 + 2;//溢出 
		int c = fu1 * 2 + 2;
		System.out.println("a="+a);
		System.out.println("c="+c);
		
	}

}
