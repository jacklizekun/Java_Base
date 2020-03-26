package file2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓存流
 * @author 李泽坤
 *
 */
public class CopyFileDemo2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream(File.separator+"home"+
												  File.separator+"soft01"+
												  File.separator+"workspace"+
												  File.separator+
												"疯狂JAVA讲义（第2版）.pdf");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("疯狂JAVA讲义52（第2版）.pdf");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = -1;
		byte[] buffer = new byte[1024 * 1000];
		long start = System.currentTimeMillis();
		while((d = bis.read(buffer)) != -1){
			bos.write(buffer);
		}
		System.out.println("复制完毕");
		System.out.println("用时："+(double)(System.currentTimeMillis()-start)/1000);
		
		/*
		 * 关闭流的时候，只需要关最外层的高级流即可
		 * 高级流在关闭前，会将它处理的流先关闭后才将自己关闭
		 */
		bis.close();
		bos.close();
		
	}
}
