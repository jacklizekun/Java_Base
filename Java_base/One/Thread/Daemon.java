package Thread;
/**
 * 守护线程，或者后台线程，其他线程结束后结束
 * @author 李泽坤
 *
 */
public class Daemon {
	public static void main(String[] args) {
		//前台线程
		Thread kun = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println(i+"坤坤");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("坤坤Over");
			}
		};
		//守护线程
		Thread shuai = new Thread(){
			public void run(){
				while(true){
					System.out.println("帅!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		//后台线程先启动
		shuai.start();
		//设置为守护线程
		//注意这里的守护线程设置方法
		kun.setDaemon(true);
		kun.start();
	}
}
