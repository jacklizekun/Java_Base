package Thread;

/**
 * 线程阻塞
 * @author 李泽坤
 *
 */
public class Wait {
	//图片是否下载完毕
	public static boolean finish = false;

	public static void main(String[] args) {
		final Thread download = new Thread(){
			public void run(){
				System.out.println("开始下载图片。。。");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				System.out.println("图片下载完毕！");
				finish = true;
				synchronized (this) {
					//解除阻塞
					this.notify();
				}
				
				System.out.println("开始下载flash。。。");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				System.out.println("flash下载完毕！");
				finish = true;
				synchronized (this) {
					this.notify();
				}
			}
		};
		
		Thread showImg = new Thread(){
			public void run(){
				try {
					/**
					 * wait()阻塞
					 */
					synchronized (download){
						download.wait();
					}
				} catch (InterruptedException e) {
				}
				if(!finish){
					throw new RuntimeException("图片显示失败！");
				}
				System.out.println("开始显示图片。。。");
				synchronized (download){
					try {
						download.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("开始显示flash。。。");
			}
		};
		
		download.start();
		showImg.start();
	}
}
