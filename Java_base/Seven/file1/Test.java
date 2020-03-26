package file1;

import java.io.File;
/**
 * File测试
 * @author 李泽坤
 *
 */
public class Test {
	public static void main(String[] args) {
		File file = new File(".");
		printSub(file);
	}
	
	public static void printSub(File file){
		if(file.isDirectory()){
			System.out.print("目录：");
		}else{
			System.out.print("文件：");
		}
		
		System.out.println(file.getName());
		if(file.isDirectory()){
			for(File sub:file.listFiles()){
				printSub(sub);
			}
			
		}
	}
	
}
