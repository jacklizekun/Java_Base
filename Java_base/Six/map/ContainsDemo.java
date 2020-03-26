package map;

import java.util.HashMap;
import java.util.Map;


/**
 * Map统计字符串次数
 * @author 李泽坤
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "123,456,778,995,225,456,597,553,213,123";
		
		//1 将字符串按照“,”拆分
		String[] array = str.split(",");
		//2 创建用于统计的Map
		Map<String,Integer> map = new HashMap<String,Integer>();
		//3 循环字符串数组，统计每一项
		for(String sub:array){
			//4 判断每组数字是否作为Key在Map中存在
			if (map.containsKey(sub)) {
				map.put(sub, map.get(sub) + 1);
			}else{
				map.put(sub, 1);
			}
		}
		//输出统计结果
		System.out.println(map);
	
	}
}
