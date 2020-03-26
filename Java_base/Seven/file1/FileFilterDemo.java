package file1;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 * @author 李泽坤
 *
 */
public class FileFilterDemo {
	public static void main(String[] args) {

		File dir = new File(".");

		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				System.out.println("过滤的项目："+file.getName());
				String fileName = file.getName();
				
				return fileName.endsWith(".txt");
			}			
		};
	
		File subs[] = dir.listFiles(filter);

		for(File sub:subs){
			System.out.println(sub.getName());
		}	
	}
}
