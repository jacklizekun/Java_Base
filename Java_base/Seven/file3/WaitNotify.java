package file3;
/**
 * 线程方法
 * @author 李泽坤
 *
 */
public class WaitNotify {
	//图片是否下载完毕了
	public static boolean finish = false;
	
	public static void main(String[] args) {	
		//下载图片的线程
		final Thread download = new Thread(){
			public void run(){
				System.out.println("开始下载图片");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("图片下载完毕");
				finish = true;
				synchronized (this) {
					this.notify();
				}
			}
		};
		//显示图片的线程
		Thread show = new Thread(){
			public void run(){
				try {
					synchronized (download) {
						download.wait();
					}					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!finish){
					throw new RuntimeException("显示图片失败！");
				}
				System.out.println("显示图片");
			}
		};
		
		download.start();
		show.start();
	}
}
