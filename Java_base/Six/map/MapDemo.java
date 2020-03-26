package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 相同的对象作为Key存入Map的效果
 * @author 李泽坤
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<Point,String> map = new HashMap<Point,String>();
		Point p = new Point(1);
		map.put(p, "第一次");
		
		p.setX(2);
		
		map.put(p, "第二次");
		System.out.println(map);
		
		
		System.out.println(map.get(p));
		p.setX(1);
		System.out.println(map.get(p));
	}
}
