package numberbase1;

/**
 * 赋值运算
 * @author 李泽坤
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		
		int a;
		a = 1;
		System.out.println(a = 9);

		int b,c,d;
		d = c = b = a = 8;
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		c = 3+(a=a++);
		System.out.println(c);//11
		System.out.println(a);//8
		
		a = 1;
		a += 2;//a = a+2;
		
		
		System.out.println(a);//3
		//a = 2;
		//a *=4;//a = a*4;
		//System.out.println(a);//8
		
		
		//将一个整数，按照10进制每个数字拆开
		int num = 34678;
		//int sum = 0;
		int last = num%10;
		//sum = sum * 10 + last; 
		System.out.println(last);//8
		num /= 10;
		last = num%10;
		System.out.println(last);//7
		num /= 10;
		last = num%10;
		System.out.println(last);//6
		num /= 10;
		last = num%10;
		System.out.println(last);//4
		num /= 10;
		last = num%10;
		System.out.println(last);//3
		
		//将一个数的大小位置颠倒并输出
		/*int dianDao = 32456;
		
		
		*/
		
	}

}
