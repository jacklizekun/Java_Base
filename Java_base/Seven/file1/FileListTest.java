package file1;

import java.io.File;
/**
 * 文件名listDirLists
 * @author 李泽坤
 *
 */
public class FileListTest {
	public static void main(String[] args) {
		File dir = new File("F:"+File.separator+"workspaces"+
							File.separator+"jSD_1307_SE02"+
							File.separator+"src");
		listDirLists(dir);
		
	}
	public static void listDirLists(File file){
		if(file.isDirectory()){
			System.out.print("目录：");
		}else
			System.out.print("文件：");
		System.out.println(file.getName());
		if(file.isDirectory()){
			File[] subs = file.listFiles();
			for(File sub:subs){
				listDirLists(sub);
			}
		}
	}
}
