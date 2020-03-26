package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 数据结构转换线程安全性
 * ArrayList、Set、Map线程不安全
 * @author 李泽坤
 *
 */
public class SynCollection {
	public static void main(String[] args) {
		//数组表
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		//将ArrayList转换为一个线程安全的
		//集合的安全化操作
		List<String> syncList = Collections.synchronizedList(list);
		System.out.println(syncList);
		//哈希Set集合的安全同步
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
		//Map的线程同步
		Map<String,String> map = new HashMap<String,String>();
		map = Collections.synchronizedMap(map);
	}
}
