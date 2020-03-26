package string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;


/**
 * String截取字符串与重载方法
 * @author 李泽坤
 *
 */
public class StringMethodDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//            0123456789012345
		String str = "Thinking in Java";
		String sub = str.substring(9,11);
		System.out.println("sub:["+sub+"]");
		
		String sub2 = str.substring(9);
		System.out.println("sub2:["+sub2+"]");
		
		String string = "我爱java";
		byte[] string2 = string.getBytes();
		System.out.println(Arrays.toString(string2));
		byte[] arr1 = string.getBytes("utf-8");
		System.out.println(Arrays.toString(arr1));
		
		
		
		}
}
