package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 遍历Set集
 * 
 * @author 李泽坤
 *
 */
public class IteratorSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("two");
		set.add("three");
		set.add("one");
		//创建迭代器
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		/*
		 * 对于编译器而言，增强for循环在编译后会转换为iterator。
		 */
		for(String str:set){
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
