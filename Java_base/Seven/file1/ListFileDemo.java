package file1;

import java.io.File;

/**
 * 获取目录下所有子项
 * @author 李泽坤
 *
 */
public class ListFileDemo {
	public static void main(String[] args) {
		//输出当前项目根目录下的所有子项
		File dir = new File(".");
		System.out.println("dir:"+dir.getName());
		
		
//		//获取所有子项的名字
//		String sub_names[] = dir.list();
//		for(String sub:sub_names){
//			System.out.println(sub);
//		}
		
		/*
		 * 获取所有子项
		 * 注意，确保File对象描述的是一个目录，再调用
		 * listFiles()方法。
		 */
		File subs[] = dir.listFiles();
		for(File sub:subs){
			if(sub.isFile()){
				System.out.println("文件："+sub.getName());
			}else{
				System.out.println("目录："+sub.getName());
			}
		
		}
		
		
		
		
		
		
		
		
		
	}
}
