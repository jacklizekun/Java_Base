package Algorithm;

import java.util.Arrays;
import java.util.Random;

import Structure.Demo09;
/**
 * Arrays.sort
 * 系统sort排序速度快于冒泡排序
 * @author 李泽坤
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int[] ary1 = new int[5000];
		Random r = new Random();
		for (int i = 0; i < ary1.length; i++) {
			ary1[i] = r.nextInt();
		}
		int[] ary2 = Arrays.copyOf(ary1, ary1.length);
		long t1 = System.currentTimeMillis();
		Arrays.sort(ary1);
		long t2 = System.currentTimeMillis();
		Demo09.sort(ary2);
		long t3 = System.currentTimeMillis();
		System.out.println(t2 - t1);//系统sort排序所用时间
		System.out.println(t3 - t2);//系统排序和冒泡排序的相差时间
		System.out.println((double)(t3-t2)/(t2-t1));
		
	}
}
