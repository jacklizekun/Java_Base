package Thread;

/**
 * 
 * @author 李泽坤
 *
 */
public class ThreadDemo4 {
	/*
	 * 多线程实现方式2：创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现 run 方法。然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动
	 *
	 *	Thread(Runnable target) 
	 *	static Thread currentThread() :返回当前线程对象
	 *
	 *
	 *	既然有了继承Thread为何还要整出来实现Runnable?
	 */
	public static void main(String[] args) {
		//创建线程实例
		MyThread2 mt = new MyThread2(100);
		Thread t = new Thread(mt);
		t.setName("李四");
		//启动线程
		t.start();
		
		//创建线程实例
		Thread t2 = new Thread(mt);
		t2.setName("老王");
		//启动线程
		t2.start();
	}

	private static void method() {
		//创建线程实例
		MyThread2 mt = new MyThread2(100);
		Thread t = new Thread(mt);
		t.setName("李四");
		//启动线程
		t.start();
		
		//创建线程实例
		MyThread2 mt2 = new MyThread2(200);
		Thread t2 = new Thread(mt2);
		t2.setName("老王");
		//启动线程
		t2.start();
	}

}
