package file2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输入输出流
 * @author 李泽坤
 *
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("tetris.png");
		
		FileOutputStream fos = new FileOutputStream("tetris_copy10.png");
		
		// 按字节读写，效率低
		 
//		int d = -1;
//		while((d = fis.read()) != -1){
//			fos.write(d);
//		}
//		
//		System.out.println("复制完毕");
		
		//使用缓存方式读写，效率高
		
		byte[] buf = new byte[1024 * 10];
		int sum = -1;
		long start = System.currentTimeMillis();
		while((sum = fis.read(buf)) > 0){
			fos.write(buf,0,sum);
		}
		
		System.out.println("复制完毕");
		System.out.println("用时："+(double)(System.currentTimeMillis()-start)/1000);
		
		fis.close();
		fos.close();
		
	}
}	
