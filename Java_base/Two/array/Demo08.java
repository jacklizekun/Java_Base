package array;
import java.util.Arrays;
/**
 * 插入式排序(从小到大排序)Arrays.sort(ary)
 * @author 李泽坤
 *
 */
public class Demo08 {
	public static void main(String[] args) {

		int[] ary = {10,6,2,9,2,1};
		Demo08.sort(ary);
		System.out.println(Arrays.toString(ary));
	}
	//静态方法
	public static void sort(int[] ary) {
		int i,j,k;
		for (i = 1; i < ary.length; i++) {
			k = ary[i];//取出
			//移动
			for (j = i -1; j >=0 && k<ary[j]; j--) {
				ary[j+1] = ary[j];//元素[j]向后移动
			}
			ary[j+1] = k;//插入
		}
		
	}
}
