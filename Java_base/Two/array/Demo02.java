package array;

import java.util.Arrays;

/**
 * Arrays.toString()
 * 将数组转成字符串
 * @author 李泽坤
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		//字符串数组
		String[] names = {"Tom","Andy","Jerry","John"};
		
		//打印数组内容
		for (int i = 0; i < names.length; i++) {
			//i = 0,1,2,3
			System.out.print(names[i]+',');
		}
		System.out.println();
		//toString将数组的内容连接为一个字符串
		String str = Arrays.toString(names);
		//"["Tom","Andy","Jerry","John"]"
		System.out.println(str);
		System.out.println(Arrays.toString(names));
	}

}
