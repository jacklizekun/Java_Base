package Time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时器及TimerTask定时器任务抽象方法
 * @author 李泽坤
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Timer timer = new Timer();//创建了一个定时器
		
		//schedule:计划
		timer.schedule(new MyTask(), 1000, 1000);
		//被执行的任务，第一次延迟时间，每次的间隔时间
	}
}


class MyTask extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("HI");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}