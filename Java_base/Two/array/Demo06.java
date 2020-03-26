package array;

import java.util.Arrays;

/**
 * 数组的复制arraycopy
 * @author 李泽坤
 *
 */
public class Demo06 {

	public static void main(String[] args) {
//数组变量的赋值，使用相同的数组对象
		int[] ary1 = {4,5,6};
		int[] ary2 = ary1;
		ary2[2] = 4;
		System.out.println(Arrays.toString(ary2));
		System.out.println(Arrays.toString(ary1));
		int[] ary3 = new int[ary1.length];
		for (int i = 0; i < ary1.length; i++) {
			ary3[i] = ary1[i];
		}
		ary3[1]++;
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary3));
		int[] ary4 = new int[ary1.length];
		//复制arraycopy
		//(源数组，源数组位置，目标数组，目标数组位置，个数)
		System.arraycopy(ary1, 0, ary4, 0, ary1.length);
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary4));
		
		//使用Arrays.copyof()方法，底层就是arraycopy
		int[] ary5 =  Arrays.copyOf(ary1, ary1.length);
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary5));
	
	}
}
