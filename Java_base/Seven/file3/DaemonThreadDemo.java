package file3;
/**
 * 后台线程
 * @author 李泽坤
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		//rose 前台线程
		Thread rose = new Thread(new Runnable(){
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:AAAAAAaaaaa....扑通");
			}
		});
			
		//Jack 后台线程
		Thread jack = new Thread(new Runnable(){
			public void run() {
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
			}	
		});
		
		rose.start();
		jack.setDaemon(true);//设置为后台线程
		jack.start();
			
	}
}
