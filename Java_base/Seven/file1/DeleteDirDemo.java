package file1;

import java.io.File;

/**
 * 删除目录
 * 要确保为空目录才可以删除
 * @author 李泽坤
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		//删除项目根目录下的mydir目录
		
		File dir = new File("."+File.separator+"mydir");
		if(dir.delete()){
			System.out.println("删除完毕");
		}else
			System.out.println("删除异常");
		
	}
}
