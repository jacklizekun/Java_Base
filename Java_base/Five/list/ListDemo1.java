package list;

import java.util.ArrayList;
import java.util.List;


/**
 * ArrayList
 * @author 李泽坤
 *
 */
public class ListDemo1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		//向集合中添加元素
		/*
		 * ArrayList内部使用对象数组形式实现
		 * ArrayList会初始化一个数组，当要存放的元素数量
		 * 大于数组时，ArrayList会自动扩容数组长度。
		 */
		list.add("一");
		list.add("二");
		list.add("三");
		/*
		 * ArrayList重写了Object的toString方法
		 * 返回的字符串格式为:
		 * 
		 * [元素1.toString(),元素2.toString(),....]
		 * 
		 */
		System.out.println(list);
		//获取集合元素数量
		System.out.println("size:"+list.size());
		//看看集合中是否包含元素，不包含返回true
		System.out.println("集合不包含元素:"+list.isEmpty());
		//清空集合元素
		list.clear();
		System.out.println("size:"+list.size());
		System.out.println("集合不包含元素:"+list.isEmpty());
		/*
		 * 注意 判断null和isEmpty的区别
		 * 判断null指的是集合对象是否存在
		 * isEmpty()指的是集合对象是存在的，只不过没有元素。
		 * 
		 */
		System.out.println(list==null);
		System.out.println(list.isEmpty());
	}
}





