package Exception;
/*
 * Throwable的常用方法：
		String getMessage()  
		String toString()  
		void printStackTrace()  
 	
 * 	
 */
/**
 * 
 * @author 李泽坤
 *
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
	
		
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	private static void method() {
		try {
			System.out.println(2 / 0);
		} catch(ArithmeticException e) {
			//String getMessage() : 原因
			//System.out.println(e.getMessage());
			
			//String toString()  类型和原因
			//System.out.println(e.toString());

			//void printStackTrace():类型原因和位置
			e.printStackTrace();
		}
		
		//System.out.println("hello");
	}



}