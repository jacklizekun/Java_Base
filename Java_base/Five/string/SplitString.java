package string;

import java.util.Arrays;


/**
 * 图片重命名：拆分字符串
 * @author 李泽坤
 *
 */
public class SplitString {
	public static void main(String[] args) {
		String str = "ffff 123123 45678 89908 8798";
		String[] array = str.split("\\s");
		System.out.println("共："+array.length+"项");
		System.out.println(Arrays.toString(array));
		
		str = "123,456,789,1234,56456";
		array = str.split(",");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		String imgName = "111.jpg";

		String[] names = imgName.split("\\.");
		System.out.println(Arrays.toString(names));
		String fileName = names[1];
		long now = System.currentTimeMillis();
		String newName = now+"."+fileName;
		System.out.println("newName:"+newName);
		
		
		
		
		
		
		
		
	}
}
