package file1;

import java.io.File;
import java.io.IOException;

/**
 * 多级目录
 * @author 李泽坤
 *
 */
public class FileMkDirDemo2 {
	public static void main(String[] args) throws IOException {
		// 在当前目录下创建a/b/c/d
		
		File dir = new File(
				"." + File.separator+
				"a" + File.separator+
				"b" + File.separator+
				"c" + File.separator+
				"d"
						);
		if (!dir.exists()) {
			//使用mkdir创建目录，必须保证上级目录要存在
//			dir.mkdir();
			//mkdirs创建目录，会自动将不存在的上级目录创建出来
			dir.mkdirs();
		}
		
		System.out.println("目录创建完毕");
		
		File file = new File(dir,"test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println("文件创建完毕");
	}
}
