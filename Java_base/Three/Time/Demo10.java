package Time;
/**
 * 匿名内部类
 * @author 李泽坤
 *
 */
public class Demo10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Xoo xoo = new Xoo();//创建对象
		Xoo x1 = new Xoo(){};//创建“匿名子类实例”
		Xoo x2 = new Xoo(){
			public void test(){
				System.out.println("x2 test");
			}
		};
		x2.test();//输出重写以后的结果
		//Yoo yoo = new Yoo();//编译错误，不能创建接口实例
		Yoo yoo = new Yoo(){};//没有问题，这是创建匿名类实例
		//Woo woo = new Woo(){};//编译错误，没有实现抽象方法
		Woo woo = new Woo(){
			public void test() {//是声明方法，并执行
				System.out.println("woo test");
				
			}
			
		};
		woo.test();//调用了test方法
	}

};

interface Yoo{
	
}

interface Woo{
	void test();
}

class Xoo{
	public void test(){
		System.out.println("Xoo test()");
	}
	
}