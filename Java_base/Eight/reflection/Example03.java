package reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 简单工厂模式
 * 读取配置文件的信息动态创建对象
 * @author 李泽坤
 *
 */
interface InterfaceBase{
	void fun1();
	void fun2();
	
}
class ClassA implements InterfaceBase{
	public void fun1(){
		System.out.println("这是ClassA的fun1方法");
	}
	public void fun2(){
		System.out.println("这是ClassA的fun2方法");
	}
}

class ClassB implements InterfaceBase{
	public void fun1(){
		System.out.println("这是ClassB的fun1方法");
	}
	public void fun2(){
		System.out.println("这是ClassB的fun2方法");
	}
}
//编写工厂类
class SimpleFactory{
	private static String getConfigInfo(){
		String typeName = "";
		Properties p = new Properties();
		try {
			//读取配置文件
			p.load(new FileInputStream("config.properties"));
			typeName = p.getProperty("appSet");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return typeName;
	}
	public static InterfaceBase createProduct(){
		InterfaceBase obj = null;
		String className = SimpleFactory.getConfigInfo();
		try {
			obj = (InterfaceBase)Class.forName(className).newInstance() ;
		} catch (InstantiationException e) {
		
			e.printStackTrace();
		} catch (IllegalAccessException e) {
	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		return obj;
	}
}
//测试工厂类
public class Example03 {
	public static void main(String[] args) {
		InterfaceBase obj = SimpleFactory.createProduct();
		obj.fun1();
		obj.fun2();
	}	
}
