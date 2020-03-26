package file2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader
 * 
 * @author 李泽坤
 * 
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		// FileReader(File file) FileReader(String path)
		
		// File file = new File("CopyFile.java");
		// FileReader reader = new FileReader(file);

		//FileReader不能修改编码级，只能按照当前系统 默认的编码集读取文本文件。
		FileReader reader = new FileReader("CopyFile_copy.java");

		
		//创建用于向文本文件中写字符的字符输出流, 不具备设定编码集的能力
		 
		FileWriter writer = new FileWriter("CopyFilecopy_copy.java");

		int c = -1;
		while ((c = reader.read()) != -1) {
			writer.write(c);
			System.out.print((char) c);
		}
		
		
		
		reader.close();
		writer.close();

	}
}
