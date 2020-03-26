package reflection;

import java.lang.reflect.Field;
import java.util.Iterator;

/**
 * Field类
 * 私有属性
 * @author 李泽坤
 *
 */
public class Example04 {
	public static void main(String[] args) throws Exception{
		// 获取BaseClass的基础类型信息
		Class typeInfo = BaseClass.class;
		// getField()获取所有public级别的属性
		// Field[] allField = typeInfo.getFields();
		// getDeclaredFields()获取所有级别的属性
		Field[] allField = typeInfo.getDeclaredFields();
		for (Field f : allField) {
			System.out.print(java.lang.reflect.Modifier.toString(f.getModifiers())+" ");
			System.out.print(f.getType().getSimpleName());
			System.out.println(" " + f.getName());
		}
		BaseClass obj = new BaseClass(1,"xx",30,3);
		//获取某一个具体的属性
		Field fieldInfo = typeInfo.getDeclaredField("name");
		//允许访问私有属性
		fieldInfo.setAccessible(true);
		//获取属性值
		Object value = fieldInfo.get(obj);
		System.out.println(value);
		//为对象的该属性赋值
		fieldInfo.set(obj,"yyyyyy");
		System.out.println(fieldInfo.get(obj));
	}
}
