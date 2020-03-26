package collection;

import java.util.ArrayList;
import java.util.List;
/**
 * 循环
 * @author 李泽坤
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		//增强型循环
		for (int i:array) {
			System.out.println(i);
		}
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
	
		for (String str : list) {
			System.out.println(str);
		
		}
	}
}
