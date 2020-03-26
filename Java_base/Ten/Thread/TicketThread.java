package Thread;

/**
 * 
 * @author 李泽坤
 *
 */
public class TicketThread implements Runnable {
	/*
	 * 同步方法:使用关键字synchronized修饰的方法，一旦被一个线程访问，则整个方法全部锁住，其他线程则无法访问
	 * 
	 * synchronized
	 * 注意：
	 * 		非静态同步方法的锁对象是this
	 * 		静态的同步方法的锁对象是当前类的字节码对象
	 */
	static int tickets = 100;// 火车票数量
	Object obj = new Object();

	@Override
	public void run() {
		// 出售火车票
		while (true) {
			/*synchronized (obj) {
				method();
			}*/
			
			//method();
			method2();

		}
	}

	private synchronized void method() {
		if (tickets > 0) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}
	
	
	private static synchronized void method2() {
	
		if (tickets > 0) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}

	

}