package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合迭代器
 * @author 李泽坤
 *
 */
public class IteratorDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("#");
		list.add("two");
		list.add("#");	
		list.add("three");
		
		/*
		 * java.util.Iterator
		 * 迭代器是专门为while循环设计的
		 */
		Iterator it = list.iterator();
		
		while(it.hasNext())	{		
			// next方法获取集合中下一个元素
				String element = (String)it.next();
			if ("#".equals(element)){
				//将上面通过next方法获取的元素从集合中删除
				it.remove();
				//list.remove(element);//不要使用
				/*
				 * 迭代器在迭代过程中，不能通过使用集合定义的
				 * 删除方法去删除集合元素，一定要使用迭代器的
				 * 删除方法，否则迭代过程中会产生异常！！
				 */	
			}
			System.out.println(element);
		}
		System.out.println(list);
		
	}
}
