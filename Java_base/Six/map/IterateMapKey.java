package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历Map中的所有Key
 * 
 * @author 李泽坤
 * 
 */
public class IterateMapKey {

	public static void main(String[] args) {
		// LinkedHashMap 可以保证存放顺序
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		map.put("5", "e");

		//获取Map中所有的Key值
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key:" + key);
			System.out.println("value:" + map.get(key));
		}

	}
}
