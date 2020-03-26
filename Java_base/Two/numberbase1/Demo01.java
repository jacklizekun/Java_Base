package numberbase1;
/**
 * 隐式数据类型转换
 * @author 李泽坤
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//自动转int
		byte b = -1;		
		//自动类型转换
		//toHexString将整数转换为16进制形式的字符串
		System.out.println(Integer.toHexString(b));
		//将-1转换为“ffffffff”然后输出到控制台
		System.out.println(Integer.toHexString((int)b));
		System.out.println(Long.toHexString((long)b));
		
		char c = '3';	
		int n = c-'0';//(48+3)-48 = 3
		System.out.println(n);
		
		System.out.println(0x7fffffff);
		
	}

}
