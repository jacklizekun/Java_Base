package Time;

/**
 * 接口
 * @author 李泽坤
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Cat tom = new Cat();
		//Hunter hunter = new Hunter;//编译错误，不能创建接口实例
		Hunter hunter = tom;
		Runner runner = tom;
		runner.run();
		hunter.hunt();
		hunter.run();
		//runner.hunt();//编译错误，runner的类型Runner上没有定义hunt()方法
	}
}

//implements实现,实现接口要实现全部的抽象方法
//内部类
class Cat implements Hunter,Runner{

	@Override
	public int getSpeed() {
		
		return DEFAULT_SPEED;
	}

	@Override
	public void run() {
		System.out.println("跑猫步");
	}

	@Override
	public void hunt() {
		System.out.println("拿耗子");
		
	}
}
//内部接口
interface Runner{
	//接口中的属性只能是常量
	/*public static final*/int DEFAULT_SPEED = 100;
	//接口中声明的方法，只能是抽象方法
	/*public abstract*/int getSpeed();//获取速度
	void run();//跑
}

interface Hunter extends Runner{
	void hunt();//打猎
}
















