package file2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream
 * @author 李泽坤
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("fos.dat");
		FileInputStream fis = new FileInputStream(file);
		
		char a = (char)fis.read();//读取一个字节
		char b = (char)fis.read();
		
		
		System.out.println(a);
		System.out.println(b);
		
		fis.close();
		
	}
}
