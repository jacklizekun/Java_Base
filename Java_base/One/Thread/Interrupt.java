package Thread;

/**
 * 中断睡眠阻塞
 * @author 李泽坤
 *
 */
public class Interrupt {
	public static void main(String[] args) {
		final Thread lin = new Thread(new Runnable() {
			public void run() {
				System.out.println("睡觉");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("停止睡眠");
				}
			}
		});

		Thread huang = new Thread(new Runnable() {
			public void run() {
				System.out.println("玩耍");
				for (int i = 0; i < 5; i++) {
					System.out.println("玩耍"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				//中断
				lin.interrupt();
			}
		});

		//中断1的进程，使得1发生异常
		lin.start();
		huang.start();
	}
}
