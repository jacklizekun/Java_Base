package Time;
	
import java.util.Timer;
import java.util.TimerTask;
/**
 * 内部类实例
 * @author 李泽坤
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.start();
	}

}
//使用内部类实现计划任务
class Dog{
	String name = "旺财";
	public void start(){
		Timer timer = new Timer();
		timer.schedule(new RunTask(), 0, 1000);
	}
	private class RunTask extends TimerTask{

		@Override
		public void run() {
			System.out.println(name+"走一步");
			
		}
		
	}
}