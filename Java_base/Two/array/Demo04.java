package array;

import java.util.Arrays;

/**
 * Arrays的排序算法
 *
 *@author 李泽坤
 */
public class Demo04 {
	public static void main(String[] args) {
		int[] score = {67,49,88,89,95};
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		String[] names = {"Tom","Jerry","Andy","John"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		//使用null填满names
		Arrays.fill(names, null);
		System.out.println(Arrays.toString(names));
		
		
		
		
	}
}
