package file1;

import java.io.File;
/**
 * File子项
 * @author 李泽坤
 *
 */
public class ListFileDemo2 {
	public static void main(String[] args) {
		File dir = new File(".");
		listFile(dir);
	}
	public static void listFile(File file){
		if(file.isDirectory()){
			System.out.print("目录：");
		}else{
			System.out.print("文件：");
		}
		System.out.println(file.getName());
		if(file.isDirectory()){
			File[] subs =  file.listFiles();
			for(File sub : subs){
				listFile(sub);
			}
		}	
	}
}

