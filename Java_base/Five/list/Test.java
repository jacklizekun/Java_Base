package list;
/**
 * 数据类型测试方法
 * @author 李泽坤
 *
 */
public class Test {
	public static void main(String[] args) {
		int i = 1 + 1;
		String str = i+"";
		System.out.println(str);
		int d = Integer.parseInt("1232456");
		System.out.println(d);
		
		Integer s = new Integer(2);
		System.out.println(s);
		@SuppressWarnings("static-access")
		int d3 = s.parseInt("55");
		System.out.println(d3);
	}
}
