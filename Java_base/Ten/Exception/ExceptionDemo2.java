package Exception;

import java.io.FileWriter;
import java.io.IOException;


/**
 * 
 * @author 李泽坤
 *
 */
public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
		//method();
		
		function();
		/*
		 * 	异常的处理方式：
		 * 			捕获处理
		 * 				try...catch语句
		 * 
		 * 				try {
		 * 					有可能出现问题的代码;
		 * 				} catch(ArithmeticException ae) {
		 * 					处理异常;
		 * 				}
		 * 
		 * 				try...catch的执行顺序：
		 * 					首先执行try语句
		 * 						如果发现异常，异常下面的代码不在执行，直接跳入catch语句中，catch语句结束后，整个try...catch结束
		 * 						如果没有发现异常，try语句执行结束后，try...catch直接结束， 不在执行catch语句
		 * 
		 * 
		 * 			抛出去
		 * 				当我们不想处理异常，或者没有能力处理的时候，我们可以选择抛出异常，谁调用方法谁处理异常
		 * 				使用关键字throws在方法的声明出抛出异常

		 * 		
		 * 
		 *  jvm处理异常的方式：
		 *  	如果出现异常我们没有处理，jvm会帮我们进行处理，他会把异常的类型，原因还有位置显示在命令行
		 *  	并且还终止了程序，异常后面的代码将不在执行
		 */
	}
	
	public static void function() throws Exception {
		FileWriter fw = new FileWriter("a.txt");
	}

	private static void method() {
		try {
			System.out.println(1);
			//System.out.println(2 / 0);
			System.out.println(2);
		} catch(ArithmeticException ae) {
			System.out.println("除数不能为0");
		}
		
		System.out.println(3);
	}

}
