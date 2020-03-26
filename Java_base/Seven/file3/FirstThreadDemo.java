package file3;
/**
 * 同步异步
 * @author 李泽坤
 *
 */
public class FirstThreadDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁阿");
			System.out.println("我是修水管的");
		}
		
		Thread t1 = new FirstThread();
		Thread t2 = new SecThread();
		t1.start();
		t2.start();
		
		/*
		 * 对于线程而言
		 * 程序不可控因素：
		 * 1:CPU分配给线程的时间片段的长短
		 * 2:CPU运行线程的次数
		 */
	}
}

class FirstThread extends Thread{
	public void run(){
		for(int i =0;i<1000;i++){
			System.out.println("你是谁呀？");
		}
	}
}
class SecThread extends Thread{
	public void run(){
		for(int i =0;i<1000;i++){
			System.out.println("我是修水管的");
		}
	}
}

