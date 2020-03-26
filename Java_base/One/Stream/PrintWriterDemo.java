package Stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 自动行刷新的缓冲字符输出流
 * @author 李泽坤
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) {
		//PrintWriter(File file)
		//创建基于给定File对象所描述的文件的读写操作的字符操作流
		PrintWriter writer = null;
		try {

//			File file = new File("pw2.txt");
//			writer = new PrintWriter(file);
//			writer = new PrintWriter("pw1.txt");
	
/*
 *	 PrintWriter(OutputString out,boolean atuoFlush)
 * 创建一个带有自动行刷新的缓冲字符输出流
* 每当我们使用println方法输出字符串时，都会自动
* 强制将缓冲区数据写出。通常这样做会降低写效率，但是若
 * 要保证数据的写出即时性，我们需要这样做。
 */
//			FileOutputStream fos = new FileOutputStream("pw3.txt");
//			writer = new PrintWriter(fos,true);
			
			FileOutputStream fos = new FileOutputStream("pw4.txt");
			//编码
			OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
			
			writer = new PrintWriter(osw,true);
			
			
			//自动行刷新
//			writer = new PrintWriter(osw,true);
			
			writer.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(writer != null){
				writer.close();
			}
		}
	}
}
