package base;
/**
 * 模拟编译错误，无法生成class文件
 * @author 李泽坤
 *
 */
public class Java {
	public static void main(String[] args) {
		//System.out.println(age);//编译错误，找不到age变量！
		int age;//定义或声明一个变量
		//System.out.println(age);//编译错误，age变量可能没有被初始化！
		age=2;//初始化，就是第一次赋值		
		System.out.println("age="+age);
		//int age = 3;//编译错误，重复的局部变量
		age=3;
		System.out.println(age);
		{
			int score = 20;//定义变量直接初始化，score分数
			System.out.println("score="+score);//20
			System.out.println(age);
		}
		//System.out.println(score);
		int score = 100;
		System.out.println(score);	
	}
}
