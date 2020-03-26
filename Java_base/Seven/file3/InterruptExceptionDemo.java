package file3;
/**
 * 中断 睡眠 阻塞
 * @author 李泽坤
 *
 */
public class InterruptExceptionDemo {
	public static void main(String[] args) {
		final Thread lin = new Thread(new Runnable(){
			public void run() {
				System.out.println("林：睡觉了");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢！干嘛呢！都破了相了！");
					
				}	
			}
		});

		Thread huang = new Thread(new Runnable(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("黄：80！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("黄：搞定！");
				//中断第一个线程
				lin.interrupt();
			}
			
		});

		lin.start();
		huang.start();
		
	}
}
