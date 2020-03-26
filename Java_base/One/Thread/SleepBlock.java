package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 睡眠阻塞
 * @author 李泽坤
 *
 */
public class SleepBlock {
	public static void main(String[] args) {
		//格式化时间
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		//一直进行
		while(true){
			//1 创建当前系统时间对应的Date对象
			Date now = new Date();
			//2 格式化输出当前系统时间
			System.out.println(format.format(now));
			
			try {
				/**
				 * 多次大量实验
				 * 阻塞一秒钟，可能导致输出时间有跳秒现象
				 * 这是因为阻塞一秒后，当前线程回到了Runnable状态。
				 * 等待分配时间片段，而这段时间是不确定的，也就是误差
				 * 产生的原因，所以，阻塞一秒不表示线程每隔一秒执行一次。
				 */
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
