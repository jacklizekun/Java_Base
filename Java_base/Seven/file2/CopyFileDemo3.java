package file2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 缓冲字符输入输出流
 * @author 李泽坤
 *
 */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException{
		//创建用于读取源文件的FIS
		FileInputStream fis = new FileInputStream(
									"src"+File.separator+
									"day01"+File.separator+
									"CopyFile.java");
		
		
		//创建缓冲字符输入流
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
	
		//创建一个用于写文件的FOS
		FileOutputStream fos = new FileOutputStream("CopyFile_copy.java");
		
		//将字节输出流变成字符输出流
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		
		//将字符输出流变成缓冲字符输出流
		//这样就可以以行为单位写字符串了
		BufferedWriter br = new BufferedWriter(writer);
		
		String str = null;
	
		while((str = reader.readLine()) != null){
			br.write(str);//一次将一个字符串写出
			System.out.println(str);
			br.newLine();//输出一个换行
		}
		
		br.close();
		reader.close();
		
		
		
		
		
	
	}
}
