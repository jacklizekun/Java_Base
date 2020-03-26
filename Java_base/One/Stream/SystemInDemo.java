package Stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 键盘输入
 * @author 李泽坤
 *
 */
public class SystemInDemo {
	public static void main(String[] args) throws Exception{
		/**
		 * System.in字节输入流，键盘读取 
		 * FileInputStream字节输入流，文件读取
		 */
		InputStream in = System.in;
		//转成字符流，InputStreamReader
		InputStreamReader reader = new InputStreamReader(in);
		//转成缓冲字符输入流
		BufferedReader br = new BufferedReader(reader);
		String str = null;
		while(true){
			str = br.readLine();
			if("exit".equals(str)){
				System.out.println("！");
				break;
			}
			System.out.println("输入"+str);
		}
		System.out.println("ok");
		
	}
}
