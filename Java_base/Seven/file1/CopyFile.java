package file1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *RandomAccessFile复制文件
 * @author 李泽坤
 *
 */
public class CopyFile {
	public static void main(String[] args) throws IOException{
		File src = new File("O.png");
		RandomAccessFile srcRaf = new RandomAccessFile(src,"r");
		
		File des = new File("O_copy.png");
		RandomAccessFile desRaf = new RandomAccessFile(des,"rw");
		
		//复制工作，就是从源文件中读取字节，写到复制的文件中

		int d = -1;
		while((d = srcRaf.read()) != -1){
			desRaf.write(d);
		}
		srcRaf.close();
		desRaf.close();
		
		
	}
}
