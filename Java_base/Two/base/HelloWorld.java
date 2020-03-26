package base;
import java.util.Scanner;
/**
 * Scanner.nextLin
 * 获取键盘下一行输入
 * @author 李泽坤
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("输入姓名：");
		Scanner console = new Scanner(System.in);
		String name = console.nextLine();
		System.out.println("Hello "+name);
	}
	
}