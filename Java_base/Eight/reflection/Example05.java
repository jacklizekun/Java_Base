package reflection;

import java.lang.reflect.Method;

/**
 * Method对象封装类
 * @author 李泽坤
 *
 */
public class Example05 {
	public static void main(String[] args) throws Exception {
		//获取类
		Class typeInfo = Class.forName("reflection.BaseClass");
		//获取类方法
		Method[] allMethods = typeInfo.getDeclaredMethods();
		for (Method m : allMethods) {
			System.out.print(m.getReturnType().getSimpleName());
			System.out.print(" " + m.getName() + "(");
			Class[] pTypes = m.getParameterTypes();
			for (Class t : pTypes) {
				System.out.print(t.getSimpleName());
			}
			System.out.print(")\n");
		}
		// 获取类中的某个指定方法
		Method m = typeInfo.getDeclaredMethod("fun1", new Class[] {});
		BaseClass o = new BaseClass();
		m.invoke(o, new Object[]{});
		//获取类中有参数的方法，并调用
//		Method m2 = typeInfo.getDeclaredMethod("fun2", new Class[]{int.class,String.class});
		Method m2 = typeInfo.getDeclaredMethod("fun2", int.class,String.class);
		Object result = m2.invoke(o, new Integer(3000),"abc");
		System.out.println(result);
	}

}
