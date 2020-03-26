package file2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutputStream
 * @author 李泽坤
 *
 */
public class StreamDemo {
	public static void main(String[] args) throws IOException{
	
		FileOutputStream fos = new FileOutputStream("stream.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeInt(123);
		
		// flush()的作用是将具有缓冲效果的流的缓冲内容做一次强制写出操作。	
//		dos.flush();
		dos.close();
		System.out.println("写出完毕");

		FileInputStream fis = new FileInputStream("stream.dat");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		int i = dis.readInt();
		System.out.println("int="+i);
		
		dis.close();
		
	}
}
