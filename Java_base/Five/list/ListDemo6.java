package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List的add和remove方法
 * @author 李泽坤
 *
 */
public class ListDemo6 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		List list = new ArrayList();
		list.add("one");	
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		list.add(2,"二");
		System.out.println(list);//[one,two,二,three]
		
		/*
		 * Object remove(int index)
		 * 删除指定索引处的元素
		 * 返回值为被删除的元素
		 */
		Object old = list.remove(1);
		System.out.println(list);//[one,二,three]
		System.out.println("被删除的是："+old);
		
		/*
		 * 查询指定元素在集合中的位置
		 * int indexOf(Object obj)
		 * 在集合中查询给定元素第一次出现的位置
		 * 这里也是使用给定元素与集合元素进行equals的比较方式
		 */
		System.out.println("three的位置："+list.indexOf("three"));
		
		System.out.println("three最后出现的位置："+list.lastIndexOf("three"));
	
		/*
		 * 将集合转换为数组
		 * 注意：
		 * 	要确保集合中存放的元素类型是一致的！
		 * 	且要转换的目标数组类型要与元素类型一致。
		 * 
		 * toArray()方法
		 * 用于将集合转换为数组
		 * toArray方法是Collection定义的方法，所有集合都具备
		 */
		
		Object[] array = (Object[])list.toArray(new Object[1]);
		System.out.println("数组："+Arrays.toString(array));
	}
}
