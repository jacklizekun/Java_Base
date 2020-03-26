package Methods;

/**
 * 静态代码块
 * @author 李泽坤
 *
 */
public class Demo03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo();
	}

}


class Foo{
	//System.out.println("HI");//编译错误！类中不能有语句
	{
		System.out.println("HI");//代码块，很少使用，代码块在创建对象时候执行，类似于构造器中的语句
	}
	
	//静态代码块，比较有用,是类的代码块，在类加载期间执行，只执行一次，用于加载静态资源，如配置文件、图片素材等
	static{
		System.out.println("Foo class loaded");
	}
	
}