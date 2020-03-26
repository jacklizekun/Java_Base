package file1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF进行读写操作
 * @author 李泽坤
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException{
		File file = new File("raf.dat");
		//文件不存在会自动创建
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		// 若文件中原来就有内容，则是从文件开始覆盖内容
	
		//输出游标的位置
		System.out.println(raf.getFilePointer());//0
		//写一个int值
		raf.writeInt(11);
		System.out.println(raf.getFilePointer());//4
		
		//写一个double值
		raf.writeDouble(11.11);
		System.out.println(raf.getFilePointer());//12
		
		//写一个char，参数为int：写这个int的低16位
		raf.writeChar('A');
		System.out.println(raf.getFilePointer());//14
		
		//写一个字符串
		//将字符串按照UTF-8编码转换为字节后写出
		raf.writeUTF("我爱北京天安门!");
		System.out.println(raf.getFilePointer());//40
		
		/*
		 * RandomAccessFile是基于游标进行读写操作的, 总是读取或者写入游标指定的位置
		 * 所以，当我们连续写完后，游标指向的就是文件末尾
		 * 这时候试图读取int值，则会引发EOFException, 我们要将游标移动到文件开始后再进行读取。
		 */
		raf.seek(0);//0表示文件的第一个字节（文件开始）
		System.out.println(raf.getFilePointer());//0
		//读取写入的int值
		int i = raf.readInt();
		System.out.println(raf.getFilePointer());//4
		System.out.println("int="+i);
		//读取char
		raf.seek(12);
		char c = raf.readChar();
		System.out.println(c);
		
		//读取字符串
		String str = raf.readUTF();
		System.out.println(str);
		
		//关闭
		raf.close();	
		
	}
}
