package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 遍历Map的键值对
 * @author 李泽坤
 *
 */


public class iterateMapEntry {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("a",1);
		map.put("b",2);
		map.put("c",3);
		map.put("d",4);
		map.put("e",5);
		map.put("f",6);
		
		/*
		 * java.util.Map.Entry
		 * Entry<String,Integer>
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		//遍历每一组键值对
		for(Entry<String,Integer> entry : entrySet){
			// 通过Entry获取这组键值对中的key和value
			
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key+":"+value);
			
			/*
			 * 
			 * Map中有一个内部类Entry，其每一个实例描述一组键值对
			 * 当我们调用put方法存放数据时，Map会创建一个Entry实例
			 * 并将key,value存入该对象后保存到Map中
			 * 所以，散列数组中，每一项的LinkedList中保存的都是Entry
			 *
			 */			
			
		}
		
	}
}
