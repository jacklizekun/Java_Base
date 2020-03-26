package file5;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter
 * @author 李泽坤
 *
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		FileWriter fw = new FileWriter("d:\\a.txt");
		//调用输出流对象的写数据的方法
		//写一个字符串数据
		fw.write("IO流你好");
		//数据没有直接写到文件，其实是写到了内存缓冲区
		fw.flush();
		//释放资源
		//通知系统释放和该文件相关的资源
		fw.close();
		
		//while(true) {}
	}
}