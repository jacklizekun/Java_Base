package numberbase;
/**
 * 数据范围
 * @author 李泽坤
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		int n = 2;
		char c;
		c = 'A'+2;
		//c = 'A'+n;//编译错误，不能转换int到char
		c = (char)('A'+n);
		//c = 'A'+65530;//编译错误，超过char范围
		System.out.println(c);
		
		byte b;
		b = 4+6;
		//b = 4+n;//编译错误
		//b = 4+126;//编译错误
		b = 4 + 0xffffffff;
		System.out.println(b);
	}
}
