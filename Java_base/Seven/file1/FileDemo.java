package file1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类
 * @author 李泽坤
 *
 */
public class FileDemo {
	public static void main(String[] args) {
	// File.separator常量，用于解决操作系统间目录分隔符之间的差异。
		/*
		 * 构造方法
		 * File(String path)
		 * 根据指定的路径，创建File对象来描述这个文件或目录
		 */
		File file = new File("."+File.separator+"file.txt");
		/*
		 * String getName()
		 * 获取文件或目录的名字
		 */
		System.out.println("filename:"+file.getName());
		
		/*
		 * 文件大小
		 * long length()
		 */
		System.out.println("length:"+file.length());
		
		/*
		 * 文件最后修改时间
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(file.lastModified());
		System.out.println("lastModified:"+format.format(date));
		
		/*
		 * 获取文件或目录的路径
		 * String getPath()
		 */
		System.out.println("path:"+file.getPath());
		
		/*
		 * 获取文件或目录的绝对路径
		 * String getAbsolutePath()
		 */
		System.out.println("abs_path:"+file.getAbsolutePath());
		
		/*
		 * 获取操作系统标准的绝对路径
		 * 但是该方法需要我们捕获异常
		 * String getConnicalPath()
		 */
		try {
			System.out.println("abs_path2:"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * boolean exits()
		 * 判断文件或目录是否在硬盘上存在
		 */
		System.out.println("是否存在："+file.exists());
		
		/*
		 * boolean isFile()
		 * 判断是否为一个文件
		 */
		System.out.println("是否是文件："+file.isFile());
		
		/*
		 * boolean isDirectory()
		 * 判断是否为一个目录
		 */
		System.out.println("是否是目录："+file.isDirectory());
		
		/*
		 * boolean canRead()
		 * 判断文件是否可读
		 */
		System.out.println("是否可读："+file.canRead());
		
		/*
		 * boolean canWrite()
		 * 判断文件是否可写
		 */
		System.out.println("是否可写："+file.canWrite());
	}
}
