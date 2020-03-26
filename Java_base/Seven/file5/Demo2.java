package file5;

import java.io.FileWriter;
import java.io.IOException;
/**
 * flush
 * @author 李泽坤
 *
 */

/*
 *
 * close()和flush()方法的区别：
 * 		flush():刷新缓冲区。流对象还可以继续使用。
 * 		close():先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		//FileWriter fw = new FileWriter("d:\\a.txt");
		FileWriter fw = new FileWriter("a.txt");
		
		//调用输出流对象的写数据方法，并刷新缓冲区
		fw.write("helloworld");
		fw.flush();
		fw.write("java");
		fw.flush();
		
		//释放资源
		fw.close();
		
		//Stream closed
		//fw.write("javaee");
		//fw.flush();
	}
}