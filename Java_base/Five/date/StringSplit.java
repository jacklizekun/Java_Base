package date;

import java.util.Arrays;
/**
 * Split
 * @author 李泽坤
 *
 */
public class StringSplit {
	public static void main(String[] args) {
		String str = "SFSDLLL";
		//分隔
		String[] array = str.split("S");
		System.out.println(Arrays.toString(array));
	}
}
