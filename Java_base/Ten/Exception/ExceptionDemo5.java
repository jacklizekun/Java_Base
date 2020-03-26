package Exception;

import java.io.FileWriter;
import java.io.IOException;


/**
 * 
 * @author 李泽坤
 *
 */
public class ExceptionDemo5 {
	/*
	 *  finally:组合try...catch使用，用于释放资源等收尾工作，无论try...catch语句如何执行，finally的代码一定会执行
	 *  
	 *  try {
	 *  	有可能出现问题的代码;
	 *  
	 *  } catch(异常对象) {
	 *  	处理异常;
	 *  } finally {
	 *  	释放资源;
	 *  	清理垃圾;
	 *  }
	 *  
	 */
	public static void main(String[] args) {
		//method();
		
		FileWriter fw = null;
		try {
			System.out.println(2 / 0);
			fw = new FileWriter("a.txt");
			fw.write("hello");
			fw.write("world");
			//System.out.println(2 / 0);
			fw.write("java");
			
			//fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//释放资源
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
	}

	private static void method() {
		try {
			System.out.println(2 / 1);
			
		} catch(ArithmeticException e) {
			System.out.println("除数不能为0");
		} finally {
			
			System.out.println("清理垃圾");
		}
	}

	

}