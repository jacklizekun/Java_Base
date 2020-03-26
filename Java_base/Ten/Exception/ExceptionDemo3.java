package Exception;
/*
 * 	如何处理多个异常：
 * 		可以使用多个try...catch语句
 * 		使用一个try和多个catch
 * 
 * 多个catch之间的顺序：
 * 			多个catch之间可以有子父类
 * 			平级之间没有顺序关系
 * 			如果有子父类，父类异常必须放在后面
 * 			
 * 	
 */
/**
 * 
 * @author 李泽坤
 *
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			
			//int[] arr = new int[5];
			//System.out.println(arr[8]);
			
			//System.out.println(2 / 0);
			
		} 
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("出现数组越界了");
		} 
		catch(NullPointerException e) {
			System.out.println("出现空指针了");
		}
		catch(Exception e) {
			System.out.println("出现异常了");
		}
		
		
		
		
		/*try {

			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("出现数组越界了");
		}*/
		

	}

	private static void method() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("出现空指针了");
		}
		
		try {

			int[] arr = new int[5];
			System.out.println(arr[8]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("出现数组越界了");
		}
	}

}