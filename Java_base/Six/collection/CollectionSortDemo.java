package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 集合的排序
 * @author 李泽坤
 *
 */
public class CollectionSortDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1,5));
		list.add(new Point(3,4));
		list.add(new Point(2,2));
		
		//输出集合
		System.out.println(list);
		
		/*
		 * 使用集合的工具类对集合元素进行自然排序
		 * 自然排序：由小至大
		 */
		Collections.sort(list);
		System.out.println(list);
		
		byte[] b = new byte[1];
		Object o = b;
		
	}
}
