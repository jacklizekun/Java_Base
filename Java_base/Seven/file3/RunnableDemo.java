package file3;
/**
 * 独立定义线程体
 * @author 李泽坤
 *
 */
public class RunnableDemo {
	public static void main(String[] args) {
		//实例化要并发执行的任务
		FirstRunnable r1 = new FirstRunnable();
		SecRunnable r2 = new SecRunnable();
		
		Runnable r3 = new Runnable(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是打酱油的");
				}
			}
		};
		
		//实例化线程，并指派任务
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
class FirstRunnable implements Runnable{
	
	public void run(){
		for (int i = 0; i < 10000000; i++) {
			System.out.println("你是谁呀");
		}
	}
}

class SecRunnable implements Runnable{
	
	public void run(){
		for (int i = 0; i < 10000000; i++) {
			System.out.println("我是修水管的");
		}
	}
}