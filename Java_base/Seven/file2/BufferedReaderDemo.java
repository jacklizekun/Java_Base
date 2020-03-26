package file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * 以行为单位读取字符串
 * @author 李泽坤
 *
 */
public class BufferedReaderDemo {
	public static void main(String[] args)  throws IOException{
		//先创建用于读取文件的FIS
		FileInputStream fis = new FileInputStream("src"+File.separator+"day01"+File.separator+ "CopyFile.java");
		//将字节流转换为字符流
		InputStreamReader reader = new InputStreamReader(fis);
		// 按行读取字符串的字符输入流
		BufferedReader br = new BufferedReader(reader);
		
		
		
		String str = null;
		/*
		 * String readLine()
		 * 连续读取字符，直到读取到换行符为止。
		 * 将换行符之前的字符组成字符串返回
		 * 当返回值为null时，说明EOF
		 */
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		br.close();
		
		
	}
}
