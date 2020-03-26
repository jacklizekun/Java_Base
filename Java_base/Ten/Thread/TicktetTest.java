package Thread;
/**
 * 
 * @author 李泽坤
 *
 */
public class TicktetTest {
	public static void main(String[] args) {
		//创建线程对象
		TicketThread tt = new TicketThread();
		
		Thread t = new Thread(tt);
		t.setName("窗口1");
		Thread t2 = new Thread(tt);
		t2.setName("窗口2");
		Thread t3 = new Thread(tt);
		t3.setName("窗口3");
		
		//启动线程对象
		t.start();
		t2.start();
		t3.start();
	}
}
