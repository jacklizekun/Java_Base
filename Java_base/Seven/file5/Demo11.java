package file5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 缓冲流的特殊功能：
 * BufferedWriter
 * 		void newLine():写一个换行符，这个换行符由系统决定
 * BufferedReader
 * 		String readLine():一次读取一行数据，但是不读取换行符
 */
/**
 * 缓冲流
 * @author 李泽坤
 *
 */
public class Demo11 {
	public static void main(String[] args) throws IOException {
		/*
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
		for(int x=0; x<10; x++) {
			bw.write("hello"+x);
			//bw.write("\r\n");
			bw.newLine();
			bw.flush();
		}
		bw.close();
		*/
		
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		
		/*
		String line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		*/
		
		String line;
		//1:br.readLine()
		//2:line=br.readLine()
		//3:line != null
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
	}
}