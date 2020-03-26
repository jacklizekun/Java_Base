package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * bean拷贝工具
 * @author 李泽坤
 *
 */
public class BeanUtil {
	public static void copyProperties(Object source, Object target) throws Exception{
		//获取类对象
		Class sourceType = source.getClass();
		Class targetType = target.getClass();
		//类的域对象
		Field[] fields = sourceType.getDeclaredFields();
		for (Field f : fields) {
			String fieldName = f.getName();
			Field targetField = null;
			try {
				targetField = targetType.getDeclaredField(f.getName());
			} catch (SecurityException e) {
				break;
			} catch (NoSuchFieldException e) {
				continue;
			}
			
			if (f.getType() == targetField.getType()) {
				String getMethodName = "get"
						+ fieldName.substring(0, 1).toUpperCase()
						+ fieldName.substring(1);
				String setMethodName = "set"
						+ fieldName.substring(0, 1).toUpperCase()
						+ fieldName.substring(1);
				// 构造get、set方法的对象，并调用
				Method getMethod = sourceType.getMethod(getMethodName,
						new Class[] {});
				Method setMethod = targetType.getMethod(setMethodName,
						f.getType());
				// 先调用get方法获取源对象的属性值
				Object result = getMethod.invoke(source, new Object[] {});
				// 再调用set方法为目标对象赋值
				setMethod.invoke(target, result);
		}
		}
	}


	public static Object getFieldValue(Object obj,String fieldName){
		Object result = null;
		Class typeInfo = obj.getClass();
		Field field;
		try {
			field = typeInfo.getDeclaredField(fieldName);
			field.setAccessible(true);
			try {
				result = field.get(obj);
			} catch (IllegalArgumentException e) {
			
				e.printStackTrace();
			} catch (IllegalAccessException e) {
			
				e.printStackTrace();
			}
		} catch (SecurityException e) {
		
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
		
			e.printStackTrace();
		}
	
		  return result;
	}
	public static Object setFieldValue(Object obj,String fieldName,Object value){
		return null;
	}
	public static Object invokeMethod(Object obj,String methodName,Object[] params){
		return null;
	}
	public static boolean invokeNoReturnMethod(Object obj,String methodName,Object[] params){
		return false;
	}
}