package array;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author 李泽坤
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		int[] ary = {4,55,2,55,12,88,33,56,34,23};
		System.out.println(Arrays.toString(ary));
		
		Demo09.bubbleSort(ary);
		System.out.println(Arrays.toString(ary));
		
		int[] ary1 = {4,55,2,55,12,88,33,56,34,23};
		Demo09.sort(ary1);
		System.out.println(Arrays.toString(ary1));
	}

	//冒泡算法
	public static void bubbleSort(int[] ary) {
		int tem;
		for (int i = 0; i < ary.length-1 ; i++) {
			for (int j = 0; j < ary.length-1; j++) {
				if (ary[j] > ary[j+1]) {
					tem = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = tem;		
				}
			}
		}
	}
	
	public static void sort(int[] ary) {
		for (int i = 0; i < ary.length-1; i++) {
			for (int j = 1; j < ary.length-i-1; j++) {
				if (ary[j]>ary[j+1]) {
					int t = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = t;
				}
			}
		}
	}
	
	
	
}
