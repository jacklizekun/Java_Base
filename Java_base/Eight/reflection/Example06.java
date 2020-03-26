package reflection;

import java.lang.reflect.Constructor;


/**
 * Constructor
 * @author 李泽坤
 */
public class Example06 {
	public static void main(String[] args) throws Exception {
		//获取类对象
		Class typeInfo = BaseClass.class;
		//获取类的构造器方法
		Constructor[] allCons = typeInfo.getConstructors();
		// 获取指定的构造器
		Constructor ctr = typeInfo.getConstructor(int.class, String.class, double.class, double.class);
		//新建类实例
		BaseClass obj = (BaseClass) ctr.newInstance(new Integer(100),"xiaoming", new Double(300), new Double(3));
		obj.printInfo();
		// for (Constructor c : allCons) {
		// Class[] pType = c.getParameterTypes();
		// }
	}
}
