package reflection;
/**
 * 测试拷贝类
 * @author 李泽坤
 *
 */
public class Example07 {
	public static void main(String[] args) {
		BeanBase obj1 = new BeanBase(1,"xx",100);
		BeanBase obj2 = new BeanBase();
		try {
			BeanUtil.copyProperties(obj1, obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getScore());
	}
}
