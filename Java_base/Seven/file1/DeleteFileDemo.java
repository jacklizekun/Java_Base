package file1;

import java.io.File;

/**
 * 删除文件或目录
 * @author 李泽坤
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
	
		//1 创建File对象用于描述要删除的文件
		File file = new File("."+File.separator+"file.txt");
		
		//2 删除文件
		file.delete();
		System.out.println("删除完毕");
		
		
	}
}
