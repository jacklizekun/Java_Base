package map;
/**
 * 单例模式
 * 单例步骤：
 * 1.私有化构造方法
 * 2.定义静态的获取当前类型实例的方法
 * 3.定义私有的静态的当前类型实例并初始化
 * @author 李泽坤
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	//私有化构造方法
	private Singleton(){
		
	}
	
	//定义一个静态的可以截获当前类型实例的方法
	public static Singleton getStringleton(){
		return singleton;
	}
	
	
}
