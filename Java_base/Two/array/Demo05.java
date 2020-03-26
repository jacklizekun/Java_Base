package array;

import java.util.Arrays;

/**
 * 二分查找算法
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String[] names = {"Tom","Andy","Jerry","John","Wang"};
		//binary二进制Search查找，binarySearch二分查找
		int index = Arrays.binarySearch(names, "Jerry");
		System.out.println(index);
		
		index = Arrays.binarySearch(names, "Wang");
		System.out.println(index);//4 找到
		index = Arrays.binarySearch(names, "Tom");
		System.out.println(index);//负数，找不到！
		//二分查找，在未排序的数组上查找结果是不稳定的
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "Tom");
		System.out.println(index);//1 找到
		index = Arrays.binarySearch(names, "Lee");
		System.out.println(index);//负数，找不到

	}

}
