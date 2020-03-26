package Thread;
/**
 * 线程异常
 * @author 李泽坤
 *
 */
public class HelloThread {
	public static void main(String[] args) {
		Thread t1 = new Person1();
		Thread t2 = new Person2();
		t1.start();
		t2.start();
	}
}

class Person1 extends Thread{
	public void run() {
		for(int i = 0;i < 1000;i++){
			System.out.println("坤坤？");
		}
	}
}

class Person2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("困");
		}
	}
	
}
