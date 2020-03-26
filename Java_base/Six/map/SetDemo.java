package map;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Set集合
 * 
 * @author 李泽坤
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		/*
		set.add(1);
		set.add(1);//重复元素不会添加到Set集合中
		System.out.println("size:"+set.size());
		System.out.println(set);
		*/	
		Random random = new Random();
		int sum = 0;
		/*
		 * while(set.size() < 20){
		 * //随机生成一个数字放入set集合
		 * set.add(random.nextInt(100));
		 * sum++;
		 * }
		 */
		
		for (; set.size()<20; sum++) {
			set.add(random.nextInt(100));
		}
		
		System.out.println(set);
		System.out.println("随机生成了："+sum+"个数字");
		
	}
}
