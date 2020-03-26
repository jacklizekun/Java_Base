package Thread;

/**
 * 线程优先级
 * @author 李泽坤
 *
 */
public class Priority {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("A"+i);
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("B"+i);
				}
			}
		};
		
		Thread t3 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("C"+i);
				}
			}
		};
		/**
		 * setPriority(int p)
		 * 设置线程的优先级
		 * MAX_PRIORITY 最高优先级
		 * MIN_PRIORITY	最低优先级
		 * NORM_PRIORITY 正常优先级（默认优先级）
		 */
		//最高优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//优先级高的会运行较多
		t3.start();
		t2.start();
		t1.start();
		System.gc();
		
	}
}
