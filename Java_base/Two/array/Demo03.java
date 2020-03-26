package array;

import java.util.Arrays;

/**
 * Arrays.equals
 * 判断数组内容是否相等
 * @author 李泽坤
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		char[] answer = {'A','C','D'};
		
		//char[] input0 = {'A','D','E'};
		char[] input = {'A','C','D'};
		
		boolean match = Arrays.equals(answer, input);
		//match匹配
		if (match) {
			System.out.println("答对了！");
		}else {
			System.out.println("答错了！！");
		}
		
		
		
	}

}
