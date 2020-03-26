package numberbase;
/**
 * 进制转换
 * @author 李泽坤
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
		byte a =(byte)-1;
		byte b =(byte)-1;
		//转16进制
		System.out.println(Integer.toHexString(a));
		//转2进制
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(a + b);
	}

}
