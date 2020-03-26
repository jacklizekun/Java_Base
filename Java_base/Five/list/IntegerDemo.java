package list;

/**
 * 包装类
 * @author 李泽坤
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//int的包装类Integer
		Integer i = new Integer(1);
		
		//获取包装类实例保存的基本类型数据
		int a = i.intValue();
		
		System.out.println(a);
		
	}
}
