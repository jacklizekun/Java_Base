package file5;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 文件复制
 * @author 李泽坤
 *
 */
public class Demo7 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader("FileWriterDemo.java");
		//创建输出流对象
		FileWriter fw = new FileWriter("Copy.java");
		
		//读写数据
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
}
