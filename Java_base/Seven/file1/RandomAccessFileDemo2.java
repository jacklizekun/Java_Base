package file1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *  读取文件内容
 * @author 李泽坤
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("raf.dat");
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		//连续读取4个字节，读取之前写入的int值
		/**
		 * num = 0
		 * 00000000 00000000 00000000 00000000
		 * 
		 * i
		 * 00000000 00000000 00000000 01111111
		 */
		int num = 0;//要还原的数字
		
		int i = raf.read();//读取一个字节
		num = num|(i<<24);
		//System.out.println(num);
		i = raf.read();//读取第二个字节
		num = num|(i<<16);
		
		i = raf.read();//读取第三个字节
		num = num|(i<<8);
		
		i = raf.read();//读取第四个字节
		num = num|i;
		
		System.out.println(num == Integer.MAX_VALUE);
		
		//连续读取4个字节返回int值，等同上面的内容
		i = raf.readInt();
		System.out.println(i ==Integer.MAX_VALUE);
		
		long l = raf.readLong();
		System.out.println(l);
		
		raf.close();
	
	}
}
