package file4;

import java.io.File;

 /**
  * 删除指定的目录（包含子目录）
  * @author 李泽坤
  */
public class Delete {
	public static void main(String[] args) {
		File f = new File("d:\\a");
		method(f);
	}
	
	//删除指定目录下所有文件和目录
	public static void method(File file) {
		if(file.isDirectory()) {
			//干掉自己所有的子文件和子目录
			//获取所有的子文件和子目录
			File[] files = file.listFiles();
			for (File f : files) {
				if(f.isFile()) {
					System.out.println(f.getName());
					f.delete();
				}
				else if(f.isDirectory()) {
					//继续查看是否还有文件和子目录
					method(f);
				}
			}

			System.out.println(file.getName());
			file.delete();
		}
	}
	
	

	
	
}