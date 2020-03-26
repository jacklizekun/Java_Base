package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合泛型
 * @author 李泽坤
 *
 */
public class ListDemo {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("789");
		//list.add(123);//参数类型不匹配
		
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			System.out.println(element);
		}
		//指定Iterator的类型
		Iterator<String> it = list.iterator(); 
		while(it.hasNext()){
			String element = it.next();
			//String element2 = it.next();
			System.out.println(element);
		}
		
		List list2 = new ArrayList();
	
		
		
		
		
		
	}
}
