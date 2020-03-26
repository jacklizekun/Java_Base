package file3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 睡眠阻塞
 * @author 李泽坤
 *
 */
public class SleepBlockDemo {
	public static void main(String[] args) throws InterruptedException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		while(true){
			//输出一次当前系统时间
			System.out.print(format.format(new Date()));
			for (int i = 0; i < 4; i++) {
				System.out.println();
			}
			Thread.sleep(1000);
		}
		
	}
}
