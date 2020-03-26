package Thread;

/**
 * 等待一个线程执行完毕
 * @author 李泽坤
 *
 */
public class Join {
	public static void main(String[] args) {
		final Thread download = new Thread(){
			public void run(){
				System.out.println("开始下载图片");
				for (int i = 0; i < 101; i++) {
					System.out.println("完成"+i+"%");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				System.out.println("下载过程完毕！");
			}
		};
		
		Thread showImg = new Thread(){
			public void run(){
				System.out.println("等待下载图片线程。。。");
				try {
					/**
					 * join()会产生阻塞，直到download线程结束，才会使阻塞解除，使得showImg线程运行
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("开始显示图片！");
			}
		};
		showImg.start();
		download.start();
	
	}
}
