package string;

/**
 * 修改字符串
 * @author 李泽坤
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = "a";
		for (int i = 0; i < 1000000; i++) {
			str +=str;
		}
	}
}
