package file1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 字节数组复制文件
 * @author 李泽坤
 *
 */
public class CopyFile2 {
	public static void main(String[] args) throws IOException{
		File src = new File(File.separator+
							"home"+File.separator+
							"soft01"+File.separator+
							"疯狂JAVA讲义（第2版）.pdf");
		RandomAccessFile srcRaf = new RandomAccessFile(src,"r");
		
		File des = new File("疯狂JAVA讲义5（第2版）.pdf");
		RandomAccessFile desRaf = new RandomAccessFile(des,"rw");
		
		byte[] buf = new byte[1024 * 100000];//10K
		long start = System.currentTimeMillis();
		int sum = -1;
		while((sum = srcRaf.read(buf))>0){
			desRaf.write(buf,0,sum);
		}
		System.out.println("耗时："+(double)(System.currentTimeMillis()-start)/1000);
		
		srcRaf.close();
		desRaf.close();
		
		
		
		
		
		
		
		
	}
}
