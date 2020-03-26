package file5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter
 * @author 李泽坤
 *
 */
public class Demo10 {
	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		
		//读写数据
		/*
		//一次读写一个字符
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}
		*/
		
		//一次读写一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}