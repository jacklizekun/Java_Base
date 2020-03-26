package file5;

import java.io.FileWriter;
import java.io.IOException;
/**
 * 换行
 * @author 李泽坤
 *
 */
/*
 * 如何实现数据的换行?
 * 		\n可以实现换行，但是windows系统自带的记事本打开并没有换行，这是为什么呢?因为windows识别的换行不是\n，而是\r\n
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * 如何实现数据的追加写入?
 * 		FileWriter(String fileName, boolean append)
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		//FileWriter fw = new FileWriter("c.txt");
		FileWriter fw = new FileWriter("c.txt",true); //表示追加写入，默认是false
		
		for(int x=0; x<10; x++) {
			fw.write("hello"+x);
			fw.write("\r\n");
		}
		
		//释放资源
		fw.close();
	}
}
