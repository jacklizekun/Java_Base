package string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;


/**
 * 字符串编码
 * @author 李泽坤
 *
 */
public class StringEnCoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "我爱Java";
		/**
		 * 该方法要求调用者必须捕获一个异常
		 * 这个异常是：没有这个字符集
		 * 当我们字符串中写的字符集名称错误时会报这个错误
		 */
		byte[] data = str.getBytes("gbk");
		byte[] utfdata = str.getBytes("utf-8");
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(utfdata));
		
		/**
		 * 将2进制数据转换为字符串
		 * 字符集名称不区分大小写
		 */
		String decodeStr = new String(data,"gbk");
		System.out.println("解码后："+decodeStr);
		
		
	}
}
