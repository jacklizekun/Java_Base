package list;
/**
 * 自动拆箱装箱
 * @author 李泽坤
 *
 */
public class IntegerDemo3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(1);
		
		int a = i.intValue();//拆箱
		Integer c = Integer.valueOf(a);//装箱
		
		
		int d = i/*.intValue()*/;//自动拆箱
		Integer e = /*Integer.valueOf*/1;//自动装箱
		
		
	}
}
