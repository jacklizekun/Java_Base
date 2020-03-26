package list;

import java.util.ArrayList;
import java.util.List;


/**
 * List方法
 * @author 李泽坤
 *
 */
public class ListDemo5 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for (int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
		/*
		 * set方法用于替换集合中指定位置上的元素
		 * set方法的返回值为被替换的元素
		 */
		Object old = list.set(1, "二");
		System.out.println(list.toString());
		System.out.println("被替换的元素："+old);
		
		
		
		
	}
}
