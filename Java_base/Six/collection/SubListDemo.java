package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合子集
 * @author 李泽坤
 *
 */
public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//向集合中添加10个整数
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);//[0,1,2,3,4,5,6,7,8,9]
		
		//获取子集
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);//[3,4,5,6,7]

		//修改子集会影响原集合中的元素
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i,subList.get(i)*10);
		}
		
		System.out.println(subList);
		System.out.println(list);
		
	}
}
