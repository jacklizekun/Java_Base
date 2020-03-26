package file2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符输出流 PrintWriter
 * @author 李泽坤
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException{
	
//		File file = new File("pw.txt");
//		PrintWriter writer = new PrintWriter(file);
//		writer = new PrintWriter("pw.txt");
		
		FileOutputStream fos = new FileOutputStream("pw.txt");
		PrintWriter writer = new PrintWriter(fos);
		
		writer.println("大家好！");
		writer.println("才是真的好！");
		
		writer.close();
		
		System.out.println("大家好才是真的好！");
		
		
	}
}
