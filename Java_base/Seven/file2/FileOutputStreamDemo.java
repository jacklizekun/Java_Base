package file2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  FileOutputStream
 * 
 * @author 李泽坤
 * 
 */
public class FileOutputStreamDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {
	
		File file = new File("fos.dat");
		FileOutputStream fos = null;
		try {
			/*
			 * FileOutputStream(File file,boolean append)
			 * 重载的构造方法
			 * 当append为true时，通过该输出流写出的数据是追加到file文件末尾的。
			 */
			//fos = new FileOutputStream(file,true);
			fos = new FileOutputStream("fos.dat");
			fos = new FileOutputStream("fos.dat",true);
//			fos.write('A');//写一个字节
//			fos.write('B');
//			int a = 121231231;
//			fos.write(a>>>24);
//			fos.write(a>>>16);
//			fos.write(a>>>8);
//			fos.write(a);
			/*
			 * 对一个文件进行二次写操作时，文件的大小会以
			 * 最后这次写操作总共写的内容为准，会把文件之前
			 * 的数据全部废弃掉。
			 */
			fos.write('C');
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null){
					fos.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
