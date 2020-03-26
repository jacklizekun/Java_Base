package file5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter
 * @author 李泽坤
 *
 */
public class Demo8 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		FileReader fr  = new FileReader("FileWriterDemo.java");
		//创建输出流对象
		FileWriter fw = new FileWriter("Copy.java");
		
		//读写数据
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
}