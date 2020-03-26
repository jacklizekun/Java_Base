package ifelse;
/*
永远停不下来的循环，叫做死循环。

死循环的标准格式：
while (true) {
	循环体
}
*/
/**
 * 死循环
 * @author 李泽坤
 *
 */
public class Demo16DeadLoop {
	public static void main(String[] args) {
		while (true) {
			System.out.println("I Love Java!");
		}
		
		// System.out.println("Hello");
	}
}