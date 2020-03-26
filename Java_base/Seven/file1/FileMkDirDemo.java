package file1;

import java.io.File;
import java.io.IOException;

/**
 * 文件目录
 * @author 李泽坤
 *
 */
public class FileMkDirDemo {
	public static void main(String[] args) throws IOException {
	
		/*
		 * 创建该对象后，并不代表他描述的目录一定存在
		 * 只是java的一个对象，在内存中存在的
		 * 是否在硬盘上存在，要进行判断
		 */
		File dir = new File("."+File.separator+"mydir");
		if (!dir.exists()) {
			dir.mkdir();
		}
			//输出目录路径
			System.out.println("路径："+dir.getCanonicalPath());
		
	
//		File file = new File("."+File.separator+"mydir"+File.separator+"test.txt");
		
		/*
		 * 重载构造方法
		 * 在指定目录中创建文件或目录
		 * 参数1：描述父目录（上级目录）的File对象
		 * 参数2：当前文件或目录的名字
		 */
		File file = new File(dir,"text.txt");

		if (!file.exists()) {
			
			file.createNewFile();
		}
		System.out.println(file.getCanonicalPath());
		
		
		
		
		
		
		
		
		
		
		
	}
}
